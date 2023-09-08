/*

 */

package com.ciart.biblio.servicios;

import com.ciart.biblio.entidades.Autor;
import com.ciart.biblio.entidades.Editorial;
import com.ciart.biblio.entidades.Libro;
import com.ciart.biblio.excepciones.MiException;
import com.ciart.biblio.repositorios.AutorRepositorio;
import com.ciart.biblio.repositorios.EditorialRepositorio;
import com.ciart.biblio.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio {
@Autowired
    private LibroRepositorio libroRepositorio;

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer Ejemplares, String idAutor, String idEditorial) throws MiException {

        validar(isbn, titulo, idAutor, idEditorial, Ejemplares);

        Autor autor = autorRepositorio.findById(idAutor).get();

        Editorial editorial = editorialRepositorio.findById(idEditorial).get();

        Libro libro = new Libro();

        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(Ejemplares);
        libro.setAlta(new Date());

        libro.setAutor(autor);

        libro.setEditorial(editorial);

        libroRepositorio.save(libro);

    }

    public List<Libro> listarLibro(){

        List<Libro> libro = new ArrayList<>();
        libro = libroRepositorio.findAll();
        //List<Libro> libro = libroRepositorio.findAll(); PROBAR
        //return libroRepositorio.findAll();
        return libro;
    }

    @Transactional
    public void modificaLibro(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException {

        validar(isbn, titulo, idAutor, idEditorial, ejemplares);

        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> restapuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> restapuestaEditorial = editorialRepositorio.findById(idEditorial);

        Autor autor = new Autor();
        Editorial editorial = new Editorial();

        if (restapuestaAutor.isPresent()) {

            autor = restapuestaAutor.get();

        }
        
        if (restapuestaEditorial.isPresent()) {

            editorial = restapuestaEditorial.get();

        }

        if (respuesta.isPresent()) {

            Libro libro = respuesta.get();

            libro.setTitulo(titulo);

            libro.setAutor(autor);

            libro.setEditorial(editorial);

            libro.setEjemplares(ejemplares);

            libroRepositorio.save(libro);

        }

    }

    private void validar(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException{

        if (isbn == null) {
            throw new MiException("el isbn no puede estar vacio");
        }

        if (ejemplares == null) {
            throw new MiException("los ejemplares no puede estar vacio");
        }

        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("el titulo no puede estar vacio");
        }

        if (idAutor.isEmpty() || idAutor == null) {
            throw new MiException("el autor no puede estar vacio");
        }

        if (idEditorial.isEmpty() || idEditorial == null) {
            throw new MiException("la editorial no puede estar vacio");
        }
    }
}
