/*

 */
package com.cg.servicioSalud.repositorios;

import com.cg.servicioSalud.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepositorio extends JpaRepository<Paciente,String> {
    
}