
package Servicios;

import Entidades.Guardia;
import Entidades.Profesional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class GuardiasServicios {

    private ArrayList<Guardia> guardias = new ArrayList();
    private ArrayList<Profesional> profesionales = new ArrayList();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private int guardiasAsignadas = 0;

    // Constructor

    public GuardiasServicios() {
    }
    
    
    // Getter y Setter de guardiasAsignadas

    public int getGuardiasAsignadas() {
        return guardiasAsignadas;
    }

    public void setGuardiasAsignadas(int guardiasAsignadas) {
        this.guardiasAsignadas = guardiasAsignadas;
    }

    public ArrayList<Guardia> getGuardias() {
        return guardias;
    }

    public void setGuardias(ArrayList<Guardia> guardias) {
        this.guardias = guardias;
    }

    public ArrayList<Profesional> getProfesionales() {
        return profesionales;
    }

    public void setProfesionales(ArrayList<Profesional> profesionales) {
        this.profesionales = profesionales;
    }


   // Métodos en el orden en que se ejecutan en el mein
    
   // De Guardia
    public void cargarGuardias(){
        String fecha = "2023-06-16";
        LocalDate fechaInicio = LocalDate.parse(fecha);
        guardias.add(new Guardia(1, fechaInicio,'D', null, false, 'V'));
        guardias.add(new Guardia(2, fechaInicio,'N', null, false, 'V'));
        guardias.add(new Guardia(3, fechaInicio,'C', null, false, 'V'));
        guardias.add(new Guardia(4, fechaInicio.plusDays(1),'D', null, true, 'S'));
        guardias.add(new Guardia(5, fechaInicio.plusDays(1),'N', null, true, 'S'));
        guardias.add(new Guardia(6, fechaInicio.plusDays(1),'C', null, true, 'S'));
        guardias.add(new Guardia(7, fechaInicio.plusDays(2),'D', null, true, 'D'));
        guardias.add(new Guardia(8, fechaInicio.plusDays(2),'N', null, true, 'D'));
        guardias.add(new Guardia(9, fechaInicio.plusDays(2),'C', null, true, 'D'));
        guardias.add(new Guardia(10, fechaInicio.plusDays(3), 'D', null, true, 'L'));
        guardias.add(new Guardia(11, fechaInicio.plusDays(3), 'N', null, true, 'L'));
        guardias.add(new Guardia(12, fechaInicio.plusDays(3), 'C', null, true, 'L'));
        guardias.add(new Guardia(13, fechaInicio.plusDays(4), 'D', null, true, 'M'));
        guardias.add(new Guardia(14, fechaInicio.plusDays(4), 'N', null, true, 'M'));
        guardias.add(new Guardia(15, fechaInicio.plusDays(4), 'C', null, true, 'M'));
        guardias.add(new Guardia(16, fechaInicio.plusDays(5), 'D', null, false, 'X'));
        guardias.add(new Guardia(17, fechaInicio.plusDays(5), 'N', null, false, 'X'));
        guardias.add(new Guardia(18, fechaInicio.plusDays(5), 'C', null, false, 'X'));
        guardias.add(new Guardia(19, fechaInicio.plusDays(6), 'D', null, false, 'J'));
        guardias.add(new Guardia(20, fechaInicio.plusDays(6), 'N', null, false, 'J'));
        guardias.add(new Guardia(21, fechaInicio.plusDays(6), 'C', null, false, 'J'));
        guardias.add(new Guardia(22, fechaInicio.plusDays(7), 'D', null, false, 'V'));
        guardias.add(new Guardia(23, fechaInicio.plusDays(7), 'N', null, false, 'V'));
        guardias.add(new Guardia(24, fechaInicio.plusDays(7), 'C', null, false, 'V'));
        guardias.add(new Guardia(25, fechaInicio.plusDays(8), 'D', null, true, 'S'));
        guardias.add(new Guardia(26, fechaInicio.plusDays(8), 'N', null, true, 'S'));
        guardias.add(new Guardia(27, fechaInicio.plusDays(8), 'C', null, true, 'S'));
        guardias.add(new Guardia(28, fechaInicio.plusDays(9), 'D', null, true, 'D'));
        guardias.add(new Guardia(29, fechaInicio.plusDays(9), 'N', null, true, 'D'));
        guardias.add(new Guardia(30, fechaInicio.plusDays(9), 'C', null, true, 'D'));
        guardias.add(new Guardia(31, fechaInicio.plusDays(10), 'D', null, false, 'L'));
        guardias.add(new Guardia(32, fechaInicio.plusDays(10), 'N', null, false, 'L'));
        guardias.add(new Guardia(33, fechaInicio.plusDays(10), 'C', null, false, 'L'));
        guardias.add(new Guardia(34, fechaInicio.plusDays(11), 'D', null, true, 'M'));
        guardias.add(new Guardia(35, fechaInicio.plusDays(11), 'N', null, true, 'M'));
        guardias.add(new Guardia(36, fechaInicio.plusDays(11), 'C', null, true, 'M'));
        guardias.add(new Guardia(37, fechaInicio.plusDays(12), 'D', null, false, 'X'));
        guardias.add(new Guardia(38, fechaInicio.plusDays(12), 'N', null, false, 'X'));
        guardias.add(new Guardia(39, fechaInicio.plusDays(12), 'C', null, false, 'X'));
        guardias.add(new Guardia(40, fechaInicio.plusDays(13), 'D', null, false, 'J'));
        guardias.add(new Guardia(41, fechaInicio.plusDays(13), 'N', null, false, 'J'));
        guardias.add(new Guardia(42, fechaInicio.plusDays(13), 'C', null, false, 'J'));
        guardias.add(new Guardia(43, fechaInicio.plusDays(14), 'D', null, false, 'V'));
        guardias.add(new Guardia(44, fechaInicio.plusDays(14), 'N', null, false, 'V'));
        guardias.add(new Guardia(45, fechaInicio.plusDays(14), 'C', null, false, 'V'));
        guardias.add(new Guardia(46, fechaInicio.plusDays(15), 'D', null, true, 'S'));
        guardias.add(new Guardia(47, fechaInicio.plusDays(15), 'N', null, true, 'S'));
        guardias.add(new Guardia(48, fechaInicio.plusDays(15), 'C', null, true, 'S'));
        guardias.add(new Guardia(49, fechaInicio.plusDays(16), 'D', null, true, 'D'));
        guardias.add(new Guardia(50, fechaInicio.plusDays(16), 'N', null, true, 'D'));
        guardias.add(new Guardia(51, fechaInicio.plusDays(16), 'C', null, true, 'D'));
        guardias.add(new Guardia(52, fechaInicio.plusDays(17), 'D', null, false, 'L'));
        guardias.add(new Guardia(53, fechaInicio.plusDays(17), 'N', null, false, 'L'));
        guardias.add(new Guardia(54, fechaInicio.plusDays(17), 'C', null, false, 'L'));
        guardias.add(new Guardia(55, fechaInicio.plusDays(18), 'D', null, false, 'M'));
        guardias.add(new Guardia(56, fechaInicio.plusDays(18), 'N', null, false, 'M'));
        guardias.add(new Guardia(57, fechaInicio.plusDays(18), 'C', null, false, 'M'));
        guardias.add(new Guardia(58, fechaInicio.plusDays(19), 'D', null, false, 'X'));
        guardias.add(new Guardia(59, fechaInicio.plusDays(19), 'N', null, false, 'X'));
        guardias.add(new Guardia(60, fechaInicio.plusDays(19), 'C', null, false, 'X'));
        guardias.add(new Guardia(61, fechaInicio.plusDays(20), 'D', null, false, 'J'));
        guardias.add(new Guardia(62, fechaInicio.plusDays(20), 'N', null, false, 'J'));
        guardias.add(new Guardia(63, fechaInicio.plusDays(20), 'C', null, false, 'J'));
        guardias.add(new Guardia(64, fechaInicio.plusDays(21), 'D', null, false, 'V'));
        guardias.add(new Guardia(65, fechaInicio.plusDays(21), 'N', null, false, 'V'));
        guardias.add(new Guardia(66, fechaInicio.plusDays(21), 'C', null, false, 'V'));
        guardias.add(new Guardia(67, fechaInicio.plusDays(22), 'D', null, true, 'S'));
        guardias.add(new Guardia(68, fechaInicio.plusDays(22), 'N', null, true, 'S'));
        guardias.add(new Guardia(69, fechaInicio.plusDays(22), 'C', null, true, 'S'));
        guardias.add(new Guardia(70, fechaInicio.plusDays(23), 'D', null, true, 'D'));
        guardias.add(new Guardia(71, fechaInicio.plusDays(23), 'N', null, true, 'D'));
        guardias.add(new Guardia(72, fechaInicio.plusDays(23), 'C', null, true, 'D'));
        guardias.add(new Guardia(73, fechaInicio.plusDays(24), 'D', null, false, 'L'));
        guardias.add(new Guardia(74, fechaInicio.plusDays(24), 'N', null, false, 'L'));
        guardias.add(new Guardia(75, fechaInicio.plusDays(24), 'C', null, false, 'L'));
        guardias.add(new Guardia(76, fechaInicio.plusDays(25), 'D', null, false, 'M'));
        guardias.add(new Guardia(77, fechaInicio.plusDays(25), 'N', null, false, 'M'));
        guardias.add(new Guardia(78, fechaInicio.plusDays(25), 'C', null, false, 'M'));
        guardias.add(new Guardia(79, fechaInicio.plusDays(26), 'D', null, false, 'X'));
        guardias.add(new Guardia(80, fechaInicio.plusDays(26), 'N', null, false, 'X'));
        guardias.add(new Guardia(81, fechaInicio.plusDays(26), 'C', null, false, 'X'));
        guardias.add(new Guardia(82, fechaInicio.plusDays(27), 'D', null, false, 'J'));
        guardias.add(new Guardia(83, fechaInicio.plusDays(27), 'N', null, false, 'J'));
        guardias.add(new Guardia(84, fechaInicio.plusDays(27), 'C', null, false, 'J'));
        guardias.add(new Guardia(85, fechaInicio.plusDays(28), 'D', null, false, 'V'));
        guardias.add(new Guardia(86, fechaInicio.plusDays(28), 'N', null, false, 'V'));
        guardias.add(new Guardia(87, fechaInicio.plusDays(28), 'C', null, false, 'V'));
        guardias.add(new Guardia(88, fechaInicio.plusDays(29), 'D', null, true, 'S'));
        guardias.add(new Guardia(89, fechaInicio.plusDays(29), 'N', null, true, 'S'));
        guardias.add(new Guardia(90, fechaInicio.plusDays(29), 'C', null, true, 'S'));
       
       
    }
    
    // De Profesionales 
    public void cargarProfesionales(){
        String fecha = "2023-07-01";
        String fecha2 = "2023-06-26";
        String fecha3 = "2023-06-16";
        LocalDate fechaLic1 = LocalDate.parse(fecha);
        LocalDate fechaLic2 = LocalDate.parse(fecha2);
        LocalDate fechaLic3 = LocalDate.parse(fecha3);
        
        profesionales.add(new Profesional(1, "Hector", 15, "LMXJVSD","LMXJVSD", "LMXJVSD", fechaLic1, fechaLic1.plusDays(15), 0, 0, 0, 0));
        
        profesionales.add(new Profesional(2, "Maru", 5, "LV","SD", "", fechaLic1.plusDays(30), fechaLic1.plusDays(31), 0, 0, 0, 0));
        
        profesionales.add(new Profesional(3, "Lau S.", 12, "LMXJVSD","MS", "X", fechaLic1.plusDays(30), fechaLic1.plusDays(31), 0, 0, 0, 0));
        
        profesionales.add(new Profesional(4, "Rodo", 12, "LMXJVSD","LMXJVSD", "LMXJVSD", fechaLic2, fechaLic2.plusDays(19), 0, 0, 0, 0));
        
        profesionales.add(new Profesional(5, "Javier", 12, "LMXJSD","LMSD", "LMSD", fechaLic3, fechaLic3.plusDays(5), 0, 0, 0, 0));
        
        profesionales.add(new Profesional(6, "Flor", 12, "LX","LXJVD", "", fechaLic3, fechaLic3.plusDays(6), 0, 0, 0, 0));
        
        profesionales.add(new Profesional(7, "Luisi", 3, "LXJSD","D", "", fechaLic3, fechaLic3.plusDays(14), 0, 0, 0, 0));
        
        profesionales.add(new Profesional(8, "Lucia", 12, "LVSD","LMJSD", "", fechaLic1.plusDays(30), fechaLic1.plusDays(31), 0, 0, 0, 0));
        
        profesionales.add(new Profesional(9, "Lorena", 7, "MVS","", "", fechaLic1.plusDays(30), fechaLic1.plusDays(31), 0, 0, 0, 0));
        
        profesionales.add(new Profesional(10, "Julia", 7, "VSD","MXSD", "VSD", fechaLic1.plusDays(30), fechaLic1.plusDays(31), 0, 0, 0, 0));
        
        profesionales.add(new Profesional(11, "Anto", 2, "LMXJVSD","LMXJVSD", "", fechaLic1.plusDays(30), fechaLic1.plusDays(31), 0, 0, 0, 0));
        
    }
 
    // De Asignación
    public void asignarGuardias24(){
        Collections.shuffle(guardias);
        Iterator it = guardias.iterator();
        while(it.hasNext()){
             Guardia guardia = (Guardia) it.next();
             for (Profesional dotor : profesionales) {
                 /*Las condiciones son:
                 - que la guardia sea centinela, 
                 - que el profesional pueda, 
                 - que tenga menos de 3 asignadas en finde o feriado, 
                 - que tenga menos o igual a 2 de 24 hs, 
                 - que tenga crédito, 
                 - que no sea en su periodo de licencia
                */
                 if(dotor.getCredito()>2&dotor.getGuardiasFinde()<3
                        &dotor.getGuardias24()<=2
                        &(guardia.getFecha().isBefore(dotor.getFechaLicencia())
                        |guardia.getFecha().isAfter(dotor.getFinLicencia()))){                
                
                     if(guardia.getTurno()=='C'){
                    
                            if(dotor.getCentinelaDisp().contains(String.valueOf(guardia.getDia()))){
                                if  (guardia.isFeriado()){
                                    guardia.setProfesional(dotor);
                                    dotor.setGuardiasFinde(dotor.getGuardiasFinde()+2);
                                    dotor.setCredito(dotor.getCredito()-2);
                                    dotor.setGuardiasMes(dotor.getGuardiasMes()+2);
                                    dotor.setGuardias24(dotor.getGuardias24()+1);
                                }else{
                                    guardia.setProfesional(dotor);
                                    dotor.setCredito(dotor.getCredito()-2);
                                    dotor.setGuardiasMes(dotor.getGuardiasMes()+2);
                                    dotor.setGuardias24(dotor.getGuardias24()+1);
                                 }
                            }
                        } 
                 }
            }
        }
        
    }
    
    public void asignarGuardias12Dia(){
        Collections.shuffle(guardias);
        Iterator it = guardias.iterator();
        while(it.hasNext()){
             Guardia guardia = (Guardia) it.next();
        for (Profesional dotor : profesionales) {
            if(dotor.getCredito()>1&dotor.getGuardiasFinde()<3
                        &(guardia.getFecha().isBefore(dotor.getFechaLicencia())
                        |guardia.getFecha().isAfter(dotor.getFinLicencia()))){                
                
                     if(guardia.getTurno()=='D'&guardia.getProfesional()==null){
                    
                            if(dotor.getDiasDisp().contains(String.valueOf(guardia.getDia()))){
                                if  (guardia.isFeriado()){
                                    guardia.setProfesional(dotor);
                                    dotor.setGuardiasFinde(dotor.getGuardiasFinde()+1);
                                    dotor.setCredito(dotor.getCredito()-1);
                                    dotor.setGuardiasMes(dotor.getGuardiasMes()+1);
                                }else{
                                    guardia.setProfesional(dotor);
                                    dotor.setCredito(dotor.getCredito()-1);
                                    dotor.setGuardiasMes(dotor.getGuardiasMes()+1);
                                 }
                            }
                        } 
                 }
            }
        
    }
    }
    
    public void asignarGuardias12Noche(){
        Collections.shuffle(guardias);
        Iterator it = guardias.iterator();
        while(it.hasNext()){
             Guardia guardia = (Guardia) it.next();
        for (Profesional dotor : profesionales) {
            if(dotor.getCredito()>1&dotor.getGuardiasFinde()<3
                        &(guardia.getFecha().isBefore(dotor.getFechaLicencia())
                        |guardia.getFecha().isAfter(dotor.getFinLicencia()))){                
                
                     if(guardia.getTurno()=='N'&guardia.getProfesional()==null){
                    
                            if(dotor.getNochesDisp().contains(String.valueOf(guardia.getDia()))){
                                if  (guardia.isFeriado()){
                                    guardia.setProfesional(dotor);
                                    dotor.setGuardiasFinde(dotor.getGuardiasFinde()+1);
                                    dotor.setCredito(dotor.getCredito()-1);
                                    dotor.setGuardiasMes(dotor.getGuardiasMes()+1);
                                }else{
                                    guardia.setProfesional(dotor);
                                    dotor.setCredito(dotor.getCredito()-1);
                                    dotor.setGuardiasMes(dotor.getGuardiasMes()+1);
                                 }
                            }
                        } 
                 }
            }
        
    }
    }
    
    public void borrarRepes24(){
        
        ArrayList<LocalDate> fechas = new ArrayList();
        
        Collections.sort(guardias, Guardia.ordenarPorDia);
        
        Iterator it = guardias.iterator();
        while(it.hasNext()){
             Guardia guardia = (Guardia) it.next();
             if(guardia.getProfesional()!=null){
                  fechas.add(guardia.getFecha());
             }
        }
        
        Iterator ec = guardias.iterator();
        while(ec.hasNext()){
             Guardia guardiax = (Guardia) ec.next();
             if(fechas.contains(guardiax.getFecha())&(guardiax.getTurno()=='D'|guardiax.getTurno()=='N')){
                  ec.remove();
             }
        }
        
        Iterator et = guardias.iterator();
        while(et.hasNext()){
             Guardia guardiaz = (Guardia) et.next();
             if(guardiaz.getTurno()=='C'&guardiaz.getProfesional()==null){
                  et.remove();
             }
        }
        
        
    }
    
    public void borrarRepes12Dia(){
        ArrayList<LocalDate> fechas = new ArrayList();
        Collections.sort(guardias, Guardia.ordenarPorDia);
        Iterator it = guardias.iterator();
        while(it.hasNext()){
             Guardia guardia = (Guardia) it.next();
             if(guardia.getProfesional()!=null&guardia.getTurno()=='D'){
                  fechas.add(guardia.getFecha());
             }
        }
        
        Iterator ec = guardias.iterator();
        while(ec.hasNext()){
             Guardia guardiax = (Guardia) ec.next();
             if(fechas.contains(guardiax.getFecha())){
                  ec.remove();
             }
        }
        
    }
    
    public void borrarRepes12Noche(){
        
        ArrayList<LocalDate> fechas = new ArrayList();
        
        Collections.sort(guardias, Guardia.ordenarPorDia);
        
        Iterator it = guardias.iterator();
        while(it.hasNext()){
             Guardia guardia = (Guardia) it.next();
             if(guardia.getProfesional()!=null&guardia.getTurno()=='N'){
                  fechas.add(guardia.getFecha());
             }
        }
        
        Iterator ec = guardias.iterator();
        while(ec.hasNext()){
             Guardia guardiax = (Guardia) ec.next();
             if(fechas.contains(guardiax.getFecha())){
                  ec.remove();
             }
        }
        
    }
    
    public void mostrarGuardias(){
        Collections.sort(guardias, Guardia.ordenarPorDia);
        for (Guardia guardia : guardias) {
            if(guardia.getProfesional()!=null){
                System.out.println(guardia.getFecha() + " " + guardia.getFecha().getDayOfWeek() + " " 
                  + "Turno: " + guardia.getTurno() + " "
                  + guardia.getProfesional().getNombre() + " "+ "Crédito: " 
                  + guardia.getProfesional().getCredito() + " Guardias Finde: " 
                  + guardia.getProfesional().getGuardiasFinde() + " Guardias del mes: "
                  + guardia.getProfesional().getGuardiasMes())   ;
            }else{
                System.out.println(guardia.getFecha() + " " + guardia.getFecha().getDayOfWeek() + " "
                + "Turno: " + guardia.getTurno() + " ");
            }
            
                    
            }
        }
    }

    


