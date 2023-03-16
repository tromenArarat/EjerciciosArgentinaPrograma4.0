/*
El método endsWith en Java se utiliza para verificar si una cadena termina con una subcadena específica.

Este ejemplo crea una cadena cadena que contiene la frase "Hola Mundo".
Luego, utiliza el método endsWith para verificar si la cadena termina con la subcadena "Mundo". 
Como la cadena sí termina con la subcadena, el programa imprimirá "La cadena termina con la subcadena 'Mundo'." en la consola.

Es importante tener en cuenta que endsWith distingue entre mayúsculas y minúsculas, 
lo que significa que la subcadena debe coincidir en capitalización con el final de la cadena original 
para ser considerada una coincidencia. Si se desea realizar una verificación que ignore la capitalización, 
se puede convertir tanto la cadena como la subcadena a minúsculas (o mayúsculas) 
antes de realizar la verificación con endsWith.
 */
package ejemplos.string;

public class endsWith {

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        if (cadena.endsWith("Mundo")) {
            System.out.println("La cadena termina con la subcadena 'Mundo'.");
        } else {
            System.out.println("La cadena no termina con la subcadena 'Mundo'.");
        }
    }  
}
