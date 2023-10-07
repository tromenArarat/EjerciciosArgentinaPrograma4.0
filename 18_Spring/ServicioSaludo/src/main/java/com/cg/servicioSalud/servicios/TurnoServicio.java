/*

 */

package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.repositorios.ProfesionalRepositorio;
import com.cg.servicioSalud.repositorios.TurnoRepositorio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    
     public Turno traeUno(String id){
        return turnoRepositorio.getOne(id);
    }
    
    public Turno registrarMotivo(String id, String motivo)throws Exception{
        Turno turno = traeUno(id);    
        turno.setMotivo(motivo);
            turnoRepositorio.save(turno);
            return turno;
    }
    
    public List<Turno> ordenarTurnosPorTarifa(List<Turno> turnos)throws Exception{
        
        Collections.sort(turnos, Comparator.comparing(turno -> turno.getProfesional().getTarifa()));
        
        return turnos;
    }
    public List<Turno> ordenarTurnosPorReputacion(List<Turno> turnos)throws Exception{
        
        Collections.sort(turnos, Comparator.comparing(turno -> turno.getProfesional().getReputacion()));
        
        return turnos;
    }
    
     public List<Turno> listarTurnos(String especialidad, Paciente paciente) throws Exception{
        
        // este listado va a ser lo que retorne el método
        List<Turno> turnos = new ArrayList();
        
        // acá traigo el listado de profesionales cargados en la BBDD
        List<Profesional> profesionales = new ArrayList();
        profesionales = profesionalRepositorio.findAll();
        
        // Ahora armo un listado de equis cantidad de fechas
        // a partir de la fecha actual
        Date fechaActual = new Date();
        
        // Dias a incrementar
        int incremento = 15;

        // Vector de Date con dimensión incremento
        Date[] calendario = new Date[incremento];

        // lleno el vector con fechas incrementales a partir de la fecha actual
        for (int i = 0; i < incremento; i++) {
            calendario[i] = new Date(fechaActual.getTime() + (i * 24L * 60L * 60L * 1000L)); // Agrega un día en milisegundos
        }
        /*
        Recorro ese calendario desde el día actual hasta el incremento
        Por cada día veo todos los profesionales y pregunto:
            1) ¿coincide su especialidad con la seleccionada por el usuario? 
                Si sí:
            2) ¿la disponibilidad del usuario contiene el dia actual?
        
        // PENDIENTE --> busco turnoPorFecha y compruebo su estado para no dar turnos repetidos
        
            OBJETIVO: Guardo el turno actual con el horario en el que 
                        trabaja el doc y lo sumo al listado
        
        */
        
        for (int i = 0; i < calendario.length; i++) {
             
             // se almacena el valor correspondiente al día actual
             int dia = calendario[i].getDay();
             
             for (Profesional profesional : profesionales) {
                 // modalidad léase especialidad. Quedó mal alojada en la bbdd
               
                 // 1era pregunta:
                 if(profesional.getModalidad().equals(especialidad)){
                     
                     String disponibilidad = profesional.getDisponibilidad();
                     String diaStr = String.valueOf(dia);
                     
                    // 2do pregunta:
                     if(disponibilidad.contains(diaStr)){
                         
                         Turno turno = crearTurno(calendario[i],paciente,profesional);
                         
                         // Acá hay inmersión profunda para sacar el horario
                         
                         String horario = String.valueOf(disponibilidad.indexOf(diaStr)+1);
                         
                         int indice = Integer.parseInt(horario);
                         
                         char horarioChar = disponibilidad.charAt(indice);

                            switch (horarioChar) {
                                case 'm':
                                    horario = "mañana";
                                    break;
                                case 't':
                                    horario = "tarde";
                                    break;
                                case 'n':
                                    horario = "noche";
                                    break;
                                default:
                                    // En caso de que el carácter no sea reconocido
                                    horario = "desconocido";
                                    break;
                            }

                         turno.setHorario(horario);
                         
                         // OBJETIVO
                         turnos.add(turno);
                     }
                 }
             }
             
         }
        
        return turnos;
     }
     
}
