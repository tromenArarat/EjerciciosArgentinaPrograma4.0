package com.cg.servicioSalud.controladores;

import com.cg.servicioSalud.entidades.Imagen;
import com.cg.servicioSalud.servicios.ProfesionalServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



@Controller
@RequestMapping("/profesional")
public class ProfesionalControlador {
    @Autowired
    private ProfesionalServicio profesionalServicio;

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
            @RequestParam Integer tarifa) {

        try{
            profesionalServicio.crearProfesional(
                    nombreCompleto, email, clave, 
                    telefono, imagen,
                    disponibilidad, obrasSociales, 
                    especialidad, ubicacion, 
                    modalidad, tarifa);
        
        } catch (Exception ex) {
            System.out.println(ex);
            return "profesional_form.html";
        }
       return "index.html";

    }

}

