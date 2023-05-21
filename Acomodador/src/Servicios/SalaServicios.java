
package Servicios;

import Entidades.Asiento;
import Entidades.Sala;

public class SalaServicios {
    
    public void llenarSala(Sala peri){
        
        Asiento[][] silla = new Asiento[8][6];
        for (int i = 0; i < 8; i++) {
            char letra = 'A';
            for (int j = 0; j < 6; j++) {
                silla[i][j] = new Asiento(false,letra,(8-i));
                letra ++;
            }
        }
        peri.setButacax(silla);
    }
    
    
    public void mostrarSala(Sala peri){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(peri.getButacax()[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
