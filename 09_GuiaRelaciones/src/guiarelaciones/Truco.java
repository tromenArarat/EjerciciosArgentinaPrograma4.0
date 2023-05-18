/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. 
 */
package guiarelaciones;

import Entidades.Baraja;
import java.util.Collections;

public class Truco {

    public static void main(String[] args) {
      
        Baraja b = new Baraja();
        b.llenarBaraja();
        b.mostrarBaraja();
        
        b.barajar();
        
        System.out.println("----------------");
        
        b.mostrarBaraja();
        
        System.out.println("----------------");
        
        b.siguienteCarta();
        
        System.out.println("----------------");
        
        b.mostrarBaraja();
        
        System.out.println("----------------");
        
        b.cartasDisponibles();
        
        System.out.println("----------------");
        
        b.siguienteCarta();
        
        System.out.println("----------------");
        
        b.cartasMonton();
        
        System.out.println("----------------");
        
        b.darCartas();
        
        System.out.println("----------------");
        
        b.cartasMonton();


        
    }
    
}
