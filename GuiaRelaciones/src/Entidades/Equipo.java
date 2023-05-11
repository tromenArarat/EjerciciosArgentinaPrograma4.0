package Entidades;

import java.util.ArrayList;

public class Equipo {

    private ArrayList<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    

    
}
