/*
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila. A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
 */
package Entidades;

import java.util.ArrayList;


public class Sala {
    
   private Espectador[][] espectadores;
   private Asiento[][] butacax;

    public Sala() {
    }

    public Espectador[][] getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(Espectador[][] espectadores) {
        this.espectadores = espectadores;
    }

    public Asiento[][] getButacax() {
        return butacax;
    }

    public void setButacax(Asiento[][] butacax) {
        this.butacax = butacax;
    }

    public Sala(Espectador[][] espectadores, Asiento[][] butacax) {
        this.espectadores = espectadores;
        this.butacax = butacax;
    }


    
  
   
    
}
