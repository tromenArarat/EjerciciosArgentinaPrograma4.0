
package Ejercicios;

import Servicios.FechaService;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ej4_Fecha {

    public static void main(String[] args) {
        
        System.out.println("Impresiones para probar Calendar y GregorianCalendar");
        
        // video: https://www.youtube.com/watch?v=lDCgErCsoPY&t=639s
        Calendar calendario = new GregorianCalendar();
        Date fechaActualBis = new Date();
        
        // Método set time setea la hora actual del calendario gregoriano con la fecha informada.
        calendario.setTime(fechaActualBis);
        
        // Método toString() devuelve una representación en cadena de este calendario
        String descripcion = calendario.toString();
        System.out.println("");
        System.out.println("Impresión del toString:");
        System.out.println(descripcion);
        
        // Método get
        
        int year = calendario.get(Calendar.YEAR);
        int month = calendario.get(Calendar.MONTH);
        int day = calendario.get(Calendar.DATE);
        
        System.out.println("La fecha es "+ day +"/"+ month +"/"+ year);
        
        // Método set. Setea los valores de año, mes y día
        
        calendario.set(2050,2,1);
        System.out.println("La fecha es "+ calendario.get(Calendar.DATE) +"/"+ 
                            calendario.get(Calendar.MONTH) +"/"+ calendario.get(Calendar.YEAR));
        
        calendario.set(2050,2,1,18,40);
        System.out.println("La fecha es "+ calendario.get(Calendar.DATE) +"/"+ 
                            calendario.get(Calendar.MONTH) +"/"+ calendario.get(Calendar.YEAR)+ " "+ 
                            calendario.get(Calendar.HOUR)+":"+calendario.get(Calendar.MINUTE));
        
        // Método get time
        Date fechaActualReLoad = calendario.getTime();
        System.out.println(fechaActualReLoad.toString());
        
        System.out.println("-----------------------");
        System.out.println("Comienzo del ejercicio");
        
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
