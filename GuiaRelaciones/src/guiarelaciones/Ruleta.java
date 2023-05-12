/*
Realizar el juego de la ruleta rusa con una bala llamada VIDA en Java. 
https://www.youtube.com/watch?v=5vBGOrI6yBk

Como muchos saben, el juego se trata de un número de jugadores, que, con un revolver, 
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

2) Clase Jugador: esta clase posee los siguientes 
                    atributos: 
                        - id (representa el número del jugador), 
                        - nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) 
                        - vive (indica si está con vida o no el jugador). 

El número de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. 
Si no está en este rango, por defecto será 6.
    
Métodos:
    • disparo(Revolver r): el método, recibe el revolver de vida y llama a los métodos de
    darVida() y siguienteDisparo() de Revolver. El jugador se apunta, aprieta el gatillo y si el
    revolver tira vida, el jugador se anima. El atributo vive pasa a true y el método
    devuelve true, sino false y false.
    
3) Clase Juego: esta clase posee los siguientes 
                    atributos: 
                        - Jugadores (conjunto de Jugadores) y
                        - Revolver
    
Métodos:
    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
    y el revolver para guardarlos en los atributos del juego.
    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de vida y
    aprieta el gatillo. Sí el revolver tira vida, el jugador se estimula y se termina el juego. 
    Si no se estimula, se pasa al siguiente jugador hasta que uno se estimule. Si o si alguien se tiene 
    que estimular. Al final del juego, se debe mostrar que jugador se mojó.

    Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
 */
package guiarelaciones;

public class Ruleta {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
