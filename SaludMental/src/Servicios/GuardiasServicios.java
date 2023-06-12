/*
PENDIENTES
    - La carga del mes empieza en el día 16 HECHO en 15
    - Condición de límite semanal en 7 incluido findes y feriados
    - Condición de límite findes y feriados
    - Trueque de guardias

    - Hacer todo usando DATE o CALENDAR
    - Comparar mes anterior y empezar reparto con quienes recibieron menos guardias de finde
            - Ordenar listado de docs de acuerdo a la cant. de guardias recibidas en finde del mes anterior.

        Ciertas reglas: todos hacen una guardia de finde mínimo. Si hay más porque hay feriados, el siguiente 
        mes empieza el reparto por quienes menos guardias de finde recibieron.

        
*/
package Servicios;

import Entidades.Fecha;
import Entidades.Dia;
import Entidades.Doctor;
import Entidades.Guardia;
import Entidades.Mes;
import Entidades.Turno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
    
    // Asigna la cantidad de guardias por doc dividiendo el total de guardias por el total de docs
    public void setearCreditosGuardiasPorDoc(int cantidad){
        
        for (Doctor doctore : doctores) {
            doctore.setCreditoParaGuardias(Math.round(guardias.size()/doctores.size()));
        }
    }
    
    // Carga la lista de fechas de nombre "calendario". Viene a ser el mes en curso
    // Carga la información de número de semana y si el día es feriado o no
    public void cargarMes(){
        
        System.out.println("Año:");
        int anio = sc.nextInt();
        System.out.println("");
        
        System.out.println("Mes en curso:");
        for (Mes mes : Mes.values()) {
            System.out.println(mes);
        }
        String mes = sc.next();
        Mes mesEnCurso = Mes.valueOf(mes);
        System.out.println("");
        
        System.out.println("¿Qué día cae el 16 de este mes? (LUNES, MARTES,...)");
        for (Dia dia : Dia.values()) {
            System.out.println(dia);
        }
        String dia = sc.next();
        Dia dia16DelMes = Dia.valueOf(dia);
        System.out.println("");
        
        System.out.println("¿Cuántos días tiene el mes?");
        int diasMes = sc.nextInt();
        
        Dia siguiente = dia16DelMes;
        for (int i = 16; i < 23; i++) {
             calendario.add(new Fecha(siguiente,mesEnCurso,anio,i,false,1));
             siguiente = siguiente.next();
            }
        // Falta código por acá para que el programa no se caiga si el mes es FEBRERO
        for (int i = 23; i < 30; i++) {
             calendario.add(new Fecha(siguiente,mesEnCurso,anio,i,false,2));
             siguiente = siguiente.next();
            }
        int diaM;
        switch(diasMes){
            case 30:
                for (int i = 30; i < 31; i++) {
                    calendario.add(new Fecha(siguiente,mesEnCurso,anio,i,false,3));
                    siguiente = siguiente.next();
                }
                for (int i = 1; i < 7; i++) {
                    calendario.add(new Fecha(siguiente,mesEnCurso.next(),anio,i,false,3));
                    siguiente = siguiente.next();
                }
                for (int i = 7; i < 16; i++) {
                    calendario.add(new Fecha(siguiente,mesEnCurso.next(),anio,i,false,4));
                    siguiente = siguiente.next();
                }
                break;
            case 31:    
                for (int i = 30; i < 32; i++) {
                    calendario.add(new Fecha(siguiente,mesEnCurso,anio,i,false,3));
                    siguiente = siguiente.next();
                }
                for (int i = 1; i < 6; i++) {
                    calendario.add(new Fecha(siguiente,mesEnCurso.next(),anio,i,false,3));
                    siguiente = siguiente.next();
                }
                for (int i = 6; i < 16; i++) {
                    calendario.add(new Fecha(siguiente,mesEnCurso.next(),anio,i,false,4));
                    siguiente = siguiente.next();
                }
                break;
        }
        
        
        System.out.println("");
        
        System.out.println("¿Qué número de día es feriado?");
        System.out.println("(Entre el 16 del mes anterior y el 15 de este mes incluídos)");
        int feriado = sc.nextInt();
        for (Fecha fecha : calendario) {
            if(fecha.getNum()==feriado){
                fecha.setFeriado(true);
            }
        }
        String confirmacionSalida = "si";
        do {
            System.out.println("¿Algún otro? (si/no)");
            confirmacionSalida = sc.next();
            if(confirmacionSalida.equalsIgnoreCase("si")){
                System.out.println("¿Qué número?");
                feriado = sc.nextInt();
                for (Fecha fecha : calendario) {
                    if(fecha.getNum()==feriado){
                        fecha.setFeriado(true);
                    }
                }
            }     
        } while (confirmacionSalida.equalsIgnoreCase("si"));
    }
    
    public void cargarMesModelo(){
        Dia siguiente = Dia.VIERNES;
        for (int i = 16; i < 23; i++) {
             calendario.add(new Fecha(siguiente,Mes.JUNIO,2023,i,false,1));
             siguiente = siguiente.next();
            }
        for (int i = 23; i < 30; i++) {
            calendario.add(new Fecha(siguiente,Mes.JUNIO,2023,i,false,2));
             siguiente = siguiente.next();
            }
        for (int i = 30; i < 31; i++) {
            calendario.add(new Fecha(siguiente,Mes.JUNIO,2023,i,false,3));
            siguiente = siguiente.next();
                }
        for (int i = 1; i < 7; i++) {
            calendario.add(new Fecha(siguiente,Mes.JUNIO.next(),2023,i,false,3));
            siguiente = siguiente.next();
                }
        for (int i = 7; i < 16; i++) {
            calendario.add(new Fecha(siguiente,Mes.JUNIO.next(),2023,i,false,4));
            siguiente = siguiente.next();
                }

        int feriado = 19;
        for (Fecha fecha : calendario) {
            if(fecha.getNum()==feriado){
                fecha.setFeriado(true);
            }
        }
        feriado = 20;
        for (Fecha fecha : calendario) {
            if(fecha.getNum()==feriado){
                fecha.setFeriado(true);
            }
        }
        
    }
    
    public void mostrarFeriados(){
        for (Fecha fecha : calendario) {
            if(fecha.isFeriado())
            System.out.println(fecha.getDia()+" "+fecha.getNum()+" de "+fecha.getMes());
        }
    }
    
    public void mostrarMes(){
        for (Fecha dia : calendario) {
            System.out.println(dia.getDia()+" "+dia.getNum());
        }
    }
    
    // Por cada día del mes en curso crea dos guardias, una de DIA y otra de NOCHE
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
        
        if(noche){
            System.out.println("¿Hace guardias de 24 hs?");
            // Se llama centinela la variable porque se queda despierto todo el día
            centinela = sc.nextBoolean();
        }else{
            centinela = false;
        }
        
        String rta;
        HashMap<Dia,Turno> diasYturnosDisp = new  HashMap();
        String rta2 = "si";
        do{
            System.out.println("¿Qué días trabaja? (LUNES/MARTES...)");
            String dia = sc.next();
            System.out.println("¿En qué turno? 1-DIA 2-NOCHE 3-INDISTINTO");
            int turno = sc.nextInt();
            switch(turno){
                case 1:
                    diasYturnosDisp.put(Dia.valueOf(dia),Turno.DIA);
                    break;
                case 2:
                    diasYturnosDisp.put(Dia.valueOf(dia),Turno.NOCHE);
                    noche=true;
                    break;
                case 3:
                    diasYturnosDisp.put(Dia.valueOf(dia),Turno.DIA);
                    diasYturnosDisp.put(Dia.valueOf(dia),Turno.NOCHE);
                    noche=true;
                    break;
            }
            System.out.println("¿Cargar otro día? (si/no)");
            rta2 = sc.next();
        }while(rta2.equals("si"));
        doctores.add(new Doctor(nombre,noche,centinela,diasYturnosDisp));
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
                if(dotor.getDiasYturnosDisp().containsKey(guardia.getFecha().getDia())
                        &dotor.getDiasYturnosDisp().containsValue(guardia.getTurno())
                        &dotor.isTrabaja24()){
                    asignarGuardiaDoctor(dotor, guardia);
                    it.remove();
                    dotor.setCreditoParaGuardias(dotor.getCreditoParaGuardias()-2);
                    dotor.setGuardias24Asignadas(dotor.getGuardias24Asignadas()+1);
                    contador++;
                }
            }
            
        }
    }
    
    // INCOMPLETO
    public void asignarGuardias12() {
        
        /*
        Asignar guardias a doctor. Aplica los filtros de: 
        - Condición de límite semanal en 7 incluido findes y feriados
        - Condición de límite findes y feriados en 1.5 a 2 como mucho
            - tengaCrédito, 
            - coincidaConDisponibilidadDeLaGuardia
                y 
                  - Si la guardia es de DIA o el doc trabaja de noche
                    Esto contempla Guardia -> DIA | Trabaja -> FALSE
                                   Guardia -> NOCHE | Trabaja -> TRUE
                                   Guardia -> DIA | Trabaja -> TRUE
                        si el if no se cumple, (Guardia -> Noche | Trabaja -> False)se pasa a la siguiente iteración de guardias
                        
                  - O si la guardia es de NOCHE y el doc la labura.
                                    GUARDIA NOCHE Trabaja False
        
        */
        
        // Mezclar los doctores for fairness
        Collections.shuffle(doctores);
                
        // Mezclar las guardias for fairness
        Collections.shuffle(guardias);
        
        
       
        Iterator bucle = guardias.iterator();
        
        // Recorro los doctores
        for (Doctor doctor : doctores) {
            // Mientras haya una guardia y el doc tenga crédito disponible Y
            // Mientras las guardias de finde por mes asignadas para el doc no supera las 3 Y
            // Mientras la cantidad semanal no supere las 7
           while(bucle.hasNext()&doctor.getCreditoParaGuardias()>0&doctor.getGuardiasFindOferiado()<4&
                   doctor.getGuardiasSemanales()<8){
                Guardia guardia = (Guardia) bucle.next();
                if(doctor.getDiasYturnosDisp().containsKey(guardia.getFecha().getDia())
                        &doctor.getDiasYturnosDisp().containsValue(guardia.getTurno())
                        //&(guardia.getTurno()==Turno.DIA || doctor.isTrabajaNoche())
                        ){
                                asignarGuardiaDoctor(doctor, guardia);
                                doctor.setCreditoParaGuardias(doctor.getCreditoParaGuardias()-1);
                                doctor.setGuardias12Asignadas(doctor.getGuardias12Asignadas()+1);
                                guardiasAsignadas++;
                                if(guardia.getFecha().isFeriado()
                                ||guardia.getFecha().getDia().equals(Dia.DOMINGO)
                                ||guardia.getFecha().getDia().equals(Dia.SABADO)){
                                    doctor.setGuardiasFindOferiado(doctor.getGuardiasFindOferiado()+1);
                        }
                                int primera = 0;
                                int segunda = 0;
                                int tercera = 0;
                                int cuarta = 0;
                                switch(guardia.getFecha().getSemana()){
                                    case 1:
                                        primera++;
                                        break;
                                    case 2:
                                        segunda++;
                                        break;
                                    case 3:
                                        tercera++;
                                        break;
                                    case 4:
                                        cuarta++;
                                        break;
                                }
                                int uno = (Math.max(primera, segunda));
                                int dos = (Math.max(tercera, cuarta));
                                doctor.setGuardiasSemanales(Math.max(uno, dos));
                                bucle.remove(); 
                }
                    
                        
                            
                
                
            }
            
        }
       

        
        
    }

    public void asignarGuardiaDoctor(Doctor doctor, Guardia guardia) {
        doctor.getGuardias().add(guardia);
}
    
    public void mostrarDiasDisponiblessDr(Doctor doc){
        System.out.println(doc.getDiasYturnosDisp());
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

