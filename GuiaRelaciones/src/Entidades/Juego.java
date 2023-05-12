/*
3) Clase Juego: esta clase posee los siguientes 
                    atributos: 
                        - Programadores (conjunto de Programadores) y
                        - Revolver
    
Métodos:
    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los programadores
    y el revolver para guardarlos en los atributos del juego.
    • ronda(): cada ronda consiste en un programador que se apunta con el revolver de vida y
    aprieta el gatillo. Sí el revolver tira vida, el programador se estimula y se termina el juego. 
    Si no se estimula, se pasa al siguiente programador hasta que uno se estimule. Si o si alguien se tiene 
    que estimular. Al final del juego, se debe mostrar que programador se estimuló.
 */
package Entidades;

import java.util.ArrayList;


public class Juego {
    
    private ArrayList<Programador> programadores;
    private Revolver r;
    
    public void llenarJuego(ArrayList<Programador> vagos, Revolver r){
        programadores = vagos;
        this.r = r;
    }
    
    public void ronda(){
        for (Programador programadore : programadores) {
            if(programadore.disparo(r)){
                System.out.println(programadore.getNombre() + ", ya tenés vida, ponete a laburar");
                break;
            }
        }
    }
    
}
