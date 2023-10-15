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
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private PacienteServicio pacienteServicio;
    @Autowired
    private ProfesionalServicio profesionalServicio;
    @Autowired
    private TurnoServicio turnoServicio;
    
    @GetMapping("/")
    public String index(){
        return "index.html";
    }
    
    @GetMapping("/login")
    public String login(@RequestParam(required = false)String error, ModelMap modelo){
        if(error!=null){
            modelo.put("error","Usuario o contraseña inválido");
        }
        return "login.html";
    }
    
    @GetMapping("/inicio")
    public String commonHome(HttpSession session, ModelMap modelo) {
        Object usuario = session.getAttribute("usuariosession");
        if (usuario instanceof Profesional) {
            if(((Profesional) usuario).getRol().equals(Rol.ADMIN)){
                return "redirect:/admin/dashboard";
            }else{
                return "redirect:/profesional/turnos";
            }
            
        } else if (usuario instanceof Paciente) {
            return "redirect:/paciente/inicio";
        
        } else {
            return "redirect:/error";
        }
    }
    
    
}
