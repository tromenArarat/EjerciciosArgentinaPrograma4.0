/*

 */

package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.HistorialClinico;
import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.enumeradores.Estado;
import com.cg.servicioSalud.servicios.HistorialClinicoServicio;
import com.cg.servicioSalud.servicios.ProfesionalServicio;
import com.cg.servicioSalud.servicios.TurnoServicio;
import java.text.SimpleDateFormat;
import java.util.Date;
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

@Controller
@RequestMapping("/turno")
public class TurnoControlador {

    @Autowired
    private TurnoServicio turnoServicio;
    @Autowired
    private ProfesionalServicio profesionalServicio;
    @Autowired
    private HistorialClinicoServicio historiaServicio;

    
    
    @GetMapping("/cancelado/{id}")
    public String cancelarTurno(@PathVariable String id, 
            ModelMap modelo, HttpSession session) throws Exception {
       
        HistorialClinico historial = historiaServicio.traePorTurno(id);
        
        historiaServicio.borrarRegistro(historial.getId());
        
        Turno turno = turnoServicio.traeUno(id);
        turnoServicio.cancelarTurno(turno.getId());
        
        Profesional profesional = (Profesional) session.getAttribute("usuariosession");
        List<Turno> turnos = turnoServicio.mostrarTurnosPendientes(profesional.getId());
        
        if (profesional == null) {
        // Handle the case where the Paciente object is not found in the session
        return "redirect:/"; // Redirect to the home page or an error page
        }   
            modelo.addAttribute("profesional",profesional);
            modelo.addAttribute("turnos",turnos);

        
        return "turnos_profesional.html"; 
    }
    
}
