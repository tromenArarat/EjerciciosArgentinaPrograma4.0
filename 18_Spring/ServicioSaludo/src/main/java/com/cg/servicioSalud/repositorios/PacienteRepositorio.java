/*

 */
package com.cg.servicioSalud.repositorios;

import com.cg.servicioSalud.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepositorio extends JpaRepository<Paciente,String> {
    @Query("SELECT u FROM Paciente u WHERE u.email = :email")
   public Paciente buscarPorEmail(@Param("email")String email);
}