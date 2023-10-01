package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Imagen;
import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.enumeradores.Rol;
import com.cg.servicioSalud.repositorios.PacienteRepositorio;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class PacienteServicio {
    @Autowired
    private PacienteRepositorio pacienteRepositorio;
    
    @Autowired
    private ImagenServicio imagenServicio;
    
    @Transactional
    public void crearPaciente(String nombreCompleto, String email, 
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
    }
}
