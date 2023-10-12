/*

 */

package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Usuario;
import com.cg.servicioSalud.repositorios.PacienteRepositorio;
import com.cg.servicioSalud.repositorios.ProfesionalRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;



@Service
@AllArgsConstructor
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    public PacienteServicio pacienteServicio;
    @Autowired
    public ProfesionalServicio profesionalServicio;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

       
        Usuario usuario = new Usuario();
        System.out.println("------------------");
        System.out.println(usuario.getNombreCompleto());
        System.out.println("------------------");
        
        try {
            usuario = (Profesional) profesionalServicio.buscarPorEmail(email);
        System.out.println("------------------");
        System.out.println(usuario.getNombreCompleto());
        System.out.println("------------------");        
        } catch (Exception e) {
            System.out.println("Error e prof: "+ e.getMessage());
            try {
                usuario = (Paciente) pacienteServicio.buscarPorEmail(email);
                System.out.println("------------------");
                System.out.println(usuario.getNombreCompleto());
                System.out.println("------------------");  
            } catch (Exception ex) {
                     System.out.println("Error ex pac: "+ ex.getMessage());
                    throw new UsernameNotFoundException("Usuario no registrado");
                    
                }
            }

            List<GrantedAuthority> permisos = new ArrayList<>();

            GrantedAuthority permiso = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());

            permisos.add(permiso);

            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usuariosession", usuario);

            return new User(usuario.getEmail(), usuario.getClave(), permisos);
    }
}
