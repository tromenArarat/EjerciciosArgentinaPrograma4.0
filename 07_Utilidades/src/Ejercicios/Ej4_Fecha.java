
package Ejercicios;

import Servicios.FechaService;
import java.util.Date;

public class Ej4_Fecha {

    public static void main(String[] args) {
        FechaService pitonisa = new FechaService();
        
        System.out.println("Fecha actual");
        Date fechaActual = pitonisa.fechaActual();
        System.out.println(fechaActual);
        
        System.out.println("Fecha de nacimiento: ");
        Date fechadeNacimiento = pitonisa.fechaNacimiento();
        System.out.println(fechadeNacimiento);
        
        System.out.println("Edad usuario");
        int edad = pitonisa.edadUsuario(fechadeNacimiento,fechaActual);
        System.out.println(edad);
    }
    
}
