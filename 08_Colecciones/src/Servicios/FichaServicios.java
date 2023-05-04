/*
clase Ficha (de dominó) con su constructor y sus getters, con un toString() (que imprima el “seis-zero” como
 * “6:0|” y con un método llamado “Ficha girarFicha()” que gire la ficha (el “6:0|” pasaría a ser “0:6|”)Implementa también
 * el método “boolean esUnDoble()”. A) Ahora implementa con ArrayLists una clase que genere todas las fichas desde el doble 0
 * al doble MAX_NUM. Después, el programa, actuando como si fuera un robot jugando al solitario, empezará por tirar el doble
 * más grande e irá tirando fichas (las jugadas tienen que ser legales) hasta que haya tirado todas sus fichas (de su “mano”
 * a la “mesa) o ya no pueda tirar ninguna ficha más. Tu ejecución puede ser diferente de las de los ejemplos dependiendo de
 * cómo lo implementes.
 */
package Servicios;

import Entidades.Ficha;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FichaServicios {
    
    private ArrayList<Ficha> fichines = new ArrayList();
    private ArrayList<Ficha> atril = new ArrayList();
    
    
    public void crearFichas(){
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                ArrayList<String> ficha = new ArrayList();
                ficha.add(i+":"+j);
                fichines.add(new Ficha(ficha));
            }
        }
    }
    
    public void mostrarFichas(){
        fichines.forEach((fichine) -> System.out.println(fichine.getFicha().toString()));
    }
    
    public void desordenarFichas(){
        Collections.shuffle(fichines);
    }
    
    public void iniciarJuego(){
        String confirmacionDeSalida = "no";
        int contadorRonda = 2;
        crearFichas();
        
        do{
            if(contadorRonda%2==0){
                desordenarFichas();
                tomarSiete();
                // Mostrar atril. Si está el doble seis jugarlo, si no pasar.
            }else{
                desordenarFichas();
                tomarSiete();
            }
            
        }while(confirmacionDeSalida.equalsIgnoreCase("si")||confirmacionDeSalida.equalsIgnoreCase("sí"));
    }
    
    public ArrayList tomarSiete(){
    if(fichines.size()>=7){
        System.out.println("Sus fichas son:");
        for (int i = 0; i < 7; i++) {
//            System.out.print(fichines.get(i).toString()+ "|");
            fichines.remove(i);
            atril.add(fichines.get(i));
            return atril;
        }
    }else{
        System.out.println("No hay más que "+fichines.size()+" piezas disponibles.");
        
    }
        return atril;
      
    }
    
}
