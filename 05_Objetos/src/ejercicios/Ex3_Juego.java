/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.


CHEQUEO 2 de abril de 2023
Se incorporó a la máquina como jugador, pero sigue habiendo error en el 
acumulador de puntaje.

Cuando juega la máquina no podemos ver el último número que dice y
el mensaje de inicio se repite.
 */
package ejercicios;

import Entidad.Juego;
import java.util.InputMismatchException;

public class Ex3_Juego {

    public static void main(String[] args) {
        Juego adivinaNumero = new Juego();
        try{
            adivinaNumero.iniciar_juego();
        }catch(InputMismatchException e){
            System.out.println("El juego se interrumpió");
        }
        
    }
    
}
