/*
Desarrollar un simulador del sistema de votación de facilitadores en Egg
El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. 

Además, crearemos una clase Simulador que va a tener los métodos para manejar a los alumnos y 
sus votaciones. Estos métodos serán llamados desde el main.
 */
package guiarelacionessimulacionegg;

import Servicios.Simulador;

public class GuiaRelacionesSimulacionEgg {

    public static void main(String[] args) {
        Simulador nato = new Simulador();
        nato.crearAlumnos();
        nato.generarDni();
        nato.mostrarAlumnos();
    }
    
}
