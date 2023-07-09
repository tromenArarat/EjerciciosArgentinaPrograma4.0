/*
Vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
 */
package Entidades;

public interface calculoFormas {
    
    public final double pi = 3.1416;
    
    public void calcularArea();
    public void calcularPerimetro();
    
}
