/*
 El método length en Java se utiliza para obtener la longitud de una cadena, 
es decir, el número de caracteres que contiene.

Este ejemplo crea una cadena cadena que contiene la frase "Hola Mundo". 
Luego, utiliza el método length para obtener la longitud de la cadena. 
El método devuelve un valor entero que representa el número de caracteres de la cadena. 
En este caso, la cadena contiene 10 caracteres. 
El programa imprimirá "La longitud de la cadena es 10." en la consola.

Es importante tener en cuenta que length cuenta todos los caracteres de la cadena, 
incluyendo los espacios en blanco y los caracteres especiales. 
Si se desea contar solo los caracteres visibles, se puede utilizar un bucle 
para recorrer la cadena y contar solo los caracteres que se deseen.
 */
package ejemplos.string;

public class length {

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        int longitud = cadena.length();
        System.out.println("La longitud de la cadena es " + longitud + ".");

    }
    
}
