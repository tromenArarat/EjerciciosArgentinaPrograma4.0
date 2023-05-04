/*
* Implementa un clase Ficha (de dominó) con su constructor y sus getters, con un toString() (que imprima el “seis-zero” como
 * “6:0|” y con un método llamado “Ficha girarFicha()” que gire la ficha (el “6:0|” pasaría a ser “0:6|”). Implementa también
 * el método “boolean esUnDoble()”. A) Ahora implementa con ArrayLists una clase que genere todas las fichas desde el doble 0
 * al doble MAX_NUM. Después, el programa, actuando como si fuera un robot jugando al solitario, empezará por tirar el doble
 * más grande e irá tirando fichas (las jugadas tienen que ser legales) hasta que haya tirado todas sus fichas (de su “mano”
 * a la “mesa) o ya no pueda tirar ninguna ficha más. Tu ejecución puede ser diferente de las de los ejemplos dependiendo de
 * cómo lo implementes.
 */
package Ejercicios;

import Servicios.ServiciosDomino;

public class Ex_00_Domino {
    public static void main(String[] args) {
        ServiciosDomino cubano = new ServiciosDomino();
        cubano.iniciarJuego();
        
//        System.out.println("---------------------");
//        cubano.mostrarFichas();
//        System.out.println("---------------------");
//        cubano.desordenarFichas();
//        System.out.println("---------------------");
//        cubano.mostrarFichas();
//        System.out.println("---------------------");
//        cubano.tomarSiete();
    }
    
}
