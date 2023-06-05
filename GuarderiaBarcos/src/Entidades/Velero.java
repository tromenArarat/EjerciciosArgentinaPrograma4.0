
package Entidades;

import java.time.LocalDate;

public class Velero extends Alquiler{
    
    private int numMastiles;

    public Velero(int numMastiles, Cliente nombre, LocalDate fechaAlq, LocalDate fechaDev, int posAmarre, Barco bote, String matrícula, int eslora, int anioFabricación) {
        super(nombre, fechaAlq, fechaDev, posAmarre, bote, matrícula, eslora, anioFabricación);
        this.numMastiles = numMastiles;
    }

    @Override
    public int calcularAlquiler(){
        int diasOcupacion = fechaAlq.until(fechaDev).getDays();
        int resultado = diasOcupacion*((bote.eslora*10)+numMastiles);
        return resultado;
    }
  

}
