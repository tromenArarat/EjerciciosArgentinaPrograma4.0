
package Entidades;

import Interfaz.InterfaceAlquiler;

public class Barco implements InterfaceAlquiler{
    
    protected String matrícula;
    protected int eslora;
    protected int anioFabricación;

    public Barco(String matrícula, int eslora, int anioFabricación) {
        this.matrícula = matrícula;
        this.eslora = eslora;
        this.anioFabricación = anioFabricación;
    }

    @Override
    public int calcularAlquiler() {
        int resultado;
        resultado = VALORMODULO;
        return resultado;
    }
    
    
    
    
}
