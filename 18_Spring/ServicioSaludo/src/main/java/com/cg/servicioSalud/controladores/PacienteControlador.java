/*

 */

package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.servicios.PacienteServicio;
import com.cg.servicioSalud.servicios.ProfesionalServicio;
import com.cg.servicioSalud.servicios.TurnoServicio;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
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
            @RequestParam String obraSocial, ModelMap modelo, HttpSession session) {

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
    
    @GetMapping("/lista")
    public String turnosDisponibles(@RequestParam String especialidad, HttpSession session, ModelMap modelo) throws Exception{
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
    
}
