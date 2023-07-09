package Entidades;

import java.util.ArrayList;

public class Estudiante extends Persona{
    
    private ArrayList<String> cursos = new ArrayList();

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
    }

    
            
}
