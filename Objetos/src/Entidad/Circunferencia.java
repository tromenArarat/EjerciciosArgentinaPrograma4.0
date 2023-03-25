
package Entidad;

import java.util.Scanner;

public class Circunferencia {
    
    // Atributo
    private double radio;
    // Constructor
    public Circunferencia(double radio){
        this.radio = radio;
    }
    // Get y Set
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    // Métodos
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio:");
        Scanner sc = new Scanner(System.in);
        this.radio = sc.nextFloat();
    }
    public double area(){
        double area = (Math.pow((3.1416 * radio), 2));
        return area;
    }
    public double perimetro(){
        double perimetro = 2 * 3.1416 * radio;
        return perimetro;
    }
    
}
    
