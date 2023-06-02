
package Entidades;

import Interfaz.InterfaceAlquiler;

public class Velero extends Barco implements InterfaceAlquiler {
    
    private int numMastiles;

    public Velero(int numMastiles, String matrícula, int eslora, int anioFabricación) {
        super(matrícula, eslora, anioFabricación);
        this.numMastiles = numMastiles;
    }

    @Override
    public int calcularAlquiler() {
              
        return  1;
        
    }
    
    
    
}
