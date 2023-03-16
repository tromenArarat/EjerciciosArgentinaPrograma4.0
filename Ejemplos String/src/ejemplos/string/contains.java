/*
El método contains en Java se utiliza para verificar si una cadena contiene una subcadena específica.

Este ejemplo crea una cadena cadena que contiene la frase "Hola Mundo". 
Luego, utiliza el método contains para verificar si la cadena contiene la subcadena "Mundo". 
Como la cadena sí contiene la subcadena, el programa imprimirá "La cadena contiene la subcadena 'Mundo'." en la consola.

Es importante tener en cuenta que contains distingue entre mayúsculas y minúsculas, 
lo que significa que la subcadena debe coincidir en capitalización con la cadena original 
para ser considerada una coincidencia. Si se desea realizar una búsqueda que ignore la capitalización, 
se puede convertir tanto la cadena como la subcadena a minúsculas (o mayúsculas) 
antes de realizar la verificación con contains.
 */
package ejemplos.string;

public class contains {

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        if (cadena.contains("Mundo")) {
        System.out.println("La cadena contiene la subcadena 'Mundo'.");
        } else {
        System.out.println("La cadena no contiene la subcadena 'Mundo'.");
}
    }
    
}
