package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.HistorialClinico;
import com.cg.servicioSalud.entidades.Imagen;
import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.servicios.HistorialClinicoServicio;
import com.cg.servicioSalud.servicios.PacienteServicio;
import com.cg.servicioSalud.servicios.ProfesionalServicio;
import com.cg.servicioSalud.servicios.TurnoServicio;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;



@Controller
@RequestMapping("/profesional")
public class ProfesionalControlador {
    @Autowired
    private ProfesionalServicio profesionalServicio;
    @Autowired
    private TurnoServicio turnoServicio;
    @Autowired
    private PacienteServicio pacienteServicio;
    @Autowired
    private HistorialClinicoServicio historialServicio;

    @GetMapping("/registrar")
    public String registrar() {
        return "profesional_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombreCompleto, 
            @RequestParam String email,
            @RequestParam String clave,
            @RequestParam Long telefono,
            MultipartFile imagen,
            @RequestParam String disponibilidad, 
            @RequestParam Boolean obrasSociales, 
            @RequestParam String modalidad,
            @RequestParam String especialidad, 
            @RequestParam String ubicacion,
            @RequestParam Double tarifa,
            ModelMap modelo,
            HttpSession session,
                @RequestParam(required = false) String lunes, 
                    @RequestParam(required = false) String martes, 
                    @RequestParam(required = false) String miercoles,
                    @RequestParam(required = false) String jueves, 
                    @RequestParam(required = false) String viernes, 
                    @RequestParam(required = false) String sabado, 
                    @RequestParam(required = false) String domingo) {

        try{
            
            disponibilidad = domingo+lunes+martes+miercoles+jueves+viernes+sabado;
            
            Profesional profesional = profesionalServicio.crearProfesional(
                    nombreCompleto, email, clave, 
                    telefono, imagen,
                    disponibilidad, obrasSociales, 
                    especialidad, ubicacion, 
                    modalidad, tarifa);
        
            List<Profesional> profesionales = profesionalServicio.listarProfesionales();
            session.setAttribute("profesional",profesional);
            modelo.addAttribute("profesionales",profesionales);
        } catch (Exception ex) {
            System.out.println(ex);
            return "profesional_form.html";
        }
       return "turnos_profesional.html";

    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String reservarTurno(HttpSession session, ModelMap modelo){
        
        Profesional profesional = (Profesional) session.getAttribute("usuariosession");
        session.setAttribute("profesional",profesional);
        
        List<Turno> turnos = turnoServicio.mostrarTurnosPendientes(profesional.getId());
        List<Turno> turnelis = turnoServicio.mostrarTurnosCompletados(profesional.getId());
        
        modelo.addAttribute("turnos",turnos);
        modelo.addAttribute("turnelis",turnelis);
        
        return "turnos_profesional.html";
    }
    
    @GetMapping("/turnos")
    public String verTurnos(HttpSession session, ModelMap modelo) {
        Profesional profesional = (Profesional) session.getAttribute("usuariosession");
        List<Turno> turnos = turnoServicio.mostrarTurnosPendientes(profesional.getId());
        List<Turno> turnelis = turnoServicio.mostrarTurnosCompletados(profesional.getId());
        
        if (profesional == null) {
        // Handle the case where the Paciente object is not found in the session
        return "redirect:/"; // Redirect to the home page or an error page
        }   
            modelo.addAttribute("profesional",profesional);
            modelo.addAttribute("turnos",turnos);
            modelo.addAttribute("turnelis",turnelis);

        return "turnos_profesional.html";
    }
    
    
    @GetMapping("/checkSession")
    @ResponseBody // This annotation indicates that the method returns plain text
    public String checkSession(HttpSession session) {
        Profesional profesional = (Profesional) session.getAttribute("usuariosession");
        if (profesional != null) {
            return "Profesional object found in session: " + profesional.getNombreCompleto() + profesional.getRol();
        } else {
            return "No Profesional object found in session";
        }
    }
    
    @GetMapping("/historial/{id}")
    public String verHistorial(@PathVariable String id, ModelMap modelo,
        HttpSession session) {
       
            Paciente paciente = (Paciente) pacienteServicio.getOne(id);
            Profesional profesional = (Profesional) session.getAttribute("profesional");
            
            List<HistorialClinico> historialPaciente = historialServicio.listarHistorialPorPaciente(id);
            
            modelo.addAttribute("historial",historialPaciente);
            modelo.addAttribute("paciente",paciente);
            modelo.addAttribute("profesional",profesional);
            
            return "historia_clinica.html";
        
    }
    
    @GetMapping("/historial/modificar/{id}")
        public String modificarHistoria(@PathVariable String id, 
                @RequestParam String idTurno,
                ModelMap modelo) throws Exception{
            
            Paciente paciente = pacienteServicio.getOne(id);
            Turno turno = turnoServicio.traeUno(idTurno);
            
            modelo.addAttribute("paciente",paciente);
            modelo.addAttribute("turno",turno);
            

        return "modificar_historia.html";
    }
        
    @PostMapping("/historial/modificar/{id}")
        public String modificarHistoria(@PathVariable String id,
            @RequestParam String algo,
            @RequestParam String idTurno,
            HttpSession session,
            ModelMap modelo) throws Exception {

        HistorialClinico historialPaciente = historialServicio.traePorTurno(idTurno);

        historialServicio.registrarAlgo(historialPaciente.getId(), algo);
        turnoServicio.completarTurno(idTurno);

        modelo.addAttribute("historial", historialPaciente);
        Profesional profesional = (Profesional) session.getAttribute("usuariosession");
        List<Turno> turnos = turnoServicio.mostrarTurnosPendientes(profesional.getId());
        List<Turno> turnelis = turnoServicio.mostrarTurnosCompletados(profesional.getId());

        if (profesional == null) {
            // Handle the case where the Paciente object is not found in the session
            return "redirect:/"; // Redirect to the home page or an error page
        }
        modelo.addAttribute("profesional", profesional);
        modelo.addAttribute("turnos", turnos);
        modelo.addAttribute("turnelis", turnelis);

        return "turnos_profesional.html";
    }
}


