/*
El método isEmpty en Java se utiliza para verificar si una cadena está vacía,
es decir, si no contiene ningún carácter.

Este ejemplo crea una cadena cadena vacía. Luego, utiliza el método isEmpty para verificar si la cadena está vacía. 
Como la cadena efectivamente no contiene ningún carácter, el programa imprimirá "La cadena está vacía." en la consola.

Es importante tener en cuenta que isEmpty solo devuelve verdadero si la cadena no contiene ningún carácter. 
Si la cadena contiene espacios en blanco o caracteres especiales, pero no contiene caracteres visibles, 
el método devolverá falso.
 */
package ejemplos.string;

public class isEmpty {

    public static void main(String[] args) {
       String cadena = "";
       if (cadena.isEmpty()) {
       System.out.println("La cadena está vacía.");
       } else {
       System.out.println("La cadena no está vacía.");
       }
    }
  
}
