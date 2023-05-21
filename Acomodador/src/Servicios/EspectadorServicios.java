/*
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).

Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que 
sólo se podrá sentar a un espectador 
- si tiene el dinero suficiente para pagar la entrada
- si hay espacio libre en la sala y 
- si tiene la edad requerida para ver la película. 

En caso de que el asiento este ocupado se le debe buscar uno libre.
 */
package Servicios;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EspectadorServicios {
    
    public void crearEspectadores(Sala peri){
        Espectador[][] publico = new Espectador[8][6];
        for (int i = 0; i < 8; i++) {
            char letra = 'a';
            for (int j = 0; j < 6; j++) {
                String nombre = letra+" "+"fan";
                int edad = (int)(Math.random()*95+6);
                int dinero = (int)(Math.random()*2000+100);
                publico[i][j] = new Espectador(nombre,edad,dinero);
                letra ++;    
            }
        }
        peri.setEspectadores(publico);
    }
    
    public void mostrarEspectadores(Sala peri){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Nombre: "+peri.getEspectadores()[i][j].getNombre() +'\n'+ "Edad: "+peri.getEspectadores()[i][j].getEdad() +
                    '\n'+ "Bille disponible: " + peri.getEspectadores()[i][j].getDinero());
            }
        }
    }
    
    public void ubicarEspectador(Sala peri, Espectador smith, Cine tugurio){
        // Cargo los asientos ya creados en un arrayList de asientos
        ArrayList<Asiento> lugares = new ArrayList();
           for (int i = 0; i < 8; i++) {
               for (int j = 0; j < 6; j++) {
                   lugares.add(peri.getButacax()[i][j]);
               }
           }

        // Desordeno ese ArrayList e itero sobre la lista: 
        // Si se cumplen todas las condiciones, asigno el asiento a Smith
        Collections.shuffle(lugares);
        for (Asiento lugar : lugares) {
            if(smith.getDinero()>tugurio.getPrecioEntrada()
                    & lugar.isOcupada() == false & smith.getEdad()>=tugurio.getEdadMinima()){
                smith.setButaca(lugar);
        }
        } 
    }
}
