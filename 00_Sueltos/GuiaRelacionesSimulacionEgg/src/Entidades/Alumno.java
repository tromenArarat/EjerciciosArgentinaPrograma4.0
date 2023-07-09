/*
    El sistema de votación de Egg tiene una clase llamada Alumno 
    con los siguientes atributos:
    nombre completo, DNI y cantidad de votos.
 */
package Entidades;

public class Alumno {
    
    private String nombre;
    private int dni;
    private int votos;

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        int dni = 23232321;
        int votos = 0;
    }

    
    
    public Alumno(String nombre, int dni, int votos) {
        this.nombre = nombre;
        this.dni = dni;
        this.votos = votos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    
    
    @Override
    public String toString() {
        return nombre;
    }
    
    


    
}
