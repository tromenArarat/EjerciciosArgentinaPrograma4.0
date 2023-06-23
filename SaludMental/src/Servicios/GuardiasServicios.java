/*
PENDIENTES
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
import Entidades.Disponibilidad;
import Entidades.Profesional;
import Entidades.Guardia;
import Entidades.Mes;
import Entidades.Turno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class GuardiasServicios {

    private ArrayList<Guardia> guardias = new ArrayList();
    private ArrayList<Profesional> profesionales = new ArrayList();
    private ArrayList<Fecha> calendario = new ArrayList();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private int guardiasAsignadas = 0;

    // Constructor
    public GuardiasServicios() {
        guardias = new ArrayList<>();
        profesionales = new ArrayList<>();
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
    
    
    // Métodos en el orden en que se ejecutan en el mein
    
        // De Calendario
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
        
        // De Guardia
        public void cargarGuardias(){
        for (Fecha fecha : calendario) {
            guardias.add(new Guardia(fecha,Turno.DIA));
            guardias.add(new Guardia(fecha,Turno.NOCHE));
            guardias.add(new Guardia(fecha,Turno.CENTINELA));
        }
    };
        
        public void removerGuardiasDuplicadas(){
       Iterator it = guardias.iterator();
       while(it.hasNext()){
                Guardia guardia = (Guardia) it.next();
                if(guardia.getTurno()==Turno.CENTINELA){
                    Iterator itElPayaso = guardias.iterator();
                    while(it.hasNext()){
                        Guardia guardiola = (Guardia) it.next();
                        if(guardia.getFecha().getNum()==guardiola.getFecha().getNum()){
                            itElPayaso.remove();
                        }
                    }
                }
                    
       }
   }
    
        public void mostrarGuardias(){
        for (Guardia guardia : guardias) {
            System.out.println(guardia.getFecha().getDia()+" "+guardia.getFecha().getNum());
        }
    }
    
        public void agregarGuardia(Guardia guardia) {
                    guardias.add(guardia);
            }
            
        // De Docs
        
        public void cargarDocs(){
        
        boolean noche = false;
        boolean centinela = false;
        
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("¿Hace guardias de 24 hs? (true/false)");
        // Se llama centinela la variable porque se queda despierto todo el día
        
        centinela = sc.nextBoolean();
        if(centinela){
            noche=true;
        }
      
        ArrayList<Disponibilidad> disponibilidad = new ArrayList();
        String rta2 = "si";
        do{
            System.out.println("¿Qué días trabaja? (LUNES/MARTES...)");
            String dia = sc.next();
                        
            System.out.println("¿En qué turno? 1-DIA 2-NOCHE 3-INDISTINTO 4-24HS");
            int turno = sc.nextInt();
            switch(turno){
                case 1:
                    for (Fecha fecha : calendario) {
                        if(fecha.getDia()==Dia.valueOf(dia)){
                            Disponibilidad dispo = new Disponibilidad(Dia.valueOf(dia),Turno.DIA);
                            disponibilidad.add(dispo);
                        }
                    }
                    break;
                case 2:
                    for (Fecha fecha : calendario) {
                        if(fecha.getDia()==Dia.valueOf(dia)){
                            Disponibilidad dispo2 = new Disponibilidad(Dia.valueOf(dia),Turno.NOCHE);
                            disponibilidad.add(dispo2);
                        }
                    }
                    noche=true;
                    break;
                case 3:
                    for (Fecha fecha : calendario) {
                        if(fecha.getDia()==Dia.valueOf(dia)){
                            Disponibilidad dispo3 = new Disponibilidad(Dia.valueOf(dia),Turno.DIA);
                            Disponibilidad dispo4 = new Disponibilidad(Dia.valueOf(dia),Turno.NOCHE);
                            disponibilidad.add(dispo3);
                            disponibilidad.add(dispo4);
                        }
                    }
                    noche=true;
                    break;
                case 4:
                    for (Fecha fecha : calendario) {
                        if(fecha.getDia()==Dia.valueOf(dia)){
                            Disponibilidad dispo5 = new Disponibilidad(Dia.valueOf(dia),Turno.CENTINELA);
                            disponibilidad.add(dispo5);
                        }
                    }
                  
            }
            System.out.println("¿Cargar otro día? (sí/no)");
            rta2 = sc.next();
        }while(rta2.equalsIgnoreCase("si")||rta2.equalsIgnoreCase("sí"));
        profesionales.add(new Profesional(nombre,noche,centinela,disponibilidad));
    }
        
        public void setearCreditosGuardiasPorDoc(int cantidad){
        
        for (Profesional profesionale : profesionales) {
            profesionale.setCreditoParaGuardias(Math.round(guardias.size()/profesionales.size()));
        }
    }
        
        public void cargarDocsModelo(){
        String nombre = "Ramón";
        String nombre2 = "Dora";
        String nombre3 = "Josefa";
        String nombre4 = "Eugenio";
        String nombre5 = "Daniel";
        String nombre6 = "Florencia";
        String nombre7 = "Clara";
        String nombre8 = "Javier";
        String nombre9 = "Pepa";
        String nombre10 = "Kun";
        boolean centinela = true;
        boolean medialuna = false;
        ArrayList<Disponibilidad> dispo1 = new ArrayList();
        dispo1.add(new Disponibilidad(Dia.DOMINGO,Turno.CENTINELA));
        dispo1.add(new Disponibilidad(Dia.LUNES,Turno.NOCHE));
        dispo1.add(new Disponibilidad(Dia.MARTES,Turno.CENTINELA));
        dispo1.add(new Disponibilidad(Dia.MIERCOLES,Turno.CENTINELA));
        dispo1.add(new Disponibilidad(Dia.JUEVES,Turno.CENTINELA));
        dispo1.add(new Disponibilidad(Dia.VIERNES,Turno.CENTINELA));
        dispo1.add(new Disponibilidad(Dia.SABADO,Turno.CENTINELA));
        
        ArrayList<Disponibilidad> dispo2 = new ArrayList();
        dispo2.add(new Disponibilidad(Dia.DOMINGO,Turno.DIA));
        dispo2.add(new Disponibilidad(Dia.DOMINGO,Turno.NOCHE));
        dispo2.add(new Disponibilidad(Dia.LUNES,Turno.DIA));
        dispo2.add(new Disponibilidad(Dia.LUNES,Turno.NOCHE));
        dispo2.add(new Disponibilidad(Dia.SABADO,Turno.DIA));
        dispo2.add(new Disponibilidad(Dia.SABADO,Turno.NOCHE));
        
        ArrayList<Disponibilidad> dispo3 = new ArrayList();
        dispo3.add(new Disponibilidad(Dia.DOMINGO,Turno.DIA));
        dispo3.add(new Disponibilidad(Dia.DOMINGO,Turno.NOCHE));
        dispo3.add(new Disponibilidad(Dia.MARTES,Turno.DIA));
        dispo3.add(new Disponibilidad(Dia.MARTES,Turno.NOCHE));
        dispo3.add(new Disponibilidad(Dia.MIERCOLES,Turno.DIA));
        dispo3.add(new Disponibilidad(Dia.MIERCOLES,Turno.NOCHE));
        dispo3.add(new Disponibilidad(Dia.MIERCOLES,Turno.CENTINELA));
        dispo3.add(new Disponibilidad(Dia.JUEVES,Turno.DIA));
        dispo3.add(new Disponibilidad(Dia.JUEVES,Turno.NOCHE));
        dispo3.add(new Disponibilidad(Dia.VIERNES,Turno.DIA));
        dispo3.add(new Disponibilidad(Dia.VIERNES,Turno.NOCHE));
        dispo3.add(new Disponibilidad(Dia.SABADO,Turno.DIA));
        dispo3.add(new Disponibilidad(Dia.SABADO,Turno.NOCHE));
        
        ArrayList<Disponibilidad> dispo4 = new ArrayList();
        dispo4.add(new Disponibilidad(Dia.DOMINGO,Turno.DIA));
        dispo4.add(new Disponibilidad(Dia.DOMINGO,Turno.NOCHE));
        dispo4.add(new Disponibilidad(Dia.JUEVES,Turno.DIA));
        dispo4.add(new Disponibilidad(Dia.LUNES,Turno.NOCHE));
        dispo4.add(new Disponibilidad(Dia.SABADO,Turno.DIA));
        dispo4.add(new Disponibilidad(Dia.SABADO,Turno.NOCHE));
        
        ArrayList<Disponibilidad> dispo5 = new ArrayList();
        dispo5.add(new Disponibilidad(Dia.DOMINGO,Turno.DIA));
        dispo5.add(new Disponibilidad(Dia.LUNES,Turno.DIA));
        dispo5.add(new Disponibilidad(Dia.JUEVES,Turno.DIA));
        dispo5.add(new Disponibilidad(Dia.LUNES,Turno.DIA));
        dispo5.add(new Disponibilidad(Dia.SABADO,Turno.DIA));
        dispo5.add(new Disponibilidad(Dia.SABADO,Turno.DIA));
        
        profesionales.add(new Profesional(nombre,true,true,dispo1));
        profesionales.add(new Profesional(nombre2,true,false,dispo2));
        profesionales.add(new Profesional(nombre3,true,true,dispo3));
        profesionales.add(new Profesional(nombre4,true,false,dispo4));
        profesionales.add(new Profesional(nombre5,false,false,dispo5));
        profesionales.add(new Profesional(nombre6,false,false,dispo5));
        profesionales.add(new Profesional(nombre7,true,false,dispo4));
        profesionales.add(new Profesional(nombre8,true,true,dispo3));
        profesionales.add(new Profesional(nombre9,true,false,dispo2));
        profesionales.add(new Profesional(nombre10,true,true,dispo1));
    }
    
        public void mostrarDocs(){
        for (Profesional profesional : profesionales) {
            System.out.println(profesional.toString());
        }
    }
        
        public void agregarProfesional(Profesional profesional) {
        profesionales.add(profesional);
    }
        
       
        
        
        // De Programa
        /*
        public Dia coincideDisponibilidadDia(){
            Dia este = Dia.DOMINGO;
            Iterator it = guardias.iterator();
            for (Profesional profesionale : profesionales) {
                for (Disponibilidad disponibilidad : profesionale.getDisponibilidad()) {
                    if(disponibilidad.getDia()==guardia.getFecha().getDia()){
                        quiOnda = disponibilidad.getTurno()==guardia.getTurno();
                    };
                    }
            }
                
            }
            return quiOnda;
            
        }
        */
        public void asignarGuardia24(){
               
        /*
        Asignar guardia completa a profesional 
        */
       
        // Mezclar los profesionales
        Collections.shuffle(profesionales); 
        
        // Ordenar guardias
        Collections.sort(guardias,Guardia.ordenarPorNumDia);
        
        Iterator it = guardias.iterator();
        
        while(it.hasNext()){
            Guardia guardia = (Guardia) it.next();
             for (Profesional dotor : profesionales) {
                if(dotor.getCreditoParaGuardias()>1&dotor.getGuardias24Asignadas()<3
                        ){
                        asignarGuardiaProfesional(dotor, guardia);
                        dotor.setCreditoParaGuardias(dotor.getCreditoParaGuardias()-2);
                        dotor.setGuardias24Asignadas(dotor.getGuardias24Asignadas()+1);
                        it.remove();
                }
            } 
        }
        }
       
    
        
        public void asignarGuardias12(){
        
        /*
        Asignar guardias a profesional. Aplica los filtros de: 
        - Condición de límite semanal en 7 incluido findes y feriados
        - Condición de límite findes y feriados en 1.5 a 2 como mucho
        */
        
        // Mezclar los profesionales for fairness
        Collections.shuffle(profesionales);
                
        // Mezclar las guardias for fairness
        Collections.shuffle(guardias);
        
               
        Iterator bucle = guardias.iterator();
        
        // Recorro los profesionales
        for (Profesional profesional : profesionales) {
            // Mientras haya una guardia y el doc tenga crédito disponible 
            // Y Mientras las guardias de finde por mes asignadas para el doc no superen las 3 
            // Y Mientras la cantidad semanal no supere las 7
           while(bucle.hasNext()&profesional.getCreditoParaGuardias()>0&profesional.getGuardiasFindOferiado()<4&
                   profesional.getGuardiasSemanales()<8){
                Guardia guardia = (Guardia) bucle.next();
                if(profesional.getDisponibilidad().contains(guardia.getFecha().getDia())
                        &profesional.getDisponibilidad().contains(guardia.getTurno())
                        //&(guardia.getTurno()==Turno.DIA || profesional.isTrabajaNoche())
                        ){
                                asignarGuardiaProfesional(profesional, guardia);
                                profesional.setCreditoParaGuardias(profesional.getCreditoParaGuardias()-1);
                                profesional.setGuardias12Asignadas(profesional.getGuardias12Asignadas()+1);
                                guardiasAsignadas++;
                                
                                
                                if(guardia.getFecha().isFeriado()
                                ||guardia.getFecha().getDia().equals(Dia.DOMINGO)
                                ||guardia.getFecha().getDia().equals(Dia.SABADO)){
                                    profesional.setGuardiasFindOferiado(profesional.getGuardiasFindOferiado()+1);
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
                                profesional.setGuardiasSemanales(Math.max(uno, dos));
                                bucle.remove(); 
                }
                    
            }
            
        }
       

        
        
    }

        public void asignarGuardiaProfesional(Profesional profesional, Guardia guardia){
        profesional.getGuardias().add(guardia);
}
        
        public void mostrarGuardiasAsignadasDocs(){
        for (Profesional profesionale : profesionales) {
            System.out.println(profesionale.getNombre());
            for (Guardia guardia : profesionale.getGuardias()) {
                System.out.println(guardia.getFecha().getDia()+
                        " "+guardia.getFecha().getNum()+
                        " "+guardia.getTurno());
            }
        }
    }

}

