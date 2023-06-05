
package Entidades;

import java.util.LinkedList;

public class Malandra {
     private LinkedList<Carta> mano = new LinkedList();
     private boolean canto = false;
     private boolean seQuiere = false;
     private String queSeQuiere = "";
     
     private Carta primera;
     private Carta segunda;
     private Carta tercera;
     
     private int puntaje = 0;

    public Malandra() {
    }
    

    public boolean isCanto() {
        return canto;
    }

    public void setCanto(boolean canto) {
        this.canto = canto;
    }

    public String getQueSeQuiere() {
        return queSeQuiere;
    }

    public void setQueSeQuiere(String queSeQuiere) {
        this.queSeQuiere = queSeQuiere;
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


    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

  

    public boolean isSeQuiere() {
        return seQuiere;
    }

    public void setSeQuiere(boolean seQuiere) {
        this.seQuiere = seQuiere;
    }

    
}
