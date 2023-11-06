/*

 */

package com.ciart.biblio.isbnapi.servicios;

import com.ciart.biblio.entidades.Editorial;
import com.ciart.biblio.excepciones.MiException;
import com.ciart.biblio.isbnapi.repositorios.EditorialRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServicio {
@Autowired
EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearEditorial(String nombre) throws MiException {

        validar(nombre);

        Editorial editorial = new Editorial();

        editorial.setNombre(nombre);

        editorialRepositorio.save(editorial);
    }

    public Editorial traeUno(String id){
        return editorialRepositorio.findById(id).get();
    }
    
    public Editorial getOne(String id){
    
        return editorialRepositorio.findById(id).get();
    
    }
    
    public List<Editorial> listarEditoriales() {

        List<Editorial> editoriales = new ArrayList();

        editoriales = editorialRepositorio.findAll();

        return editoriales;
    }

    public void modificarEditorial(String nombre, String id) throws MiException {

        validar(nombre);

        Optional<Editorial> respuesta = editorialRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Editorial editorial = respuesta.get();

            editorial.setNombre(nombre);

            editorialRepositorio.save(editorial);

        }

    }

    private void validar(String nombre) throws MiException {

        if (nombre == null) {

            throw new MiException("El nombre no puede estar vacio");

        }
    }
}
