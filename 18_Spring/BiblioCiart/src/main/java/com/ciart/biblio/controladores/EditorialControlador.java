/*

 */

package com.ciart.biblio.controladores;

import com.ciart.biblio.entidades.Autor;
import com.ciart.biblio.entidades.Editorial;
import com.ciart.biblio.excepciones.MiException;
import com.ciart.biblio.servicios.AutorServicio;
import com.ciart.biblio.servicios.EditorialServicio;
import com.ciart.biblio.servicios.LibroServicio;
import java.util.List;
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
@RequestMapping("/editorial")
public class EditorialControlador {
    @Autowired
    private EditorialServicio editorialServicio;
    
    @GetMapping("/registrar")
    public String registrar(ModelMap modelo){
        
        
        return "editorial_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo){
        try {
            editorialServicio.crearEditorial(nombre);
            modelo.put("exito","La editorial fue cargado ok");
        } catch (MiException ex) {
            modelo.put("error",ex.getMessage());
            Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null, ex);
            return "editorial_form.html";
        }
       return "index.html";
    }
}
