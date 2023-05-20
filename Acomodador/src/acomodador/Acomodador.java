/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). 


 */
package acomodador;

import Entidades.Sala;
import Servicios.SalaServicios;

public class Acomodador {

    public static void main(String[] args) {

        SalaServicios acomodador = new SalaServicios();
        acomodador.llenarSala();
        
        
    }
    
}
