/*
El método equals en Java se utiliza para comparar dos objetos para determinar si son iguales o no.

En el caso de las cadenas (strings), equals se utiliza para comparar dos cadenas y determinar si tienen el mismo contenido.

Este ejemplo crea dos cadenas cadena1 y cadena2, y luego utiliza el método equals para compararlas. 
En este caso, las dos cadenas son diferentes porque una tiene la letra "M" en mayúscula y la otra en minúscula. 
Por lo tanto, el programa imprimirá "Las cadenas son diferentes." en la consola.

Es importante tener en cuenta que equals distingue entre mayúsculas y minúsculas, lo que significa que dos cadenas 
que sean iguales en contenido pero diferentes en capitalización serán consideradas diferentes. 
Para realizar una comparación sin tener en cuenta la capitalización, se puede utilizar el método equalsIgnoreCase.
 */
package ejemplos.string;

public class equals {

    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";
        String cadena2 = "Hola mundo";
        if (cadena1.equals(cadena2)) {
        System.out.println("Las cadenas son iguales.");
        } else {
        System.out.println("Las cadenas son diferentes.");
        }
    }
  
}
