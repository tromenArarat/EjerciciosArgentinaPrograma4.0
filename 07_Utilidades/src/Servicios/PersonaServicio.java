/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    
    private Scanner sc = new Scanner(System.in);

/*
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
    
    */

    public Persona crearPersona(){
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("Fecha de nacimiento");
        System.out.println("Año:");
        int anio = sc.nextInt();
        System.out.println("Mes:");
        int mes = sc.nextInt();
        System.out.println("Día:");
        int dia = sc.nextInt();
        Date nacimiento = new Date(anio,mes,dia);
        return new Persona(nombre,nacimiento);
        
    }
    
    /*
    b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
    */
    
    public int calcularEdad(Persona vaguito){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear()-vaguito.getNacimiento().getYear();
        
        if(vaguito.getNacimiento().getMonth()>fechaActual.getMonth() || (vaguito.getNacimiento().getMonth()==fechaActual.getMonth()&&vaguito.getNacimiento().getDate()>fechaActual.getDate())){
            edad--;
        }
        return edad;
    }
    
    /*
    c) Método menorQue recibe como parámetro una Persona y una edad.
    Retorna true si la persona es menor que la edad consultada o false
    en caso contrario.
    */
    
    public boolean menorQue(Persona vaguito, int edad){
        if(calcularEdad(vaguito)<edad){
            return true;
        }else{
            return false;
        }
    }
    
    /*
    d) Método mostrarPersona que muestra la información de la persona
    deseada.
    */
    
    public void mostrarPersona(Persona vaguito){
        System.out.println(vaguito.getNombre()+'\n'+vaguito.getNacimiento());
    }
    
}
