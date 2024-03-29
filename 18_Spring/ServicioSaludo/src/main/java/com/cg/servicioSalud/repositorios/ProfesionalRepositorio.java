
package com.cg.servicioSalud.repositorios;

import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesionalRepositorio extends JpaRepository<Profesional,String> {
    
    @Query("SELECT u FROM Profesional u WHERE u.email = :email")
    public Profesional buscarPorEmail(@Param("email")String email);
    
//    @Query("SELECT u FROM Profesional u WHERE u.especialidad = :especialidad AND u.activo = true")
//    public List<Profesional> buscarPorEspecialidad(@Param("especialidad") String especialidad);
}
