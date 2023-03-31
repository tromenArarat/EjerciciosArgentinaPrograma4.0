/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */
package ejercicios;

import Entidad.Cocina;

public class Ejercicio4extra {

    public static void main(String[] args) {
        Cocina horno = new Cocina();
        horno.agregarReceta();
        
        //Fideos[0] = agua,sal,aceite,fideos
        
        
        horno.buscarReceta();
        
    }
    
}
