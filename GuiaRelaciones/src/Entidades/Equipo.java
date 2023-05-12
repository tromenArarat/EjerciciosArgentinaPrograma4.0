package Entidades;

import java.util.ArrayList;

public class Equipo {

    private String club;
    private ArrayList<Jugador> jugadores;
    

    public Equipo() {
    }

     
    public Equipo(String nombre, ArrayList<Jugador> cracks) {
        this.club = nombre;    
        this.jugadores = cracks;
       
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return club;
    }

    public void setNombre(String nombre) {
        this.club = nombre;
    }
    
    
    

    
}
