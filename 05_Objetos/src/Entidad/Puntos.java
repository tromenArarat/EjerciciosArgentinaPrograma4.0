package Entidad;

import java.util.Scanner;

public class Puntos {
    // Atributos
    private int x1,x2,y1,y2;

    // Constructor vacío
    public Puntos() {
    }
    //Constructor con parámetros

    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    
        
public void crearPuntos(){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    System.out.println("Ingrese valor en la coordenada de x para el primer punto:");
    x1 = sc.nextInt();
    System.out.println("Ingrese valor en la coordenada de y para el primer punto:");
    y1 = sc.nextInt();
    System.out.println("Ingrese valor en la coordenada de x para el segundo punto:");
    x2 = sc.nextInt();
    System.out.println("Ingrese valor en la coordenada de y para el segundo punto:");
    y2 = sc.nextInt();
}

public double calcDistancia(){
     double resultado = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)); 
     return resultado;
}

    public int getX1() {
        return x1;
    }



}
