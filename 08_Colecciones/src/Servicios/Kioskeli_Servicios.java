/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). 

El HashMap tendrá de llave el nombre del producto y de valor el precio.
 */
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kioskeli_Servicios {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String,Integer> stock = new HashMap();
    
    public void agregarItem(){
        System.out.println("Nombre del item que desea agregar:");
        String nuevo = sc.next();
        System.out.println("Precio:");
        int precio = sc.nextInt();
        
        stock.put(nuevo,precio);
        
    }
    
    public void modificarPrecio(){
        
        System.out.println("Item que desea remarcar:");
        String item = sc.next();
        
        for (Map.Entry<String,Integer> entry : stock.entrySet()){
            if(entry.getKey().equals(item)){
                System.out.println("Ingrese nuevo valor:");
                int nuevo = sc.nextInt();
                entry.setValue(nuevo);
            }
        }
            
    }

    // Remove(llave): Este método remueve la primera aparición de la llave de un elemento a borrar en un mapa
    public void eliminarProducto(){
        System.out.println("Item que desea eliminar:");
        String item = sc.next();
        
        for (String producto : stock.keySet()) {
            if(producto.equals(item)){
                stock.remove(producto);
            }
        }
    }
    
    
    public void mostrarMapa(){
        for (Map.Entry<String,Integer> entry : stock.entrySet()){
            System.out.println("Item: "+ entry.getKey());
            System.out.println("Precio: "+ entry.getValue());
        }
    }
}
