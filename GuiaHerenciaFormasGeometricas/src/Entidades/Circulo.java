/*
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package Entidades;

public class Circulo implements calculoFormas {
    
    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = pi* (Math.pow(radio,2));
        }

    @Override
    public void calcularPerimetro() {
        double perimetro = pi * (radio*2);
    }
    
}
