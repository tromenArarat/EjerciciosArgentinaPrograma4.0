/*
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
package Entidades;

import java.time.LocalDate;

public class Alquiler extends Barco{
    
    protected Cliente nombre;
    protected LocalDate fechaAlq;
    protected LocalDate fechaDev;
    protected int posAmarre;
    protected Barco bote;

    public Alquiler(Cliente nombre, LocalDate fechaAlq, LocalDate fechaDev, int posAmarre, Barco bote, String matrícula, int eslora, int anioFabricación) {
        super(matrícula, eslora, anioFabricación);
        this.nombre = nombre;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.posAmarre = posAmarre;
        this.bote = bote;
    }

    
    public int calcularAlquiler(){
        int diasOcupacion = fechaAlq.until(fechaDev).getDays();
        int resultado = diasOcupacion*(bote.eslora*10);
        return resultado;
        }

    
}
