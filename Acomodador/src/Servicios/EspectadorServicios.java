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

import Entidades.Espectador;
import Entidades.Sala;
import java.util.ArrayList;

public class EspectadorServicios {
    
    public void crearEspectadores(Sala peri){
        ArrayList<Espectador> publico = new ArrayList();
        for (int i = 0; i < 64; i++) {
            char letra = 'z';
            String nombre = letra+" "+"fan";
            int edad = (int)(Math.random()*99+6);
            int dinero = (int)(Math.random()*2000+100);
            publico.add(new Espectador(nombre,edad,dinero));
            letra++;
        }
        peri.setEspectadores(publico);
    }
    
    public void mostrarEspectadores(Sala peri){
        for (int i = 0; i < 64; i++) {
            System.out.println("Nombre: "+peri.getEspectadores().get(i).getNombre() +'\n'+ "Edad: "+peri.getEspectadores().get(i).getEdad() +
                    '\n'+ "Bille disponible: " + peri.getEspectadores().get(i).getDinero());
            
        }
    }
    public void ubicarEspectador(){
        
    }

    
}
