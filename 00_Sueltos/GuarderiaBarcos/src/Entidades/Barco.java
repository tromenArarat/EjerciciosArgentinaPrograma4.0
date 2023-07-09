
package Entidades;

public class Barco{
    
    protected String matrícula;
    protected int eslora;
    protected int anioFabricación;

    // Fabio sugiere un constructor vacío
    public Barco(String matrícula, int eslora, int anioFabricación) {
        this.matrícula = matrícula;
        this.eslora = eslora;
        this.anioFabricación = anioFabricación;
    }  
    
}
