/*

 */

package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.servicios.PacienteServicio;
import com.cg.servicioSalud.servicios.ProfesionalServicio;
import com.cg.servicioSalud.servicios.TurnoServicio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping("/registro")
    public String registro(@RequestParam String nombreCompleto, 
            @RequestParam String email,
            @RequestParam String clave,
            @RequestParam Long telefono,
            MultipartFile imagen,
            @RequestParam String obraSocial, ModelMap modelo) {

        try{
            pacienteServicio.crearPaciente(
                    nombreCompleto, email, clave, 
                    telefono, imagen, obraSocial);
            List<String> especialidades = profesionalServicio.listarEspecialidades();
            modelo.addAttribute("especialidades",especialidades);
        
        } catch (Exception ex) {
            System.out.println(ex);
            return "paciente_form.html";
        }
       return "reserva_turno.html";

    }
    
    @GetMapping("/lista/{especialidad}")
    public String turnosDisponibles(@PathVariable String especialidad, ModelMap modelo){
        List<String> turnos = turnoServicio.listarTurnos(especialidad);
        modelo.addAttribute("turnos",turnos);
        return "lista_especialidad.html";
    }
    
    @PostMapping("/lista/{especialidad}")
    public String modificar(@PathVariable String especialidad, ModelMap modelo){
    
        try {
            List<String> turnos = turnoServicio.listarTurnos(especialidad);
            modelo.addAttribute("turnos",turnos);
            return "redirect:../lista";
                    
        } catch (Exception ex) {
            return "index.html";
        }
        
    }
    
}
