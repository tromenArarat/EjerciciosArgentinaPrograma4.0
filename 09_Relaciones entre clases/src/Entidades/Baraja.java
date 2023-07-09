/*
La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.

Las operaciones que podrá realizar la baraja son:

*/

package Entidades;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Baraja {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private LinkedList<Carta> baraja = new LinkedList();
    private LinkedList<Carta> descarte = new LinkedList();
    
    public void llenarBaraja(){
        
        String palo = "";
        int num;
        
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 13; j++) {
                switch(i){
                    case 1:
                        if(j!=8 & j!=9){
                            palo = "basto";
                            num = j;
                            baraja.add(new Carta(num,palo));
                        }
                      break;  
                    case 2:
                        if(j!=8 & j!=9){
                            palo = "espada";
                            num = j;
                            baraja.add(new Carta(num,palo));
                        }
                      break;  
                    case 3:
                        if(j!=8 & j!=9){
                            palo = "oro";
                            num = j;
                            baraja.add(new Carta(num,palo));
                        }
                      break;  
                    case 4:
                        if(j!=8 & j!=9){
                            palo = "copa";
                            num = j;
                            baraja.add(new Carta(num,palo));
                        }
                      break;  
                }
            }
        }
    }
    
    /*
    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    luego se llama al método, este no mostrara esa primera carta.
    */
    
    public void mostrarBaraja(){
        for (Carta carta : baraja) {
            System.out.println(carta.toString());
        }
    }
    
    /*
    • barajar(): cambia de posición todas las cartas aleatoriamente.
    */
    
    public void barajar(){
        Collections.shuffle(baraja);
    }
    
    /*
    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    se haya llegado al final, se indica al usuario que no hay más cartas.
    */
    
    public void siguienteCarta(){
      
        if(baraja.size()!=0){
            for (Carta carta : baraja) {
            System.out.println(carta.toString());
            descarte.add(carta);
            baraja.remove(carta);
            break;
            }
        }else{
            System.out.println("No hay más cartas, papu");
        }
        
        
    }
    
    /*
    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    */
    public void cartasDisponibles(){
        System.out.println("Quedan " + baraja.size()+ " cartas disponibles");
    }
    
    /*
    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
    */
    
    public void darCartas(){
        System.out.println("¿Cuántas cartas quiere?");
        int toma = sc.nextInt();
        if(baraja.size()<toma){
            System.out.println("Sólo quedan "+baraja.size()+ " cartas");
            for (int i = 0; i < baraja.size(); i++) {
                descarte.add(baraja.element());
                System.out.println(baraja.element());
                baraja.remove(baraja.element());                
            }
        }else{
            for (int i = 0; i < toma; i++) {
                descarte.add(baraja.element());
                System.out.println(baraja.element());
                baraja.remove(baraja.element());                
            }
        }
        
    }
    
    /*
    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
    */
    
    public void repartir(){
        for (int i = 0; i < 3; i++) {
            System.out.println(baraja.element());
            baraja.remove(baraja.element());                
            }
        }
  
    
    /*
    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
    */
    
    public void cartasMonton(){
        if(descarte.size()>0){
            for (Carta carta : descarte) {
            System.out.println(carta.toString());
            }
        }else{
            System.out.println("Todavía no pasa naranja");
        }
        
    }
    
    
    
    

    
}
