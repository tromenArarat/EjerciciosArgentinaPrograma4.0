/*

 */

package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.HistorialClinico;
import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.enumeradores.Estado;
import com.cg.servicioSalud.excepciones.MiException;
import com.cg.servicioSalud.servicios.HistorialClinicoServicio;
import com.cg.servicioSalud.servicios.PacienteServicio;
import com.cg.servicioSalud.servicios.ProfesionalServicio;
import com.cg.servicioSalud.servicios.TurnoServicio;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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

    @PostMapping("/registro")
    public String registro(@RequestParam String nombreCompleto, 
            @RequestParam String email,
            @RequestParam String clave,
            @RequestParam(required = false) Long telefono,
            MultipartFile imagen,
            @RequestParam(required = false) String obraSocial, 
            ModelMap modelo, HttpSession session) throws Exception {

        try{
            Paciente paciente = pacienteServicio.crearPaciente(
                    nombreCompleto, email, clave, 
                    telefono, imagen, obraSocial);
            modelo.put("exito", "Usuario registrado correctamente!");
            List<String> especialidades = profesionalServicio.listarEspecialidades();
            session.setAttribute("paciente",paciente);
            modelo.addAttribute("especialidades",especialidades);
            
            
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            modelo.put("nombreCompleto", nombreCompleto);
            modelo.put("telefono", telefono);
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
        modelo.addAttribute("paciente",paciente);
        
        return "reserva_turno.html";
    }
    
    @GetMapping("/perfil")
    public String perfil(ModelMap modelo,HttpSession session){
        Paciente paciente = (Paciente) session.getAttribute("usuariosession");
         modelo.put("paciente", paciente);
         
        return "paciente_modificar.html";
    }
    
    @PostMapping("/perfil/{id}")
    public String actualizar(@PathVariable String id, @RequestParam String nombreCompleto, 
            @RequestParam String email,
            @RequestParam String clave,
            @RequestParam(required = false) Long telefono,
            MultipartFile imagen,
            @RequestParam(required = false) String obraSocial, 
            ModelMap modelo, HttpSession session) throws Exception {

        try{
            pacienteServicio.actualizarPaciente(
                    id, nombreCompleto, email, clave, 
                    telefono, imagen, obraSocial);
            modelo.put("exito", "Usuario actualizado correctamente!");
            List<String> especialidades = profesionalServicio.listarEspecialidades();
            Paciente paciente = (Paciente) session.getAttribute("usuariosession");
            modelo.addAttribute("especialidades",especialidades);
            modelo.addAttribute("paciente",paciente);
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            modelo.put("nombreCompleto", nombreCompleto);
            modelo.put("telefono", telefono);
            return "paciente_form.html";
        }
       return "reserva_turno.html";
    }
    
    @GetMapping("/lista")
    public String turnosDisponibles(@RequestParam String especialidad,
      HttpSession session, ModelMap modelo) throws Exception{
      Paciente paciente = (Paciente) session.getAttribute("usuariosession");
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
      }else if(listar.equals("fecha")){
          turnoServicio.ordenarTurnosPorFecha(turnos);
      }
      if (paciente == null) {
        // Handle the case where the Paciente object is not found in the session
        return "redirect:/"; // Redirect to the home page or an error page
    }   modelo.addAttribute("paciente",paciente);
        modelo.addAttribute("especialidad",especialidad);
        modelo.addAttribute("turnos",turnos);
        
        return "lista_especialidad.html";
    }
    
    @GetMapping("/confirmado/{id}")
    public String registrarTurno(@PathVariable String id, 
            @RequestParam("fecha") String fechaStr,
            @RequestParam("horario") String horario,
            HttpSession session, 
            ModelMap modelo) throws Exception {
        // Parse the 'fecha' parameter into a Date object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = dateFormat.parse(fechaStr);

        Turno turno = new Turno();
                
        turno.setFecha(fecha);
        
        turno.setEstado(Estado.PENDIENTE);
        
        Paciente paciente = (Paciente) session.getAttribute("paciente");
        turno.setPaciente(paciente);
        
        turno.setHorario(horario);

        Profesional profesional = (Profesional) profesionalServicio.getOne(id);
        turno.setProfesional(profesional);
        
        turno.setPrecioFinal(turnoServicio.calcularPrecioFinal(profesional,paciente));
        
        turnoServicio.confirmarTurno(turno);
        
        modelo.addAttribute("turno", turno);
        modelo.addAttribute("paciente", paciente);

        return "turno_confirmado.html";
    }
    
    @GetMapping("/reserva/{id}")
    public String procesarPeticion(@PathVariable String id,
            @RequestParam String motivo, ModelMap modelo, HttpSession session) throws Exception {
        
       Paciente paciente = (Paciente) session.getAttribute("paciente");

        modelo.addAttribute("paciente", paciente);
        
        turnoServicio.registrarMotivo(id, motivo);
        
        return "turno_ficha_paciente.html"; 
    }
    
   @GetMapping("/misturnos")
   public String mostrarTurnos(HttpSession session,
                ModelMap modelo){
       
       Paciente paciente = (Paciente) session.getAttribute("paciente");
       
       List<Turno> turnos = turnoServicio.mostrarTurnosPaciente(paciente.getId());
      
       modelo.addAttribute("turnos",turnos);
       modelo.addAttribute("paciente",paciente);
       
       return "paciente_turnos.html";
   }
        
   @GetMapping("/devolucion/{id}")
   public String puntuarProfesional(@PathVariable String id, HttpSession session,
                ModelMap modelo) throws Exception{
       
       Turno turno = turnoServicio.traeUno(id);
       
       Paciente paciente = (Paciente) session.getAttribute("usuariosession");
       
       modelo.addAttribute("turno",turno);
       modelo.addAttribute("paciente",paciente);
       
       return "devolucion.html";
   }
   
   @GetMapping("/enviardevolucion")
   public String enviarDevolucion(@RequestParam String id, 
           @RequestParam Double devolucion, ModelMap modelo,
           HttpSession session){
       
       Turno turno = turnoServicio.traeUno(id);
       turno.setPuntuacion(devolucion);
       
       profesionalServicio.modificarReputacion(turno.getProfesional().getId());

       Paciente paciente = (Paciente) session.getAttribute("usuariosession");
       
       List<Turno> turnos = turnoServicio.mostrarTurnosPaciente(paciente.getId());
       modelo.addAttribute("turnos", turnos);
       modelo.addAttribute("paciente",paciente);

       
       return "paciente_turnos.html";
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
    }

    
