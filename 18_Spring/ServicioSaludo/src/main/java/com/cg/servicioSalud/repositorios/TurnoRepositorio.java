/*

 */
package com.cg.servicioSalud.repositorios;

import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepositorio extends JpaRepository<Turno,String>{
    @Query("SELECT t FROM Turno t WHERE t.profesional.id = :id")
    public List<Turno> buscarPorProfesional(@Param("id") String id);
    @Query("SELECT t FROM Turno t WHERE t.paciente.id = :id")
    public List<Turno> buscarPorPaciente(@Param("id") String id);
    @Query("SELECT t FROM Turno t WHERE t.fecha = :fecha AND t.horario = :horario")
    public Turno buscarPorFechaHorario(@Param("fecha") Date fecha,@Param("horario") String horario);
}
