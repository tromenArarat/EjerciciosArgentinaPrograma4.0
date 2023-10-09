/*

 */
package com.cg.servicioSalud.repositorios;

import com.cg.servicioSalud.entidades.HistorialClinico;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialClinicoRepositorio extends JpaRepository<HistorialClinico,String>{
    @Query("SELECT h FROM HistorialClinico h WHERE h.turno.id = :id")
    HistorialClinico buscarPorTurno(@Param("id") String id);
}
