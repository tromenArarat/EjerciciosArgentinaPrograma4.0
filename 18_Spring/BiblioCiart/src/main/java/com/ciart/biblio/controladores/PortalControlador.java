
package com.ciart.biblio.controladores;

import com.ciart.biblio.entidades.Autor;
import com.ciart.biblio.entidades.Editorial;
import com.ciart.biblio.entidades.Libro;
import com.ciart.biblio.excepciones.MiException;
import com.ciart.biblio.servicios.AutorServicio;
import com.ciart.biblio.servicios.EditorialServicio;
import com.ciart.biblio.servicios.LibroServicio;
import com.ciart.biblio.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PortalControlador {
    
        @Autowired
        private EditorialServicio editorialServicio;
        @Autowired
        private AutorServicio autorServicio;
        @Autowired
        private LibroServicio libroServicio;
        @Autowired
        private UsuarioServicio usuarioServicio;
    
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
    
    @GetMapping("/registrar")
    public String registrar(){
        return "registro.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String email, @RequestParam String password,
            @RequestParam String password2, ModelMap modelo) {

        try {
           usuarioServicio.registrar(nombre, email, password, password2);
            
           modelo.put("exito", "Usuario registrado correctamente!");

           List<Autor> autores = autorServicio.listarAutores();
           List<Editorial> editoriales = editorialServicio.listarEditoriales();
           List<Libro> libros = libroServicio.listarLibro();
           modelo.addAttribute("autores",autores);
           modelo.addAttribute("editoriales",editoriales);
           modelo.addAttribute("libros",libros);
            
        } catch (MiException ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);

            return "registro.html";
        }
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
    public String inicio(){
        
        return "inicio.html";
    }
    
}
