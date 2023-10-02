/*

 */

package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.repositorios.ProfesionalRepositorio;
import java.util.ArrayList;
import java.util.Date;
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
        
        Date fechaActual = new Date();
        
        int dia = fechaActual.getDay();
        
        for (Profesional profesionale : profesionales) {
            if(profesionale.getModalidad().equals(especialidad)){
                
                if(dia==1 && profesionale.getDisponibilidad().equals("Lunes a viernes por la tarde")){
                    if(profesionale.getDisponibilidad().equals("Lunes a viernes por la tarde")){
                       turnos.add(profesionale.getNombreCompleto()+" atiende a la tarde. Querés turno para "+fechaActual+"?");
                    }else if(dia == 1 && profesionale.getDisponibilidad().equals("Lunes a viernes por la mañana")){
                        turnos.add(profesionale.getNombreCompleto()+" atiende a la mañana. Querés turno para "+fechaActual+"?");
                    }
                    
             turnos.add(profesionale.getNombreCompleto()+profesionale.getDisponibilidad());

            }
        }
        
        
    }
        return turnos;
     }
     
}
