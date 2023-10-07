package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Imagen;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.enumeradores.Rol;
import com.cg.servicioSalud.repositorios.ProfesionalRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProfesionalServicio {

    @Autowired
    private ProfesionalRepositorio profesionalRepositorio;
    
    @Autowired
    private ImagenServicio imagenServicio;
    
    @Transactional
    public Profesional crearProfesional(String nombreCompleto, String email, 
            String clave, Long telefono, 
            MultipartFile archivo, 
            String disponibilidad, 
            Boolean obrasSociales, 
            String modalidad, 
            String especialidad, 
            String ubicacion,
            Double tarifa) throws Exception{
       
        //Falta funcion validar
        Profesional profesional = new Profesional();
        profesional.setRol(Rol.ADMIN);
        Imagen imagen = imagenServicio.guardar(archivo);
        profesional.setImagen(imagen);
        profesional.setNombreCompleto(nombreCompleto);
        profesional.setTarifa(tarifa);
        profesional.setDisponibilidad(disponibilidad); 
        profesional.setActivo(Boolean.FALSE);
        profesional.setClave(new BCryptPasswordEncoder().encode(clave));
        profesional.setEspecialidad(especialidad);
        profesional.setFechaAlta(new Date());
        profesional.setModalidad(modalidad);
        profesional.setObrasSociales(obrasSociales);
        profesional.setUbicacion(ubicacion);
        profesional.setTelefono(telefono);
        profesional.setEmail(email);

        profesionalRepositorio.save(profesional);
        return profesional;
    }

    @Transactional
    public void modificarProfesional(String id, String nombreCompleto, String email, 
            String clave, Long telefono, Imagen imagen, 
            Double reputacion, String disponibilidad, 
            Boolean obrasSociales, String modalidad, 
            String especialidad, String ubicacion, 
            Boolean activo, Double tarifa) {

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
    public Profesional getOne(String id){
        return profesionalRepositorio.getOne(id);
    }
    public List<Profesional> listarProfesionales() {
        
        List<Profesional> profesionales = new ArrayList();

        profesionales = profesionalRepositorio.findAll();

        return profesionales;
    }
    
    public List<String> listarEspecialidades(){
        
        List<String> especialidades = new ArrayList();
        
        List<Profesional> profesionales = new ArrayList();

        profesionales = profesionalRepositorio.findAll();
        
        for (Profesional profesionale : profesionales) {
            if(!especialidades.contains(profesionale.getModalidad())){
                especialidades.add(profesionale.getModalidad());
            }
        }
        
        return especialidades;
    }
    
    
    
    // FALTA GETONE
    
}
