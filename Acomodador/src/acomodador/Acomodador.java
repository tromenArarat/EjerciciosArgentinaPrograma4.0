/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas).
 */
package acomodador;

import Servicios.CineServicios;

public class Acomodador {

    public static void main(String[] args) {

    CineServicios donPeri = new CineServicios();
    donPeri.crearCine();
    donPeri.crearEspectadores();
    donPeri.crearSala();
    donPeri.ubicarEspectador();
    donPeri.mostrarSala();
    
}
}
