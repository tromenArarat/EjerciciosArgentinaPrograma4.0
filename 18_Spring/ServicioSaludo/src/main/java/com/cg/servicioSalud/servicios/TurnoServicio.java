/*

 */

package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.repositorios.ProfesionalRepositorio;
import com.cg.servicioSalud.repositorios.TurnoRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoServicio {
    
    @Autowired
    private ProfesionalRepositorio profesionalRepositorio;
    @Autowired
    private TurnoRepositorio turnoRepositorio;

    
    public Turno crearTurno(Date dia, Paciente paciente, 
            Profesional profesional)throws Exception{
            Turno turno = new Turno();
            turno.setFecha(dia);
            turno.setPaciente(paciente);
            turno.setProfesional(profesional);
            return turno;
    }
    
    public Turno confirmarTurno(Turno turno)throws Exception{
            turnoRepositorio.save(turno);
            return turno;
    }
    
     public List<Turno> listarTurnos(String especialidad, Paciente paciente){
        
        List<Turno> turnos = new ArrayList();
        
        List<Profesional> profesionales = new ArrayList();

        profesionales = profesionalRepositorio.findAll();
        
        Date fechaActual = new Date();
        
        int dia = fechaActual.getDay();
        
        for (Profesional profesionale : profesionales) {
            if(profesionale.getModalidad().equals(especialidad)){
                
                if(dia==2 && profesionale.getDisponibilidad().equals("Lunes a viernes por la tarde")){
                    if(profesionale.getDisponibilidad().equals("Lunes a viernes por la tarde")){
                        Turno turno = new Turno();
                        turno.setFecha(fechaActual);
                        turno.setPaciente(paciente);
                        turno.setProfesional(profesionale);
                        turnos.add(turno);
                    }else if(dia == 2 && profesionale.getDisponibilidad().equals("Lunes a viernes por la mañana")){
                        Turno turno = new Turno();
                        turno.setFecha(fechaActual);
                        turno.setPaciente(paciente);
                        turno.setProfesional(profesionale);
                        turnos.add(turno);
                    }
                    
            }
        }
    }
        return turnos;
     }
     
}
