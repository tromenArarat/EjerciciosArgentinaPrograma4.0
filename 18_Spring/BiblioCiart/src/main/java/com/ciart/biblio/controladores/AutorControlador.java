
package com.ciart.biblio.controladores;

import com.ciart.biblio.entidades.Autor;
import com.ciart.biblio.entidades.Editorial;
import com.ciart.biblio.entidades.Libro;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor")
public class AutorControlador {
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;
    @Autowired
    private LibroServicio libroServicio;

    @GetMapping("/registrar")
    public String registrar() {

        return "autor_form.html";

    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo){
        try {

            autorServicio.crearAutor(nombre);
            modelo.put("exito","El autor fue cargado bien");
            
           List<Autor> autores = autorServicio.listarAutores();
           List<Editorial> editoriales = editorialServicio.listarEditoriales();
           List<Libro> libros = libroServicio.listarLibro();
           modelo.addAttribute("autores",autores);
           modelo.addAttribute("editoriales",editoriales);
           modelo.addAttribute("libros",libros);
            
            
        } catch ( MiException e) {
           
            modelo.put("error",e.getMessage());
            Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null, e);
            return "autor_form.html";
        }

        return "index.html";

        //System.out.println("nombre "+ nombre);
       // return "autor_form";

    }
    @GetMapping("/lista")
    public String list(ModelMap modelo){
        List<Autor> autores = autorServicio.listarAutores();
        modelo.addAttribute("autores", autores);
        return "autor_list.html";
    }
    
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo){
        modelo.put("autor",autorServicio.traeUno(id));
        return "autor_modificar.html";
    }
    
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre, ModelMap modelo){
    
        try {
            autorServicio.modificarAutor(nombre, id);
            modelo.put("exito","El autor se actualizó con éxito");
            return "redirect:../lista";
                    
        } catch (MiException ex) {
            modelo.put("error",ex.getMessage());
            return "autor_modificar.html";
        }
        
    }
    
    
}
    

