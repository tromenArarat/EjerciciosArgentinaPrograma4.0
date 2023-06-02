
package Entidades;


public class Yate extends Barco{
    
    private int potenciaCV;
    private int camarotes;

    public Yate(int potenciaCV, int camarotes, String matrícula, int eslora, int anioFabricación) {
        super(matrícula, eslora, anioFabricación);
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
    }

    
}
