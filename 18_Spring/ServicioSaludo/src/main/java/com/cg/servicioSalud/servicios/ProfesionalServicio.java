package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Imagen;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.enumeradores.Rol;
import com.cg.servicioSalud.repositorios.ProfesionalRepositorio;
import java.util.Date;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesionalServicio {

    @Autowired
    private ProfesionalRepositorio profesionalRepositorio;
    
    
    @Transactional
    public void crearProfesional(String nombreCompleto, String email, 
            String clave, Long telefono, Imagen imagen, 
            String disponibilidad, 
            String obrasSociales, String modalidad, 
            String especialidad, String ubicacion,
            Integer tarifa){
       
        //Falta funcion validar
        Profesional profesional = new Profesional();
        profesional.setImagen(imagen);
        profesional.setNombreCompleto(nombreCompleto);
        profesional.setTarifa(tarifa);
        profesional.setDisponibilidad(disponibilidad); 
        profesional.setActivo(Boolean.FALSE);
        profesional.setClave(clave);
        profesional.setEspecialidad(especialidad);
        profesional.setFechaAlta(new Date());
        profesional.setModalidad(modalidad);
        profesional.setObrasSociales(obrasSociales);
        profesional.setUbicacion(ubicacion);
        profesional.setTelefono(telefono);
        profesional.setEmail(email);

        profesionalRepositorio.save(profesional);
    }

    @Transactional
    public void modificarProfesional(String id, String nombreCompleto, String email, 
            String clave, Long telefono, Imagen imagen, 
            Double reputacion, String disponibilidad, 
            String obrasSociales, String modalidad, 
            String especialidad, String ubicacion, 
            Boolean activo, Integer tarifa) {

        //funcion validar
        
        Optional<Profesional> respuesta = profesionalRepositorio.findById(id);
       
        if (respuesta.isPresent()) {

            Profesional profesional = respuesta.get();
            profesional.setImagen(imagen);
            profesional.setNombreCompleto(nombreCompleto);
            profesional.setTarifa(tarifa);

            profesional.setDisponibilidad(disponibilidad);

            profesional.setActivo(Boolean.FALSE);
            profesional.setClave(clave);
            profesional.setEspecialidad(especialidad);
            profesional.setFechaAlta(new Date());
            profesional.setReputacion(reputacion);
            profesional.setModalidad(modalidad);
            profesional.setObrasSociales(obrasSociales);
            profesional.setUbicacion(ubicacion);
            profesional.setTelefono(telefono);
            profesional.setEmail(email);

            profesionalRepositorio.save(profesional);
        }
    }
    
    // FALTA GETONE
    
}
