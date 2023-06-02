
package Entidades;

import java.util.LinkedList;

public class Malandra {
     private LinkedList<Carta> mano = new LinkedList();
     private boolean canto = false;
     private boolean seQuiere = false;
     private boolean jugo = false;
     private String queCanto = "";
     
     private Carta primera;
     private Carta segunda;
     private Carta tercera;
     
     private int puntaje;
     private boolean ipa = false;
     private int tantos;

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

    public boolean isJugo() {
        return jugo;
    }

    public void setJugo(boolean jugo) {
        this.jugo = jugo;
    }

    public boolean isIpa() {
        return ipa;
    }

    public void setIpa(boolean ipa) {
        this.ipa = ipa;
    }

    public int getTantos() {
        return tantos;
    }

    public void setTantos(int tantos) {
        this.tantos = tantos;
    }
    
    
     
     
}
