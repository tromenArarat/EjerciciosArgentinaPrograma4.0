
package Entidades;

import java.time.LocalDate;


public class Amotor extends Alquiler{
    
    private int potenciaCV;

    public Amotor(Cliente nombre, LocalDate fechaAlq, LocalDate fechaDev, int posAmarre, Barco bote, String matrícula, int eslora, int anioFabricación) {
        super(nombre, fechaAlq, fechaDev, posAmarre, bote, matrícula, eslora, anioFabricación);
    }
@Override
    public int calcularAlquiler(){
        int diasOcupacion = fechaAlq.until(fechaDev).getDays();
        int resultado = diasOcupacion*((bote.eslora*10)+potenciaCV);
        return resultado;
    }
   
    
    
}
