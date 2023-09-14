/*

 */

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
@RequestMapping("/editorial")
public class EditorialControlador {
    @Autowired
    private EditorialServicio editorialServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private LibroServicio libroServicio;
    
    @GetMapping("/registrar")
    public String registrar(ModelMap modelo){
        
        
        return "editorial_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo){
        try {
            
            editorialServicio.crearEditorial(nombre);
            modelo.put("exito","La editorial fue cargado con éxito");
            
           List<Autor> autores = autorServicio.listarAutores();
           List<Editorial> editoriales = editorialServicio.listarEditoriales();
           List<Libro> libros = libroServicio.listarLibro();
           modelo.addAttribute("autores",autores);
           modelo.addAttribute("editoriales",editoriales);
           modelo.addAttribute("libros",libros);
            
        } catch (MiException ex) {
            modelo.put("error",ex.getMessage());
            List<Autor> autores = autorServicio.listarAutores();
            List<Editorial> editoriales = editorialServicio.listarEditoriales();
            List<Libro> libros = libroServicio.listarLibro();
            modelo.addAttribute("autores",autores);
            modelo.addAttribute("editoriales",editoriales);
            modelo.addAttribute("libros",libros);
            return "editorial_form.html";
        }
       return "index.html";
    }
    
    @GetMapping("/lista")
    public String list(ModelMap modelo){
        List<Editorial> editoriales = editorialServicio.listarEditoriales();
        modelo.addAttribute("editoriales", editoriales);
        return "editorial_list.html";
    }
    
    
     @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo){
        modelo.put("editorial",editorialServicio.getOne(id));
        
        return "editorial_modificar.html";
    }
    
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre, ModelMap modelo){
    
        try {
            editorialServicio.modificarEditorial(nombre, id);
            modelo.put("exito","El autor se actualizó con éxito");
            return "redirect:../lista";
                    
        } catch (MiException ex) {
            modelo.put("error",ex.getMessage());
            return "editorial_modificar.html";
        }
    }
    
}
