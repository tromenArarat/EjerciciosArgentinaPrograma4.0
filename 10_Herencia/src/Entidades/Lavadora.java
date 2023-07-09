/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.

Los constructores que se implementarán serán:
Un constructor vacío.
Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.

Método get y set del atributo carga.

 */
package Entidades;

public class Lavadora extends Electrodomesticos{
    
    public int carga;

    public Lavadora() {
    }
    
    public Lavadora(double precio, String color, char consumo, int peso, int carga){
        super(precio,color,consumo,peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
     /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.
    */
    
        @Override
    public double precioFinal() {

        double result = 0;

        double cargaP;
        if (carga == 2) {
            cargaP = 500;
        }else{
            cargaP=0;
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

            result = 1000 + precio + pesoP + cargaP;

        } else if (consumo == 'B') {
            result = 800 + precio + pesoP + cargaP;
        } else if (consumo == 'C') {
            result = 600 + precio + pesoP + cargaP;
        } else if (consumo == 'D') {
            result = 500 + precio + pesoP + cargaP;
        } else if (consumo == 'E') {
            result = 300 + precio + pesoP + cargaP;
        } else if (consumo == 'F') {
            result = 100 + precio + pesoP + cargaP;
        }

        return result;
    }
}
