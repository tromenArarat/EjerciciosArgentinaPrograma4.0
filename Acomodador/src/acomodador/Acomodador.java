/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). 


 */
package acomodador;

import Entidades.Cine;
import Entidades.Sala;
import Servicios.CineServicios;
import Servicios.EspectadorServicios;
import Servicios.SalaServicios;

public class Acomodador {

    public static void main(String[] args) {

        Sala cineSocha = new Sala();
        
        SalaServicios acomodador = new SalaServicios();
        EspectadorServicios boletero = new EspectadorServicios();
        
        acomodador.llenarSala(cineSocha);
        acomodador.mostrarSala(cineSocha);
        
        boletero.crearEspectadores(cineSocha);
//        boletero.mostrarEspectadores(cineSocha);
        
        
        
        CineServicios zoilo = new CineServicios();
        Cine hoyDia = zoilo.crearCine(cineSocha);
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                 boletero.ubicarEspectador(cineSocha, cineSocha.getEspectadores()[i][j], hoyDia);
                
            }
            
        }
        
       acomodador.mostrarSala(cineSocha);
        
    }
    
}
