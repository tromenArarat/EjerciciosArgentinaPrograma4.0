/*

 */

package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.servicios.TurnoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/turno")
public class TurnoControlador {

    @Autowired
    private TurnoServicio turnoServicio;

    @GetMapping("/confirmado")
    public String registrarTurno(@RequestParam(name = "turno", required = false) Turno turno, ModelMap modelo) throws Exception {
        turnoServicio.confirmarTurno(turno);
        Turno turneli = (Turno) turnoServicio.crearTurno(turno.getFecha(), turno.getPaciente(), turno.getProfesional());
        modelo.addAttribute("turneli",turneli);
        
        return "turno_confirmado.html";
    }
    
}
