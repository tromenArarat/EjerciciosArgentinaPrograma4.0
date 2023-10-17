/*

 */

package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.enumeradores.Rol;
import com.cg.servicioSalud.servicios.PacienteServicio;
import com.cg.servicioSalud.servicios.ProfesionalServicio;
import com.cg.servicioSalud.servicios.TurnoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AdminControlador {
    
    @Autowired
    private TurnoServicio turnoServicio;
    @Autowired
    private PacienteServicio pacienteServicio;
    @Autowired
    private ProfesionalServicio profesionalServicio;

    @GetMapping("/dashboard")
    public String panelAdministrativo(ModelMap modelo) {
        List<Profesional> profesionales = profesionalServicio.listarProfesionales();
        modelo.addAttribute("profesionales", profesionales);
        List<Paciente> pacientes = pacienteServicio.listarPacientes();
        modelo.addAttribute("pacientes", pacientes);
        return "panel.html";
        
    }
    
    
    @GetMapping("/roles")
    public String cambiarRol(@RequestParam String id, ModelMap modelo) {
        Profesional profesional = profesionalServicio.getOne(id);
        if(profesional.getRol()==Rol.ADMIN){
            profesional.setRol(Rol.USER);
            profesionalServicio.guardarCambios(profesional);
        }else{
            profesional.setRol(Rol.ADMIN);
            profesionalServicio.guardarCambios(profesional);

        }
        List<Profesional> profesionales = profesionalServicio.listarProfesionales();
        modelo.addAttribute("profesionales", profesionales);
        List<Paciente> pacientes = pacienteServicio.listarPacientes();
        modelo.addAttribute("pacientes", pacientes);
        return "panel.html";
    }
    
}
