
package pooej01;

import Entidad.Persona;
import java.util.Scanner;


public class POOEj01 {


    public static void main(String[] args) {
       Persona nombre1 = new Persona("Tomás",37,31805329,false);
       System.out.println(nombre1.nombre+nombre1.edad);
       
       Persona nombre2 = new Persona();
       
        System.out.println(nombre1.getNombre());
        
        nombre1.setOcciso(true);
        
        System.out.println(nombre1.isOcciso());
       
       /*
            hombre.getNombre(); //Consulta
            hombre.setNombre(); //Modificador
        */
       //hombre.setNombre(nombre);
   
    }
    
}
