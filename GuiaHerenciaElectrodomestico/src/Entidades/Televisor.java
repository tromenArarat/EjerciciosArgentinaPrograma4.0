/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.

Los constructores que se implementarán serán:

• Un constructor vacío.

• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
 */
package Entidades;

public class Televisor extends Electrodomesticos {
    
    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }
    
    public Televisor(double precio, String color, char consumo, int peso, int resolucion, boolean TDT){
        super(precio,color,consumo,peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }
    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio.
    */
    
     @Override
    public double precioFinal() {

        double result = 0;
        
        double antenaTdt = 0;
        if(TDT){
            antenaTdt = 500;
        }

        
        double pesoP;
        if (peso < 20) {
            pesoP = 100;
        } else if (peso > 19 & peso < 50) {
            pesoP = 500;
        } else if (peso > 49 & peso < 80) {
            pesoP = 800;
        } else {
            pesoP = 1000;
        }

        if (consumo == 'A') {

            result = 1000 + precio + pesoP +antenaTdt;

        } else if (consumo == 'B') {
            result = 800 + precio + pesoP + antenaTdt ;
        } else if (consumo == 'C') {
            result = 600 + precio + pesoP + antenaTdt;
        } else if (consumo == 'D') {
            result = 500 + precio + pesoP + antenaTdt;
        } else if (consumo == 'E') {
            result = 300 + precio + pesoP + antenaTdt;
        } else if (consumo == 'F') {
            result = 100 + precio + pesoP + antenaTdt;
        }
        
      if (resolucion == 2) {
           result = result*1.3;
        }

        return result;
    }
    
}
