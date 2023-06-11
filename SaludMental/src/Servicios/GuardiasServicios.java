
package Servicios;

import Entidades.Fecha;
import Entidades.Dia;
import Entidades.Doctor;
import Entidades.Guardia;
import Entidades.Mes;
import Entidades.Turno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GuardiasServicios {

    private ArrayList<Guardia> guardias = new ArrayList();
    private ArrayList<Doctor> doctores = new ArrayList();
    private ArrayList<Fecha> calendario = new ArrayList();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public GuardiasServicios() {
        guardias = new ArrayList<>();
        doctores = new ArrayList<>();
        calendario = new ArrayList<>();
    }

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
    
    public void asignarGuardias() {
        
        // Mezclar los doctores y las guardias for fairness
        Collections.shuffle(doctores);
        Collections.shuffle(guardias);
        
       // Asignar guardias a doctor
        for (Doctor doctor : doctores) {
            for (Guardia guardia : guardias) {
                if(doctor.getCreditoParaGuardias() > 0 ){
                asignarGuardiaDoctor(doctor, guardia);
                doctor.setCreditoParaGuardias(doctor.getCreditoParaGuardias()-1);
                
                // ESTO ME ESTÄ DANDO PROBLEMAS                guardias.remove(guardia);
                }
            }
        }
       

        // Asignar guardia completa a doctor. Ordeno primero
        
        Collections.sort(guardias,Guardia.ordenarPorNumDia);
        


    }

private void asignarGuardiaDoctor(Doctor doctor, Guardia guardia) {
        doctor.getGuardias().add(guardia);
}
    
    public void mostrarDiasDisponiblessDr(Doctor doc){
        System.out.println(doc.getDiasDisponibles());
    }

    

    
}

