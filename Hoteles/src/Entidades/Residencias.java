/*
Para las residencias se indica 
- la cantidad de habitaciones, 
- si se hacen o no descuentos a los gremios y 
- si posee o no campo deportivo.
 */
package Entidades;

public class Residencias extends Extrahotelero{
    private int cantHab;
    private boolean descGrem;
    private boolean campoDepor;

    public Residencias(int cantHab, boolean descGrem, boolean campoDepor, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, encargado);
        this.cantHab = cantHab;
        this.descGrem = descGrem;
        this.campoDepor = campoDepor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDescGrem() {
        return descGrem;
    }
    
    
}
