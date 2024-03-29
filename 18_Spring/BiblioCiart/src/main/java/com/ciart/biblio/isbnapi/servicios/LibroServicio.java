/*

 */

package com.ciart.biblio.isbnapi.servicios;

import com.ciart.biblio.entidades.Autor;
import com.ciart.biblio.entidades.Editorial;
import com.ciart.biblio.entidades.Imagen;
import com.ciart.biblio.entidades.Libro;
import com.ciart.biblio.excepciones.MiException;
import com.ciart.biblio.isbnapi.repositorios.AutorRepositorio;
import com.ciart.biblio.isbnapi.repositorios.EditorialRepositorio;
import com.ciart.biblio.isbnapi.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class LibroServicio {
@Autowired
    private LibroRepositorio libroRepositorio;

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Autowired
    private EditorialRepositorio editorialRepositorio;
    @Autowired
    private ImagenServicio imagenServicio;

    public List<Libro> listarLibro(){

        List<Libro> libro = new ArrayList<>();
        libro = libroRepositorio.findAll();
        return libro;
    }

    @Transactional
    public void crearLibro(String isbn, String titulo, String tematica, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
        
        validar(isbn, titulo,ejemplares,idAutor, idEditorial);
        
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        
        Autor autor = new Autor();
        Editorial editorial= new Editorial();
        
        if(respuestaAutor.isPresent()){
            autor = respuestaAutor.get();
        }
        
        if(respuestaEditorial.isPresent()){
            editorial = respuestaEditorial.get();
        }
      
             Libro libro = new Libro();

             libro.setIsbn(isbn);
             libro.setTitulo(titulo);
             libro.setEjemplares(ejemplares);
             libro.setAlta(new Date());
             libro.setAutor(autor);
             libro.setEditorial(editorial);
             
             
             libro.setTematica(tematica);

             libroRepositorio.save(libro);
         
        
    }
    
    @Transactional
    public void modificarLibro(String isbn, String titulo, String tematica, Integer ejemplares, 
            String idAutor, String idEditorial) throws MiException{
        
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
        
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        
        Autor autor = new Autor();
        Editorial editorial= new Editorial();
        
        if(respuestaAutor.isPresent()){
            
            autor = respuestaAutor.get();
        }
        
        if(respuestaEditorial.isPresent()){
            
            editorial = respuestaEditorial.get();
        }
        
        if(respuesta.isPresent()){
            
            Libro libro = respuesta.get();
            
                     
            libro.setTitulo(titulo);
            
            libro.setEjemplares(ejemplares);
            
            libro.setAutor(autor);
            
            libro.setEditorial(editorial);
             
            libroRepositorio.save(libro);
            
        }
    }

    
     public Libro traeUno(String isbn){
        return libroRepositorio.getOne(isbn);
    }
    
    private void validar(String isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
       
        if(isbn == null){
            throw new MiException("el isbn no puede ser nulo"); //
        }
        if(titulo.isEmpty() || titulo == null){
            throw new MiException("el titulo no puede ser nulo o estar vacio");
        }
       
        if(ejemplares == null){
            throw new MiException("ejemplares no puede ser nulo");
        }
        if(idAutor.isEmpty() || idAutor == null){
            throw new MiException("el Autor no puede ser nulo o estar vacio");
        }
        
        if(idEditorial.isEmpty() || idEditorial == null){
            throw new MiException("La Editorial no puede ser nula o estar vacia");
        }
    }
}
