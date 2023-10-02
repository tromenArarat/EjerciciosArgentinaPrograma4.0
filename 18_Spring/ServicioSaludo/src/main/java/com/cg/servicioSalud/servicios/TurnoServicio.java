/*

 */

package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.repositorios.ProfesionalRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoServicio {
    
    @Autowired
    private ProfesionalRepositorio profesionalRepositorio;

     public List<String> listarTurnos(String especialidad){
        
        List<String> turnos = new ArrayList();
        
        List<Profesional> profesionales = new ArrayList();

        profesionales = profesionalRepositorio.findAll();
        
        for (Profesional profesionale : profesionales) {
            if(profesionale.getModalidad().equals(especialidad)){
                turnos.add(profesionale.getNombreCompleto().concat(" "+profesionale.getDisponibilidad()));
            }
        }
        
        return turnos;
    }
    
}
