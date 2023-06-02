
package Entidades;


public class Amotor extends Barco{
    
    private int potenciaCV;

    public Amotor(int potenciaCV, String matrícula, int eslora, int anioFabricación) {
        super(matrícula, eslora, anioFabricación);
        this.potenciaCV = potenciaCV;
    }
    
    
}
