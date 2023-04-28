package Entidades;

import java.util.ArrayList;

public class Alumno {
    
    private String nombre;
    ArrayList<Integer> notas = new ArrayList();

    public Alumno(String nombre, ArrayList notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
}
