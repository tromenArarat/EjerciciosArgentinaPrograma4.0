/*

 */

package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.HistorialClinico;
import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Profesional;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.enumeradores.Estado;
import com.cg.servicioSalud.excepciones.MiException;
import com.cg.servicioSalud.repositorios.HistorialClinicoRepositorio;
import com.cg.servicioSalud.repositorios.ProfesionalRepositorio;
import com.cg.servicioSalud.repositorios.TurnoRepositorio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoServicio {
    
    @Autowired
    private ProfesionalRepositorio profesionalRepositorio;
    @Autowired
    private TurnoRepositorio turnoRepositorio;
    @Autowired
    private HistorialClinicoServicio historiaServicio;

    
    public Turno crearTurno(Date dia, Paciente paciente, 
            Profesional profesional)throws Exception{
            Turno turno = new Turno();
            turno.setFecha(dia);
            turno.setPaciente(paciente);
            turno.setProfesional(profesional);
            return turno;
    }
    
    @Transactional
    public Turno confirmarTurno(Turno turno)throws Exception{
            turnoRepositorio.save(turno);
            return turno;
    }
    
    public Turno traeUno(String id){
        return turnoRepositorio.getOne(id);
    }
    
    @Transactional
    public Turno registrarMotivo(String id, String motivo)throws Exception{
        Turno turno = traeUno(id);    
        turno.setMotivo(motivo);
            turnoRepositorio.save(turno);
            return turno;
    }
    
    public List<Turno> ordenarTurnosPorTarifa(List<Turno> turnos)throws Exception{
        
        Comparator<Turno> tarifaComparator = Comparator.comparing(turno -> turno.getProfesional().getTarifa());
        Collections.sort(turnos, tarifaComparator.reversed());
        return turnos;
    }
    public List<Turno> ordenarTurnosPorReputacion(List<Turno> turnos)throws Exception{
        
        Comparator<Turno> reputacionComparator = Comparator.comparing(turno -> turno.getProfesional().getReputacion());
        Collections.sort(turnos, reputacionComparator.reversed());
        return turnos;
    }
    
    @Transactional
    public void cancelarTurno(String id){
        turnoRepositorio.deleteById(id);
    }
    
    public Double calcularPrecioFinal(Profesional profesional, Paciente paciente){
        Double precioFinal;
        
        if(profesional.getObrasSociales()==true&&paciente.getObraSocial()!=null){
            precioFinal = profesional.getTarifa()/2;
        }else{
            precioFinal = profesional.getTarifa();
        }
        
        return precioFinal;
    }
    
    public List<Turno> mostrarTurnosPendientes(String idProfesional){
        List<Turno> turnelis = new ArrayList();
        List<Turno> turnos = new ArrayList();
        
        turnelis = turnoRepositorio.findAll();
        
        for (Turno turno : turnelis) {
            if(turno.getProfesional().getId().equalsIgnoreCase(idProfesional)&&turno.getEstado()!=Estado.COMPLETADO){
                turnos.add(turno);
            }
        }
        
        return turnos;
    }
    public List<Turno> mostrarTurnosCompletados(String idProfesional){
        List<Turno> turnelis = new ArrayList();
        List<Turno> turnos = new ArrayList();
        
        turnelis = turnoRepositorio.findAll();
        
        for (Turno turno : turnelis) {
            if(turno.getProfesional().getId().equalsIgnoreCase(idProfesional)&&turno.getEstado()==Estado.COMPLETADO){
                turnos.add(turno);
            }
        }
        
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
        int incremento = 5;

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
             
             // se almacena el valor correspondiente al día en la posición de i
             int dia = calendario[i].getDay();
             
             for (Profesional profesional : profesionales) {
                 // modalidad léase especialidad. Quedó mal alojada en la bbdd
               
                 // 1era pregunta:
                 if(profesional.getModalidad().equals(especialidad)){
                     
                     String disponibilidad = profesional.getDisponibilidad();
                     String diaStr = String.valueOf(dia);
                     
                    // 2do pregunta:
                     if(disponibilidad.contains(diaStr)){
                         
                         Turno turno1 = crearTurno(calendario[i],paciente,profesional);
                         Turno turno2 = crearTurno(calendario[i],paciente,profesional);
                         Turno turno3 = crearTurno(calendario[i],paciente,profesional);
                         Turno turno4 = crearTurno(calendario[i],paciente,profesional);
                         
                         String horario = String.valueOf(disponibilidad.indexOf(diaStr)+1);
                         
                         String horario1 ="";
                         String horario2 ="";
                         String horario3 ="";
                         String horario4="";
                         
                         int indice = Integer.parseInt(horario);
                         
                         char horarioChar = disponibilidad.charAt(indice);

                            switch (horarioChar) {
                                case 'm':
                                    horario1 = "8 a 9";
                                    horario2 = "9 a 10";
                                    horario3 = "10 a 11";
                                    horario4 = "11 a 12";
                                    break;
                                case 't':
                                    horario1 = "15 a 16";
                                    horario2 = "16 a 17";
                                    horario3 = "17 a 18";
                                    horario4 = "18 a 19";
                                    break;
                                case 'n':
                                    horario1 = "19 a 20";
                                    horario2 = "20 a 21";
                                    horario3 = "21 a 22";
                                    horario4 = "22 a 23";
                                    break;
                            }
                            turno1.setHorario(horario1);
                            turno2.setHorario(horario2);
                            turno3.setHorario(horario3);
                            turno4.setHorario(horario4);

                         // OBJETIVO la última pregunta es para chequear que no haya sido dado ya el turno
                         if(buscarPorFechaHorario(turno1.getFecha(),turno1.getHorario())==null){
                             turnos.add(turno1);
                         }else if(buscarPorFechaHorario(turno2.getFecha(),turno2.getHorario())==null){
                             turnos.add(turno2);
                         }else if(buscarPorFechaHorario(turno3.getFecha(),turno3.getHorario())==null){
                             turnos.add(turno3);
                         }else if(buscarPorFechaHorario(turno4.getFecha(),turno4.getHorario())==null){
                             turnos.add(turno4);
                         }
                     }
                 }
             }
             
         }
        
        return turnos;
     }
    @Transactional
    public void completarTurno(String id){
        Turno t = traeUno(id);
        t.setEstado(Estado.COMPLETADO);

        turnoRepositorio.save(t);
    }
    
    public List<Turno> mostrarTurnosPaciente(String idPaciente){
       
        List<Turno> turnelis = new ArrayList();
        List<Turno> turnos = new ArrayList();
        
        turnelis = turnoRepositorio.buscarPorPaciente(idPaciente);
        
        for (Turno turneli : turnelis) {
            if(turneli.getEstado()==Estado.COMPLETADO){
                turnos.add(turneli);
            }
        }
        
        return turnos;
}
    
    // Este método está acá porque se usa en paciente_turnos que solo pasa el atributo turnos desde el model
    public HistorialClinico buscarRegistro(String id) throws Exception {
        HistorialClinico registroHistorial = historiaServicio.traePorTurno(id);
        return registroHistorial;
}
    
    public Turno buscarPorFechaHorario(Date fecha, String horario){
        Turno turno = (Turno) turnoRepositorio.buscarPorFechaHorario(fecha, horario);
        return turno;
    }
     
}
