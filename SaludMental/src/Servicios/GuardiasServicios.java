
package Servicios;

import Entidades.Fecha;
import Entidades.Dia;
import Entidades.Doctor;
import Entidades.Guardia;
import Entidades.Mes;
import Entidades.Turno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class GuardiasServicios {

    private ArrayList<Guardia> guardias = new ArrayList();
    private ArrayList<Doctor> doctores = new ArrayList();
    private ArrayList<Fecha> calendario = new ArrayList();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private int guardiasAsignadas = 0;

    // Constructor
    public GuardiasServicios() {
        guardias = new ArrayList<>();
        doctores = new ArrayList<>();
        calendario = new ArrayList<>();
        this.guardiasAsignadas = 0;
    }
    
    // Getter y Setter de guardiasAsignadas

    public int getGuardiasAsignadas() {
        return guardiasAsignadas;
    }

    public void setGuardiasAsignadas(int guardiasAsignadas) {
        this.guardiasAsignadas = guardiasAsignadas;
    }
    
    
    // Métodos

    public void agregarGuardia(Guardia guardia) {
        guardias.add(guardia);
    }
    
    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }
    
    public void setearTotalGuardiasPorDr(int cantidad){
        for (Doctor doctore : doctores) {
            doctore.setCreditoParaGuardias(cantidad);
        }
    }

    public void cargarMes(){
        
        System.out.println("AÑO:");
        int anio = sc.nextInt();
        System.out.println("");
        
        System.out.println("MES DEL AÑO:");
        for (Mes mes : Mes.values()) {
            System.out.println(mes);
        }
        String mes = sc.next();
        Mes mesEnCurso = Mes.valueOf(mes);
        System.out.println("");
        
        System.out.println("PRIMER DIA DEL MES:");
        for (Dia dia : Dia.values()) {
            System.out.println(dia);
        }
        String dia = sc.next();
        Dia primerDiaDelMes = Dia.valueOf(dia);
        System.out.println("");
        
        System.out.println("CUÁNTOS DIAS TIENE EL MES");
        int diasMes = sc.nextInt();
        
        Dia siguiente = primerDiaDelMes;
        for (int i = 1; i < diasMes+1; i++) {
             calendario.add(new Fecha(siguiente,mesEnCurso,anio,i));
             siguiente = siguiente.next();
            }
        System.out.println("");
        
    }
    
    public void mostrarMes(){
        for (Fecha dia : calendario) {
            System.out.println(dia.getDia()+" "+dia.getNum());
        }
    }
    
    public void cargarGuardias(){
        for (Fecha fecha : calendario) {
            guardias.add(new Guardia(fecha,Turno.DIA));
            guardias.add(new Guardia(fecha,Turno.NOCHE));
        }
    };
    
    public void mostrarGuardias(){
        for (Guardia guardia : guardias) {
            System.out.println(guardia.getFecha().getDia()+" "+guardia.getFecha().getNum());
        }
    }
    
    public void cargarDocs(){
        
        boolean noche = false;
        boolean centinela = false;
        
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("¿Trabaja de noche? (true/false)");
        noche = sc.nextBoolean();
        
        if(noche){
            System.out.println("¿Hace guardias de 24 hs?");
            centinela = sc.nextBoolean();
        }else{
            centinela = false;
        }
        
        String rta;
        ArrayList<Dia> diasDisponibles = new ArrayList();
        do{
            System.out.println("¿Qué días trabaja? (LUNES/MARTES...)");
            String dia = sc.next();
            diasDisponibles.add(Dia.valueOf(dia));
            System.out.println("¿Cargar otro día? (si/no)");
            rta = sc.next();
        }while(rta.equals("si"));
        doctores.add(new Doctor(nombre,noche,centinela,diasDisponibles));
    }
    
    public void mostrarDocs(){
        for (Doctor doctor : doctores) {
            System.out.println(doctor.toString());
        }
    }
    
    public void asignarGuardia24(){
               
        /*
        Asignar guardia completa a doctor 
        */
       
        // Mezclar los doctores for fairness
        Collections.shuffle(doctores); 
        
        // Ordenar guardias for lógica
        Collections.sort(guardias,Guardia.ordenarPorNumDia);
        
        Iterator it = guardias.iterator();
        int contador=1;
        for (Doctor dotor : doctores) {
            while(it.hasNext()&dotor.getCreditoParaGuardias()>1&contador<3){
                Guardia guardia = (Guardia) it.next();
                if(dotor.getDiasDisponibles().contains(guardia.getFecha().getDia())&dotor.isTrabaja24()){
                    asignarGuardiaDoctor(dotor, guardia);
                    it.remove();
                    dotor.setCreditoParaGuardias(dotor.getCreditoParaGuardias()-2);
                    dotor.setGuardias24Asignadas(dotor.getGuardias24Asignadas()+1);
                    contador++;
                }
            }
            
        }
    }
    
    public void asignarGuardiasDerechos() {
        
        /*
        Asignar guardias a doctor. Aplica los filtros de 
            - tengaCrédito, 
            - coincidaConDisponibilidadDeLaGuardia
                y 
                  - Si la guardia es de DIA o el doc trabaja de noche
                    Esto contempla Guardia DIA Trabaja FALSE
                                   Guardia NOCHE Trabaja TRUE
                                   Guardia DIA Trabaja TRUE
                        solo es falso y entra y el if no se cumple, se pasa a la siguiente iteración de guardias
                        
                  - O si la guardia es de NOCHE y el doc la labura.
                                    GUARDIA NOCHE Trabaja False
        
       Falta aplicar filtro de límiteSemanal
       */
        
        // Mezclar los doctores for fairness
        Collections.shuffle(doctores);
                
        // Mezclar las guardias for fairness
        Collections.shuffle(guardias);
        
        
       
        Iterator bucle = guardias.iterator();
        for (Doctor doctor : doctores) {
           while(bucle.hasNext()&doctor.getCreditoParaGuardias()>0){
                Guardia guardia = (Guardia) bucle.next();
                if(doctor.getDiasDisponibles().contains(guardia.getFecha().getDia())&
                        (guardia.getTurno()==Turno.DIA || doctor.isTrabajaNoche())){
                    asignarGuardiaDoctor(doctor, guardia);
                    bucle.remove();
                    doctor.setCreditoParaGuardias(doctor.getCreditoParaGuardias()-1);
                    doctor.setGuardias12Asignadas(doctor.getGuardias12Asignadas()+1);
                    guardiasAsignadas++;
                }
                
            }
            
        }
       

        
        
    }

    public void asignarGuardiaDoctor(Doctor doctor, Guardia guardia) {
        doctor.getGuardias().add(guardia);
}
    
    public void mostrarDiasDisponiblessDr(Doctor doc){
        System.out.println(doc.getDiasDisponibles());
    }
    
    public void mostrarGuardiasAsignadasDocs(){
        for (Doctor doctore : doctores) {
            System.out.println(doctore.getNombre());
            for (Guardia guardia : doctore.getGuardias()) {
                System.out.println(guardia.getFecha().getDia()+
                        " "+guardia.getFecha().getNum()+
                        " "+guardia.getTurno());
            }
        }
    }

    

    
}

