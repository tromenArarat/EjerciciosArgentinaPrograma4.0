/*
El método charAt en Java se utiliza para obtener un carácter de una cadena en una posición específica. 

Este ejemplo crea una cadena cadena que contiene la frase "Hola Mundo". 
Luego, utiliza el método charAt para obtener el carácter en la posición 4, que es la letra "M". 
El carácter resultante se almacena en la variable caracter y se imprime en la consola utilizando System.out.println.

Es importante tener en cuenta que la indexación de una cadena en Java comienza en 0, 
por lo que el primer carácter de la cadena es el de la posición 0, el segundo es el de la posición 1, y así sucesivamente. 
En este ejemplo, la letra "M" está en la posición 4 porque se encuentra en la quinta posición de la cadena (contando desde 0).
 */
package ejemplos.string;

public class charA {

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        char caracter = cadena.charAt(4);
        System.out.println(caracter); // Salida: 'M'
    }
    
}
