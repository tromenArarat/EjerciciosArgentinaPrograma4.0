
package Servicios;

import Entidad.Rectang;
import java.util.Scanner;


public class RectangServicios {
    private Scanner sc = new Scanner(System.in);
    
    public Rectang crear_rectangulo(){
        System.out.println("Lado 1:");
        int lado1 = sc.nextInt();
        System.out.println("Lado 2:");
        int lado2 = sc.nextInt();
        return new Rectang(lado1,lado2);
    }
    
    // Crear Area
        public int crearArea(int lado1,int lado2) {
        int area = lado1*lado2;
        return area;
    }
}
