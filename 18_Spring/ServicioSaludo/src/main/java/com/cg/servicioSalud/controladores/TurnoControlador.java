/*

 */

package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.servicios.ProfesionalServicio;
import com.cg.servicioSalud.servicios.TurnoServicio;
import java.text.SimpleDateFormat;
import java.util.Date;
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

@Controller
@RequestMapping("/turno")
public class TurnoControlador {

    @Autowired
    private TurnoServicio turnoServicio;
    @Autowired
    private ProfesionalServicio profesionalServicio;

    // FALTA un requestParam con la fecha del turno seleccionado
    @GetMapping("/confirmado/{id}")
    public String registrarTurno(@PathVariable String id, @RequestParam("fecha") String fechaStr, HttpSession session, ModelMap modelo) throws Exception {
        // Parse the 'fecha' parameter into a Date object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = dateFormat.parse(fechaStr);
        
        Turno turno = new Turno();
        turno.setFecha(fecha);
        Paciente paciente = (Paciente) session.getAttribute("paciente");
        turno.setPaciente(paciente);
        
        Profesional profesional = (Profesional) profesionalServicio.getOne(id);
        System.out.println(id);
        turno.setProfesional(profesional);
        System.out.println(profesional);
        turnoServicio.confirmarTurno(turno);
        
        modelo.addAttribute("turno", turno);
        
        return "turno_confirmado.html";
}
    
}
