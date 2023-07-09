/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. 
 */
package hoteles;

import Servicios.HotelesServicios;
import java.util.Scanner;

public class Hoteles {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        HotelesServicios botones = new HotelesServicios();
        botones.crearCampings();
        botones.crearHoteles();
        botones.crearHotelesLujo();
        botones.crearResidencias();
        
        boolean holis = true;
        do{
        System.out.println("----- Compañía Hotelera, ¿qué necesita? ------------");
        System.out.println("-------- Ver alojamientos disponibles -----------> 1");
        System.out.println("-------- Ver hoteles del más caro al más barato -> 2");
        System.out.println("-------- Ver todos los campings c/ restaurante --> 3");
        System.out.println("-------- Ver residencias que tienen descuento ---> 4");
        System.out.println("-------- Salir ----------------------------------> 5");
        
        int rta = sc.nextInt();
        
        switch(rta){
            case 1:
                botones.mostrarTodos();
                break;
            case 2:
                botones.mostrarHoteles();
                break;
            case 3:
                botones.mostrarCampingConPapeo();
                break;
            case 4:
                botones.mostrarResidenciasConDesc();
                break;
            case 5:
                holis = false;
        }
            System.out.println("");
        }while(holis);
        
}
    
}
