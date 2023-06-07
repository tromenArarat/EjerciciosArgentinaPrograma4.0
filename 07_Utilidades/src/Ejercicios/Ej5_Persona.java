/*
Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */
package Ejercicios;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Ej5_Persona {

    /*
    Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
    método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
    try-catch para probar la nueva excepción que debe ser controlada.
    */
    
    public static void main(String[] args) {
        PersonaServicio osteopata = new PersonaServicio();
        
        Persona tipito = osteopata.crearPersona();
        
        System.out.println(osteopata.calcularEdad(tipito));
        
        System.out.println(osteopata.menorQue(tipito, 18));
        
        osteopata.mostrarPersona(tipito);
        
    }
    
}
