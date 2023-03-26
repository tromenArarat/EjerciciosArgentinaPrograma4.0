
package Entidad;

import java.util.Scanner;

public class Rectangulo {
    // Atributos
    private int altura;
    private int base;
    // Constructores
    public Rectangulo(int altura, int base){
        this.altura = altura;
        this.base = base;
    }
    public Rectangulo(){    
    }
    // Getter y setter
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    // Métodos
    
    // Crear rectángulo con datos ingresados por el usuario
    public void crearRectangulo(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Altura:");
        this.altura = sc.nextInt();
        System.out.println("Base:");
        this.base = sc.nextInt();
    }
    // Calcular la superficie del rectángulo 
    public int superficie(){
    int superficie = altura*base;
    return superficie;
}
    // Calcular perímetro del rectángulo
    public int perimetro(){
    int perimetro = (altura*2)+(base*2);
    return perimetro;
}
    // Método que dibujará el rectángulo mediante asteriscos usando la base y la altura
    public void dibujo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i==0 || i==(altura-1) || j==0 || j==(base-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }                
            }
            System.out.print('\n');
        }
    }
}
