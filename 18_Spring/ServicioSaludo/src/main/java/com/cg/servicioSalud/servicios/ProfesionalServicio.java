package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Imagen;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.enumeradores.Rol;
import com.cg.servicioSalud.excepciones.MiException;
import com.cg.servicioSalud.repositorios.ProfesionalRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProfesionalServicio implements UserDetailsService {

    @Autowired
    private ProfesionalRepositorio profesionalRepositorio;
    @Autowired
    private TurnoServicio turnoServicio;
    
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
        validar(nombreCompleto,email,clave,telefono,ubicacion,tarifa);
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
    public void actualizarProfesional(String id, String nombreCompleto, 
            String email, 
            String clave, Long telefono, MultipartFile archivo, String disponibilidad, 
            Boolean obrasSociales, String modalidad, 
            String especialidad, String ubicacion, Double tarifa) throws MiException, Exception {

        validar(nombreCompleto,email,clave,telefono,ubicacion,tarifa);
        
        Optional<Profesional> respuesta = profesionalRepositorio.findById(id);
       
        if (respuesta.isPresent()) {
            
            Profesional profesional = respuesta.get();
            profesional.setRol(Rol.USER);
            Imagen imagen = imagenServicio.guardar(archivo);
            profesional.setImagen(imagen);
            profesional.setNombreCompleto(nombreCompleto);
            profesional.setClave(new BCryptPasswordEncoder().encode(clave));
            
            profesional.setTarifa(tarifa);

            profesional.setDisponibilidad(disponibilidad);

            profesional.setEspecialidad(especialidad);
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
    public Profesional buscarPorEmail(String email){
        return profesionalRepositorio.buscarPorEmail(email);
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
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Profesional profesional = profesionalRepositorio.buscarPorEmail(email);

        if (profesional != null) {

            List<GrantedAuthority> permisos = new ArrayList();

            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + profesional.getRol().toString());

            permisos.add(p);
            
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            
            HttpSession session = attr.getRequest().getSession(true);
            
            session.setAttribute("usuariosession",profesional);
            

            return new User(profesional.getEmail(), profesional.getClave(), permisos);
        } else {
            return null;
        }
}
    @Transactional
    public void modificarReputacion(String id){
        Profesional profesional = getOne(id);
        List<Turno> turnos = (List<Turno>) turnoServicio.mostrarTurnosCompletados(id);
        double suma = 0.0;
        for (Turno turno : turnos) {
            if(turno.getPuntuacion()!=null){
                suma+=turno.getPuntuacion();
            }
        }
        profesional.setReputacion(suma/turnos.size());
        
        profesionalRepositorio.save(profesional);
        
    }
    
    private void validar(String nombreCompleto, String email, String clave, Long telefono, String ubicacion, Double tarifa) throws MiException{
        
        if (nombreCompleto.isEmpty() || nombreCompleto == null) {
           throw new MiException("El nombre no puede ser nulo o estar vacío");
        }
        if (email.isEmpty() || email == null) {
            throw new MiException("El correo electrónico no puede ser nulo o estar vacio");
        }
        if (clave.isEmpty() || clave == null || clave.length() <= 2) {
            throw new MiException("La contraseña no puede estar vacía, y debe tener más de 2 dígitos");
        }
        if (telefono == null) {
            throw new MiException("El teléfono es requisito obligatorio");
        }
        if (ubicacion.isEmpty() || ubicacion == null) {
            throw new MiException("El teléfono es requisito obligatorio");
        }
        if (tarifa == null) {
            throw new MiException("El teléfono es requisito obligatorio");
        }
        
    }
    
}
