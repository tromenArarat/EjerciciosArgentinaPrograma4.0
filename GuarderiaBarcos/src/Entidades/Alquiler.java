/*
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
package Entidades;

import Interfaz.InterfaceAlquiler;
import java.time.LocalDate;

public class Alquiler implements InterfaceAlquiler {
    
    protected Cliente nombre;
    protected LocalDate fechaAlq;
    protected LocalDate fechaDev;
    protected int posAmarre;
    protected Barco bote;

    public Alquiler(Cliente nombre, LocalDate fechaAlq, LocalDate fechaDev, int posAmarre, Barco bote) {
        this.nombre = nombre;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.posAmarre = posAmarre;
        this.bote = bote;
    }
    
    @Override
    public int calcularAlquiler(){
        int diasOcupacion = fechaAlq.until(fechaDev).getDays();
        int resultado = diasOcupacion*VALORMODULO;
        return resultado;
        }

    
}
