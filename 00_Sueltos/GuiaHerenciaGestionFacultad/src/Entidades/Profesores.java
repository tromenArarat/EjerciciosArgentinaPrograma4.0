/*
s profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
package Entidades;

import java.util.Date;


public class Profesores extends Empleado {
    
    protected String depto;

    public Profesores() {
    }
    
    public Profesores(Date incorporacion, int despacho, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(incorporacion, despacho, nombre, apellido, id, estadoCivil);
    }

    public int getDespacho() {
        return despacho;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    
    
}
