/*
El método replace en Java se utiliza para reemplazar todas las 
ocurrencias de un carácter o subcadena en una cadena con otra.

Este ejemplo crea una cadena cadena que contiene la frase "Hola Mundo". 
Luego, utiliza el método replace para reemplazar todas las ocurrencias 
de la subcadena "Mundo" en la cadena con la subcadena "Planeta". 
El método devuelve una nueva cadena con la subcadena reemplazada. 
En este caso, la nueva cadena será "Hola Planeta". 
El programa imprimirá "La nueva cadena es Hola Planeta." en la consola.

Es importante tener en cuenta que replace devuelve una nueva cadena 
con los caracteres reemplazados. La cadena original no se modifica.
 */
package ejemplos.string;

public class replace {

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        String nuevaCadena = cadena.replace("Mundo", "Planeta");
        System.out.println("La nueva cadena es " + nuevaCadena + ".");

    }
    
}
