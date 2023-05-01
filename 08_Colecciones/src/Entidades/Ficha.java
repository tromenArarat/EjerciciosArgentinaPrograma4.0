/*
    clase Ficha (de dominó) con su constructor y sus getters, con un toString() (que imprima el “seis-zero” como
    “6:0|” y con un método llamado “Ficha girarFicha()” que gire la ficha (el “6:0|” pasaría a ser “0:6|”)
 */
package Entidades;

import java.util.ArrayList;

public class Ficha {
    
    private ArrayList<String> ficha;

    public Ficha() {
    }

    public Ficha(ArrayList<String> ficha) {
        this.ficha = ficha;
    }

    public ArrayList<String> getFicha() {
        return ficha;
    }

    public void setFicha(ArrayList<String> ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return ficha+""; 
    }
    
    
     
    
    
}
