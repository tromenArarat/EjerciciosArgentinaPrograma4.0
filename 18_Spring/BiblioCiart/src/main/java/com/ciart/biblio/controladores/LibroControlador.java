/*

 */

package com.ciart.biblio.controladores;

import com.ciart.biblio.isbnapi.assembler.VolumeInfoAssembler;
import com.ciart.biblio.isbnapi.modelo.VolumeInfoModel;
import com.ciart.biblio.isbnapi.domain.model.VolumeInfo;
import com.ciart.biblio.isbnapi.domain.service.IsbnService;
import com.ciart.biblio.entidades.Autor;
import com.ciart.biblio.entidades.Editorial;
import com.ciart.biblio.entidades.Imagen;
import com.ciart.biblio.entidades.Libro;
import com.ciart.biblio.excepciones.MiException;
import com.ciart.biblio.isbnapi.servicios.AutorServicio;
import com.ciart.biblio.isbnapi.servicios.EditorialServicio;
import com.ciart.biblio.isbnapi.servicios.LibroServicio;
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
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/libro")
public class LibroControlador {
    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;
    @Autowired
    private IsbnService isbnService;
    @Autowired
    private VolumeInfoAssembler volumeInfoAssembler;
    
    @GetMapping("/registrar")
    public String registrar(ModelMap modelo){
        
           List<Autor> autores = autorServicio.listarAutores();
           List<Editorial> editoriales = editorialServicio.listarEditoriales();
           List<Libro> libros = libroServicio.listarLibro();
           
           modelo.addAttribute("autores",autores);
           modelo.addAttribute("editoriales",editoriales);
           modelo.addAttribute("libros",libros);
           
           return "libro_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam(required=false) String isbn, 
            @RequestParam String titulo,
            @RequestParam(required=false) Integer ejemplares, 
            @RequestParam String tematica,
            @RequestParam String idAutor,
            @RequestParam String idEditorial, ModelMap modelo){
        try {
            libroServicio.crearLibro(isbn,titulo,tematica,ejemplares,idAutor,idEditorial);
            List<Autor> autores = autorServicio.listarAutores();
            List<Editorial> editoriales = editorialServicio.listarEditoriales();
            List<Libro> libros = libroServicio.listarLibro();
            
            modelo.addAttribute("editoriales",editoriales);
            modelo.addAttribute("autores",autores);
            modelo.addAttribute("libros",libros);
            modelo.put("exito","El libro fue cargado ok");
            
        } catch (MiException ex) {
            
            List<Autor> autores = autorServicio.listarAutores();
            List<Editorial> editoriales = editorialServicio.listarEditoriales();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            modelo.put("error", ex.getMessage());

            return "libro_form.html";
        }
       return "index.html";
    }
    
    @GetMapping("/lista")
    public String list(ModelMap modelo){
        List<Libro> libros = libroServicio.listarLibro();
        modelo.addAttribute("libros", libros);
        return "lista.html";
    }
    
    @GetMapping("/modificar/{isbn}")
    public String modificar(@PathVariable String isbn, ModelMap modelo) {
      
        modelo.put("libro", libroServicio.traeUno(isbn));
        
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();
        
        VolumeInfo volume = isbnService.findIsbnManual(isbn);
		VolumeInfoModel libro = (VolumeInfoModel) volumeInfoAssembler.toModel(volume);
                String titulo = libro.getTitle();
               String tematica = libro.getCategories().get(0);
               String descripcion = libro.getDescription();
               
                
        modelo.addAttribute("titulo", titulo);
        modelo.addAttribute("descripcion", descripcion);
        modelo.addAttribute("tematica", tematica);
        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);
        
        return "libro_modificar.html";
    }

    @PostMapping("/modificar/{isbn}")
    public String modificar(@PathVariable String isbn, 
            @RequestParam String titulo, @RequestParam String tematica,
            Integer ejemplares, String idAutor, 
            String idEditorial, ModelMap modelo) {
        try {
            List<Autor> autores = autorServicio.listarAutores();
            List<Editorial> editoriales = editorialServicio.listarEditoriales();
            
            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            libroServicio.modificarLibro(isbn, titulo, tematica, ejemplares,idAutor, idEditorial);
            
            return "redirect:../lista";

        } catch (MiException ex) {
            List<Autor> autores = autorServicio.listarAutores();
            List<Editorial> editoriales = editorialServicio.listarEditoriales();
            
            modelo.put("error", ex.getMessage());
            
            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            
            return "libro_modificar.html";
        }

    }
    
}
