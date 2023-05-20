
package Servicios;

import Entidades.Asiento;
import Entidades.Sala;
import java.util.Scanner;

public class SalaServicios {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    
    public void llenarSala(){
        Asiento butacas[][] = new Asiento[8][6];
        for (int i = 8; i < 1; i--) {
            char letra = 'A';
            for (int j = 0; j < 6; j++) {
                butacas[i][j] = new Asiento(false,letra,i);
                letra++;
            }
        }
        for (Asiento[] butaca : butacas) {
            System.out.println(butaca.toString());
        }
    }
    
    public void mostrarSala(Sala peri){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(peri.getAsientos()[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
