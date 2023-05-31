
package Entidades;

import java.util.LinkedList;

public class Malandra {
     private LinkedList<Carta> mano = new LinkedList();
     private boolean canto = false;
     private boolean quiere = false;
     private String queCanto = "";
     private Carta primera;
     private Carta segunda;
     private Carta tercera;

    public Malandra() {
    }

    public boolean isCanto() {
        return canto;
    }

    public void setCanto(boolean canto) {
        this.canto = canto;
    }

    public String getQueCanto() {
        return queCanto;
    }

    public void setQueCanto(String queCanto) {
        this.queCanto = queCanto;
    }

    
    
    public LinkedList<Carta> getMano() {
        return mano;
    }
    

    public void setMano(LinkedList<Carta> mano) {
        this.mano = mano;
    }

    public Carta getPrimera() {
        return primera;
    }

    public void setPrimera(Carta primera) {
        this.primera = primera;
    }

    public Carta getSegunda() {
        return segunda;
    }

    public void setSegunda(Carta segunda) {
        this.segunda = segunda;
    }

    public Carta getTercera() {
        return tercera;
    }

    public void setTercera(Carta tercera) {
        this.tercera = tercera;
    }
    
    
     
     
}
