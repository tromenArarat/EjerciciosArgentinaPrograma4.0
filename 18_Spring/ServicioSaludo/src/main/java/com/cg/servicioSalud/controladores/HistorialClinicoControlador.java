/*

 */

package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.HistorialClinico;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.servicios.HistorialClinicoServicio;
import com.cg.servicioSalud.servicios.TurnoServicio;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/historial")
public class HistorialClinicoControlador {
    
    @Autowired
    HistorialClinicoServicio historiaServicio;
    @Autowired
    TurnoServicio turnoServicio;

    @GetMapping("/modificar/{id}")
        public String modificarHistoria(@PathVariable String id, 
                @RequestParam String algo,
                @RequestParam String idTurno,
                HttpSession session,
                ModelMap modelo) throws Exception{
            
            HistorialClinico historialPaciente = historiaServicio.getOne(id);
            
            historiaServicio.registrarAlgo(id, algo);
             turnoServicio.completarTurno(idTurno);
            
            modelo.addAttribute("historial",historialPaciente);
            Profesional profesional = (Profesional) session.getAttribute("usuariosession");
        List<Turno> turnos = turnoServicio.mostrarTurnos(profesional.getId());
        
        if (profesional == null) {
        // Handle the case where the Paciente object is not found in the session
        return "redirect:/"; // Redirect to the home page or an error page
        }   
            modelo.addAttribute("profesional",profesional);
            modelo.addAttribute("turnos",turnos);

        return "turnos_profesional.html";
    }
}
