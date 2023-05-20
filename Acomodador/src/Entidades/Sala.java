/*
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila. A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
 */
package Entidades;

import java.util.ArrayList;


public class Sala {
    
    private ArrayList<Espectador> espectadores;
    private Asiento[][] asientos = new Asiento[8][6];

    public Sala() {
    }

    public Sala(ArrayList<Espectador> espectadores, Asiento[][] asientos) {
        this.espectadores = espectadores;
        this.asientos = asientos;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }
    
    
}
