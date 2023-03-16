/*
El método compareTo en Java se utiliza para comparar dos objetos y determinar su orden relativo. 
En el caso de las cadenas (strings), compareTo se utiliza para comparar dos cadenas y determinar su orden lexicográfico.

Este ejemplo crea dos cadenas cadena1 y cadena2, y luego utiliza el método compareTo para compararlas. 
En este caso, la letra "H" en "Hola" tiene un valor Unicode menor que la letra "A" en "Adiós", 
por lo que la cadena1 va antes de la cadena2 en el orden lexicográfico. 
El método compareTo devuelve un número negativo para indicar que la cadena1 va antes que la cadena2. 
El programa imprimirá "La cadena1 va antes que la cadena2." en la consola.

Es importante tener en cuenta que compareTo utiliza el orden lexicográfico, 
que se basa en el valor Unicode de los caracteres en las cadenas. Si dos cadenas tienen el mismo contenido pero 
difieren en capitalización, la cadena con caracteres en mayúsculas tendrá un valor Unicode menor que 
la cadena con caracteres en minúsculas, por lo que se considerará que va antes en el orden lexicográfico.

 */
package ejemplos.string;

public class compareTo {

    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";
        String cadena2 = "Adiós Mundo";
        int resultado = cadena1.compareTo(cadena2);
        if (resultado < 0) {
            System.out.println("La cadena1 va antes que la cadena2.");
        } else if (resultado > 0) {
            System.out.println("La cadena1 va después de la cadena2.");
        } else {
            System.out.println("Las cadenas son iguales.");
        }

    }
    
}
