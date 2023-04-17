/*

 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    /*
    Método fechaNacimiento que pregunte al usuario día, mes y año de
    su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
    El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
    new Date(anio, mes, dia);
    */   
    
    public Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento(){
        
        System.out.println("Año:");
        int anio = sc.nextInt();
        System.out.println("Mes:");
        int mes = sc.nextInt();
        System.out.println("Día:");
        int dia = sc.nextInt();
        
        Date fecha = new Date(anio,mes,dia);
        
        return fecha;
    }
    /*
    Método fechaActual que cree un objeto fecha con el día actual. Para
    esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
    fechaActual = new Date();
    */
    public Date fechaActual(){
         Date fechaActual = new Date();
         return fechaActual;
    }
    
    /*
    Método diferencia que reciba las dos fechas por parámetro y retorna
    la diferencia de años entre una y otra (edad del usuario).
    
    se usa .getDate (que va del 1 al 31) en lugar de .getDay (que va del 1 al 7)
    
    */
    public int edadUsuario(Date fechaNacimiento, Date fechaActual){
        
        int edad; 
        if(fechaNacimiento.getMonth() > fechaActual.getMonth()||(fechaNacimiento.getMonth() == fechaActual.getMonth()&&fechaNacimiento.getDate() > fechaActual.getDate())){
        edad = (fechaActual.getYear()-fechaNacimiento.getYear())-1;
        }else{
           edad = fechaActual.getYear() - fechaNacimiento.getYear();
        }
        
        return edad;
    }
    
    
}
