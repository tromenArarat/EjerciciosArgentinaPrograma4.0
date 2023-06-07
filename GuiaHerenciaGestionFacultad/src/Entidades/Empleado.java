/*
 empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 */
package Entidades;

import java.util.Date;


public abstract class Empleado extends Persona{
    
    protected Date incorporacion;
    protected int despacho;

    public Empleado() {
    }
    
    public Empleado(Date incorporacion, int despacho, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
    }
    
    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public int getDespacho() {
        return despacho;
    }
    
    
    
}
