/*
indexOf en Java se utiliza para obtener la posición de 
la primera aparición de una subcadena dentro de una cadena.

Este ejemplo crea una cadena cadena que contiene la frase "Rayando el sol". 
Luego, utiliza el método indexOf para obtener la posición de la subcadena 
"sol" dentro de la cadena. 

El método devuelve la posición de la primera aparición de la subcadena, 
o -1 si la subcadena no se encuentra en la cadena. 

En este caso, la subcadena "sol" aparece por primera vez en 
la posición 11 de la cadena. 

El programa imprimirá "La subcadena 'sol' aparece por primera vez 
en la posición 11." en la consola.

Es importante tener en cuenta que indexOf distingue 
entre mayúsculas y minúsculas, lo que significa que 
la subcadena debe coincidir en capitalización 
con la cadena original para ser considerada una coincidencia. 

Si se desea realizar una búsqueda que ignore la capitalización, 
se puede convertir tanto la cadena como la subcadena a minúsculas 
(o mayúsculas) antes de realizar la búsqueda con indexOf.
 */
package ejemplos.string;

public class indexOf {

    public static void main(String[] args) {
    String cadena = "Rayando el sol";
    int posicion = cadena.indexOf("sol");
    if (posicion >= 0) {
    System.out.println("La subcadena 'sol' aparece por primera vez en la posición " + posicion + ".");
    } else {
    System.out.println("La subcadena 'sol' no se encuentra en la cadena.");
    }
    }
    
}
