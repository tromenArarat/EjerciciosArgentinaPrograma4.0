/*
 persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil
 */
package Entidades;

public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int id;
    protected EstadoCivil estadoCivil;
    
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
 


    
}
