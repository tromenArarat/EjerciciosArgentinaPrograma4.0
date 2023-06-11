package saludMental;



import Servicios.GuardiasServicios;

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
            System.out.println("CARGAR PROFESIONAL      --> 1");
            System.out.println("VER PROFESIONALES       --> 2");
            System.out.println("ASIGNAR GUARDIA 24 HS   --> 3");
            System.out.println("ASIGNAR GUARDIAS 12 HS  --> 4");
            System.out.println("MOSTRAR GUARDIAS ASIGNA --> 5");
//            System.out.println("CAMBIAR GUARDIAS        --> 5");
            System.out.println("SALIR                   --> 6");
            System.out.println("");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    servidor.cargarDocs();
                    break;
                case 2:
                    servidor.mostrarDocs();
                    break;
                case 3:
                    servidor.asignarGuardia24();
                    break;
                case 4:
                    servidor.asignarGuardiasDerechos();
                    break;
                case 5:
                    servidor.mostrarGuardiasAsignadasDocs();
                    break;
                
                case 6:
                    System.out.println("¿Segure que desea salir? (si/no)");
                    rta = sc.next();
                    break;
            }
        }while(rta.equals("no"));
        
        
  
        
        
        
        
        
       
    }
    
}
