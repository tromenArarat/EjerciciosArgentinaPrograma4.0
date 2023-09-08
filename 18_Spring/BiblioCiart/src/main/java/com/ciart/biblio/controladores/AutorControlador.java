
package com.ciart.biblio.controladores;

import com.ciart.biblio.excepciones.MiException;
import com.ciart.biblio.servicios.AutorServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor")
public class AutorControlador {
    @Autowired
    private AutorServicio autorServicio;

    @GetMapping("/registrar")
    public String registrar() {

        return "autor_form.html";

    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo){
        try {

            autorServicio.crearAutor(nombre);
            modelo.put("exito","El autor fue cargado ok");
        } catch ( MiException e) {
           
            modelo.put("error",e.getMessage());
            Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null, e);
            return "autor_form.html";
        }

        return "index.html";

        //System.out.println("nombre "+ nombre);
       // return "autor_form";

    }
}
