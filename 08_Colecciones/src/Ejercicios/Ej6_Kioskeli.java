/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.

Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). 

El HashMap tendrá de llave el nombre del producto y de valor el precio.

Realizar un menú para lograr todas las acciones previamente mencionadas
 */
package Ejercicios;

import Servicios.Kioskeli_Servicios;

public class Ej6_Kioskeli {

    public static void main(String[] args) {
        Kioskeli_Servicios roco = new Kioskeli_Servicios();
        roco.agregarItem();
        roco.agregarItem();
        roco.agregarItem();
        roco.agregarItem();
        
        roco.mostrarMapa();
        
        roco.eliminarProducto();
        
        roco.mostrarMapa();
        
        roco.modificarPrecio();
        
        roco.mostrarMapa();
    }
    
}
