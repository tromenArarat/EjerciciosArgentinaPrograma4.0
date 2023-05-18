/*
Realizar el juego de la ruleta rusa con una bala llamada VIDA en Java. 
https://www.youtube.com/watch?v=5vBGOrI6yBk

Como muchos saben, el juego se trata de un número de programadores, que, con un revolver, 
el cual posee una sola carga de vida, se dispara y dá ánimo para seguir codeando con los codos. 

Las clases por hacer del juego son las siguientes:

1) Clase Revolver de vida: esta clase posee los siguientes 
                     atributos: 
                        - posición actual (posición del tambor que se dispara, 
                            puede que esté LA VIDA o no) y 
                        - posición VIDA (la posición del tambor donde se encuentra LA VIDA). 

Estas dos posiciones se generarán aleatoriamente.

Métodos:
    • llenarRevolver(): le pone los valores de posición actual y de posición DE LA VIDA. Los valores
    deben ser aleatorios.
    • darVida(): devuelve true si la posición DE LA VIDA coincide con la posición actual
    • siguienteDisparo(): cambia a la siguiente posición del tambor
    • toString(): muestra información del revolver (posición actual y donde está LA VIDA)

2) Clase Programador: esta clase posee los siguientes 
                    atributos: 
                        - id (representa el número del jugador), 
                        - nombre (Empezara con Programador más su ID, “Programador 1” por ejemplo) 
                        - vive (indica si está con vida o no el programador). 

El número de programadores será decidido por el usuario, pero debe ser entre 1 y 6. 
Si no está en este rango, por defecto será 6.
    
Métodos:
    • disparo(Revolver r): el método, recibe el revolver de vida y llama a los métodos de
    darVida() y siguienteDisparo() de Revolver. El programador se apunta, aprieta el gatillo y si el
    revolver tira vida, el jugador se anima. El atributo vive pasa a true y el método
    devuelve true, sino false y false.
    
3) Clase Ruleteada: esta clase posee los siguientes 
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

    Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
 */
package guiarelaciones;

import Entidades.Juego;
import Entidades.Programador;
import Entidades.Revolver;
import java.util.ArrayList;

public class Ruleta {

    public static void main(String[] args) {
        
        Programador p1 = new Programador(1, "Bruno");
        Programador p2 = new Programador(2, "Nicolas");
        Programador p3 = new Programador(3, "Clara");
        Programador p4 = new Programador(4, "Joel");
        Programador p5 = new Programador(5, "Lorena");
        Programador p6 = new Programador(6, "Mariano");
        Programador p7 = new Programador(7, "Tomás");
        
        ArrayList<Programador> pgs = new ArrayList();
        
        pgs.add(p1);
        pgs.add(p2);
        pgs.add(p3);
        pgs.add(p4);
        pgs.add(p5);
        pgs.add(p6);
        pgs.add(p7);
        
        Revolver r = new Revolver();
        r.llenarRevolver();
        System.out.println("Posición tambor: "+ r.getPosActual());
        System.out.println("Posición Vida: "+r.getPosVida());
        
        Juego j = new Juego();
        j.llenarJuego(pgs, r);
        
        j.ronda();
    }
    
}
