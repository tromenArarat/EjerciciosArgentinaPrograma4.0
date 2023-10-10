/*

 */

package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.HistorialClinico;
import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.servicios.HistorialClinicoServicio;
import com.cg.servicioSalud.servicios.PacienteServicio;
import com.cg.servicioSalud.servicios.ProfesionalServicio;
import com.cg.servicioSalud.servicios.TurnoServicio;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/paciente")
public class PacienteControlador {
    @Autowired
    private PacienteServicio pacienteServicio;
    @Autowired
    private ProfesionalServicio profesionalServicio;
    @Autowired
    private TurnoServicio turnoServicio;
    @Autowired
    private HistorialClinicoServicio historiaServicio;

    @GetMapping("/registrar")
    public String registrar() {
        return "paciente_form.html";
    }

    @GetMapping("/checkSession")
    @ResponseBody // This annotation indicates that the method returns plain text
    public String checkSession(HttpSession session) {
        Paciente paciente = (Paciente) session.getAttribute("paciente");
        if (paciente != null) {
            return "Paciente object found in session: " + paciente.getNombreCompleto();
        } else {
            return "No Paciente object found in session";
        }
    }
   
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombreCompleto, 
            @RequestParam String email,
            @RequestParam String clave,
            @RequestParam Long telefono,
            MultipartFile imagen,
            @RequestParam String obraSocial, 
            ModelMap modelo, HttpSession session) {

        try{
            Paciente paciente = pacienteServicio.crearPaciente(
                    nombreCompleto, email, clave, 
                    telefono, imagen, obraSocial);
            List<String> especialidades = profesionalServicio.listarEspecialidades();
            session.setAttribute("paciente",paciente);
            modelo.addAttribute("especialidades",especialidades);
        
        } catch (Exception ex) {
            System.out.println(ex);
            return "paciente_form.html";
        }
       return "reserva_turno.html";

    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String reservarTurno(HttpSession session, ModelMap modelo){
        Paciente paciente = (Paciente) session.getAttribute("usuariosession");
        
        session.setAttribute("paciente",paciente);
        List<String> especialidades = profesionalServicio.listarEspecialidades();
        modelo.addAttribute("especialidades",especialidades);
        
        return "reserva_turno.html";
    }
    
    @GetMapping("/lista")
    public String turnosDisponibles(@RequestParam String especialidad,
      HttpSession session, ModelMap modelo) throws Exception{
      Paciente paciente = (Paciente) session.getAttribute("paciente");
      List<Turno> turnos = turnoServicio.listarTurnos(especialidad,paciente);
      
     
      if (paciente == null) {
        // Handle the case where the Paciente object is not found in the session
        return "redirect:/"; // Redirect to the home page or an error page
    }   modelo.addAttribute("paciente",paciente);
        modelo.addAttribute("especialidad",especialidad);
        modelo.addAttribute("turnos",turnos);
        
        return "lista_especialidad.html";
    }
    
    @GetMapping("/listaespecial")
    public String turnosDisponiblesPorTarifa(@RequestParam String especialidad, 
            @RequestParam String listar,
            HttpSession session, ModelMap modelo) throws Exception{
      Paciente paciente = (Paciente) session.getAttribute("paciente");
      List<Turno> turnos = turnoServicio.listarTurnos(especialidad,paciente);
      if(listar.equals("reputacion")){
          turnoServicio.ordenarTurnosPorReputacion(turnos);
      }else if(listar.equals("tarifa")){
          turnoServicio.ordenarTurnosPorTarifa(turnos);
      }
      if (paciente == null) {
        // Handle the case where the Paciente object is not found in the session
        return "redirect:/"; // Redirect to the home page or an error page
    }   modelo.addAttribute("paciente",paciente);
        modelo.addAttribute("especialidad",especialidad);
        modelo.addAttribute("turnos",turnos);
        
        return "lista_especialidad.html";
    }
    
    @GetMapping("/historia/{id}")
        public String verHistoria(@PathVariable String id, @RequestParam String idTurno,
                ModelMap modelo) throws Exception{
            
            turnoServicio.completarTurno(idTurno);
            System.out.println("-+-+-+-+-+-+--+-+-+-+-+-");
            System.out.println(idTurno);
            System.out.println("-------------");
            Paciente paciente = (Paciente) pacienteServicio.getOne(id);
             System.out.println("-+-+-+-+-+-+--+-+-+-+-+-");
            System.out.println("Paciente:"+paciente.getNombreCompleto());
            System.out.println("-------------");
            
            List<HistorialClinico> historialPaciente = historiaServicio.listarHistorialPorPaciente(id);
            
            modelo.addAttribute("historial",historialPaciente);
            modelo.addAttribute("paciente",paciente);
            
            return "historia_clinica.html";
    }
       
   @GetMapping("/misturnos")
   public String mostrarTurnos(HttpSession session,
                ModelMap modelo){
       
       System.out.println("---------------------");
       
       Paciente paciente = (Paciente) session.getAttribute("paciente");
       
       List<Turno> turnos = turnoServicio.mostrarTurnosPaciente(paciente.getId());
       
       if(paciente==null){
           System.out.println("puto");
       }
       
       modelo.addAttribute("turnos",turnos);
       
       System.out.println(turnos);
       
       return "mis_turnos.html";
   }
        
   @GetMapping("/devolucion/{id}")
   public String puntuarProfesional(@PathVariable String id, HttpSession session,
                ModelMap modelo) throws Exception{
       
       Turno turno = turnoServicio.traeUno(id);
       
       modelo.addAttribute("turno",turno);
       
       
       return "devolucion.html";
   }
   
   @GetMapping("/enviardevolucion")
   public String enviarDevolucion(@RequestParam String id, 
           @RequestParam Double devolucion,
           HttpSession session){
       
       Turno turno = turnoServicio.traeUno(id);
       turno.setPuntuacion(devolucion);
       
       profesionalServicio.modificarReputacion(turno.getProfesional().getId());

       Paciente paciente = (Paciente) session.getAttribute("usariosession");
       session.setAttribute("paciente", paciente);
       
       return "mis_turnos.html";
   }
           
           
   
}
