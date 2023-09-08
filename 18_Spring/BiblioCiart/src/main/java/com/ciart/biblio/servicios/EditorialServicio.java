/*

 */

package com.ciart.biblio.servicios;

import com.ciart.biblio.entidades.Editorial;
import com.ciart.biblio.excepciones.MiException;
import com.ciart.biblio.repositorios.EditorialRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServicio {
@Autowired
    EditorialRepositorio editorialRespositorio;

    @Transactional
    public void crearEditorial(String nombre) throws MiException {

        validar(nombre);

        Editorial editorial = new Editorial();

        editorial.setNombre(nombre);

        editorialRespositorio.save(editorial);
    }

    public List<Editorial> listarEditorial() {

        //probar el otro modo pro WHAAT
        List<Editorial> editoriales = new ArrayList();

        editoriales = editorialRespositorio.findAll();

        return editoriales;
    }

    public void modificarEditorial(String nombre, String id) throws MiException {

        validar(nombre);

        Optional<Editorial> respuesta = editorialRespositorio.findById(id);

        if (respuesta.isPresent()) {

            Editorial editorial = respuesta.get();

            editorial.setNombre(nombre);

            editorialRespositorio.save(editorial);

        }

    }

    private void validar(String nombre) throws MiException {

        if (nombre.isEmpty() || nombre == null) {

            throw new MiException("El nombre no puede estar vacio");

        }
    }
}
