
package Entidades;

import java.time.LocalDate;


public class Yate extends Alquiler{
    
    private int potenciaCV;
    private int camarotes;

    public Yate(int potenciaCV, int camarotes, Cliente nombre, LocalDate fechaAlq, LocalDate fechaDev, int posAmarre, Barco bote, String matrícula, int eslora, int anioFabricación) {
        super(nombre, fechaAlq, fechaDev, posAmarre, bote, matrícula, eslora, anioFabricación);
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
    }

   

    @Override
    public int calcularAlquiler(){
        int diasOcupacion = fechaAlq.until(fechaDev).getDays();
        int resultado = diasOcupacion*((bote.eslora*10)+potenciaCV+camarotes);
        return resultado;
    }
    
}
