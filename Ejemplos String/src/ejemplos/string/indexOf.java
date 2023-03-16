/*
El método indexOf en Java se utiliza para obtener la posición de 
la primera aparición de una subcadena dentro de una cadena.

Este ejemplo crea una cadena cadena que contiene la frase "Hola Mundo". 
Luego, utiliza el método indexOf para obtener la posición de la subcadena "Mundo" dentro de la cadena. 
El método devuelve la posición de la primera aparición de la subcadena, o -1 si la subcadena no se encuentra en la cadena. 
En este caso, la subcadena "Mundo" aparece por primera vez en la posición 5 de la cadena. 
El programa imprimirá "La subcadena 'Mundo' aparece por primera vez en la posición 5." en la consola.

Es importante tener en cuenta que indexOf distingue entre mayúsculas y minúsculas, 
lo que significa que la subcadena debe coincidir en capitalización con la cadena original 
para ser considerada una coincidencia. Si se desea realizar una búsqueda que ignore la capitalización, 
se puede convertir tanto la cadena como la subcadena a minúsculas (o mayúsculas) 
antes de realizar la búsqueda con indexOf.
 */
package ejemplos.string;

public class indexOf {

    public static void main(String[] args) {
    String cadena = "Hola Mundo";
    int posicion = cadena.indexOf("Mundo");
    if (posicion >= 0) {
    System.out.println("La subcadena 'Mundo' aparece por primera vez en la posición " + posicion + ".");
    } else {
    System.out.println("La subcadena 'Mundo' no se encuentra en la cadena.");
    }
    }
    
}
