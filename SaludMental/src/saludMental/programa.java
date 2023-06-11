package saludMental;


import Entidades.Dia;
import Entidades.Doctor;
import Entidades.Guardia;
import Entidades.Turno;
import Servicios.GuardiasServicios;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Scanner;


public class programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        GuardiasServicios servidor = new GuardiasServicios();
        
        servidor.cargarMes();
        servidor.mostrarMes();
        servidor.cargarGuardias();
        servidor.mostrarGuardias();
        
        
        String rta = "no";
        
        do{
            System.out.println("Hola Usuarie, ¿qué desea?");
            System.out.println("");
            System.out.println("CARGAR PROFESIONAL      --> 1");
            System.out.println("VER PROFESIONALES       --> 2");
            System.out.println("ASIGNAR GUARDIAS        --> 3");
            System.out.println("MOSTRAR GUARDIAS LIBRES --> 4");
            System.out.println("CAMBIAR GUARDIAS        --> 5");
            System.out.println("SALIR                   --> 6");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    servidor.cargarDocs();
                    break;
                case 2:
                    servidor.mostrarDocs();
                    break;
                case 3:
                    servidor.asignarGuardias();
                    break;
                case 4:
                    servidor.mostrarGuardias();
                    break;
                
                case 6:
                    System.out.println("¿Segure que desea salir? (si/no)");
                    rta = sc.next();
                    break;
            }
        }while(rta.equals("no"));
        
        
  
        
        
        
        
        
       
    }
    
}
