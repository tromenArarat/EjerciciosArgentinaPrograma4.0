
package com.ciart.biblio.controladores;

import com.ciart.biblio.entidades.Autor;
import com.ciart.biblio.entidades.Editorial;
import com.ciart.biblio.entidades.Libro;
import com.ciart.biblio.servicios.AutorServicio;
import com.ciart.biblio.servicios.EditorialServicio;
import com.ciart.biblio.servicios.LibroServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador {
    
    @Autowired
        private EditorialServicio editorialServicio;
        @Autowired
        private AutorServicio autorServicio;
        @Autowired
        private LibroServicio libroServicio;
    
    @GetMapping("/")
    public String index(ModelMap modelo){
        
        List<Autor> autores = autorServicio.listarAutores();
           List<Editorial> editoriales = editorialServicio.listarEditoriales();
           List<Libro> libros = libroServicio.listarLibro();
           modelo.addAttribute("autores",autores);
           modelo.addAttribute("editoriales",editoriales);
           modelo.addAttribute("libros",libros);
        
    
        return "index.html";
        
    }
}
