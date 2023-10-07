package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.Imagen;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.servicios.ProfesionalServicio;
import com.cg.servicioSalud.servicios.TurnoServicio;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
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
       return "inicio.html";

    }
    
    @GetMapping("/turnos")
    public String verTurnos(HttpSession session, ModelMap modelo) {
        Profesional profesional = (Profesional) session.getAttribute("profesional");
        List<Turno> turnos = turnoServicio.mostrarTurnos(profesional.getId());
        
        if (profesional == null) {
        // Handle the case where the Paciente object is not found in the session
        return "redirect:/"; // Redirect to the home page or an error page
        }   
            modelo.addAttribute("profesional",profesional);
            modelo.addAttribute("turnos",turnos);

        return "turnos_profesional.html";
    }
    
    
    @GetMapping("/checkSession")
    @ResponseBody // This annotation indicates that the method returns plain text
    public String checkSession(HttpSession session) {
        Profesional profesional = (Profesional) session.getAttribute("profesional");
        if (profesional != null) {
            return "Profesional object found in session: " + profesional.getNombreCompleto();
        } else {
            return "No Profesional object found in session";
        }
    }
    

}


