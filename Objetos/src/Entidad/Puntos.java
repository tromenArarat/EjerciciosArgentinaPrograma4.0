package Entidad;

import java.util.Scanner;

public class Puntos {
    private int x1,x2,y1,y2;

    public Puntos() {
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

}
