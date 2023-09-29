/*

 */
package com.cg.servicioSalud.repositorios;

import com.cg.servicioSalud.entidades.HistorialClinico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialClinicoRepositorio extends JpaRepository<HistorialClinico,String>{
    
}
