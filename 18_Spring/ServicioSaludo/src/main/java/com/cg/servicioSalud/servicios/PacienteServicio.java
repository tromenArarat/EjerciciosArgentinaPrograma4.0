package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Imagen;
import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.enumeradores.Rol;
import com.cg.servicioSalud.repositorios.PacienteRepositorio;
import java.util.ArrayList;
import java.util.List;
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
public class PacienteServicio implements UserDetailsService {
    @Autowired
    private PacienteRepositorio pacienteRepositorio;
    
    @Autowired
    private ImagenServicio imagenServicio;
    
    @Transactional
    public Paciente crearPaciente(String nombreCompleto, String email, 
            String clave, Long telefono, MultipartFile archivo, 
            String obraSocial) throws Exception{
       
        //Falta funcion validar
        Paciente paciente = new Paciente();
        paciente.setRol(Rol.USER);
        Imagen imagen = imagenServicio.guardar(archivo);
        paciente.setImagen(imagen);
        paciente.setNombreCompleto(nombreCompleto);
        
        paciente.setClave(new BCryptPasswordEncoder().encode(clave));
      
        paciente.setObraSocial(obraSocial);
        paciente.setTelefono(telefono);
        paciente.setEmail(email);

        pacienteRepositorio.save(paciente);
        return paciente;
    }
    
    public Paciente getOne(String id){
        return pacienteRepositorio.getOne(id);
    }
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Paciente paciente = pacienteRepositorio.buscarPorEmail(email);

        if (paciente != null) {

            List<GrantedAuthority> permisos = new ArrayList();

            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + paciente.getRol().toString());

            permisos.add(p);
            
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            
            HttpSession session = attr.getRequest().getSession(true);
            
            session.setAttribute("paciente",paciente);
            

            return new User(paciente.getEmail(), paciente.getClave(), permisos);
        } else {
            return null;
        }
}
}
