/*
La función toCharArray() en Java convierte una cadena de texto 
en un arreglo de caracteres.
 */
package ejemplos.string;

public class toCharArray {

    public static void main(String[] args) {
      String palabra = "caracono";
      char[] arreglo = palabra.toCharArray();

      //Imprimimos el arreglo de caracteres
      for (char c : arreglo) {
         System.out.print(c + " ");
      }
    }
    
}
