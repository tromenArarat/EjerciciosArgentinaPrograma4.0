/*
Para ambos ejercicios deberán crear arrays en los que guardarán los objetos 
y del que elimarán en caso de hacerlo.

Ejercicio 1: Crear una aplicación de gestión de productos
Crea una clase llamada Producto que tenga los siguientes atributos: 
nombre, descripción y precio. 
Crea una clase llamada ServicioProducto que tenga los siguientes métodos: 
nombre, descripción y precio. . 

Crea una clase llamada Main donde puedas probar los métodos de la clase ServicioProducto.


 */
package Ejercicios;

import Entidades.Producto;
import Servicios.ProductoServicios;


public class Ex3_Ejercicios_extras {

    public static void main(String[] args) {
        
        
        Producto regalo = new Producto();
        
        ProductoServicios fletero = new ProductoServicios();
        
        fletero.modificarNombre(regalo);
        
        fletero.modificarDescripcion(regalo);
        
        fletero.modificarPrecio(regalo);
        
        
    }
    
}
