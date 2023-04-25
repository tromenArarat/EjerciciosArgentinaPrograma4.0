
package Servicios;

import Entidades.Producto;
import java.util.Scanner;

public class ProductoServicios {
    
    private Scanner sc = new Scanner(System.in);
    
    public void modificarNombre(Producto item){
        System.out.println("Ingrese nombre:");
        item.setNombre(sc.next());
    }
    
    public void modificarDescripcion(Producto item){
    System.out.println("Ingrese descripción:");
        item.setDescripcion(sc.next());
        }
    
    public void modificarPrecio(Producto item){
        System.out.println("Nuevo precio:");
        item.setPrecio(sc.nextDouble());
    }
}

