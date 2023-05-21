/*

 */
package Servicios;

import Entidades.Cine;
import Entidades.Sala;
import java.util.Scanner;

public class CineServicios {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Cine crearCine(Sala peri){
        /*
        private String pelicula;
        private Sala auditorio;
        private int precioEntrada;
        private String titulo;
        private int duracion;
        private int edadMinima;
        private String director;
        */
        System.out.println("Película:");
        String pelicula = sc.next();
        System.out.println("PrecioEntrada:");
        int precioEntrada = sc.nextInt();
        System.out.println("edadMinima:");
        int edadMinima = sc.nextInt();
        return new Cine(pelicula,peri,precioEntrada,"MenInWhite",60,edadMinima,"Spilimbergo");
        
    }
            
}
