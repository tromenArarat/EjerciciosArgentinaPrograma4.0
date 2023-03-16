/*
    length retorna la longitud de la cadena

    Es importante tener en cuenta que length cuenta
    todos los caracteres de la cadena, incluyendo 
    los espacios en blanco y los caracteres especiales. 
    
    Si se desea contar solo los caracteres visibles, 
    se puede utilizar un bucle para recorrer la cadena 
    y contar solo los caracteres que no sean espacio en blanco.
 */
package ejemplos.string;

public class length {

    public static void main(String[] args) {
        String palabra = "periscopio";
        int longitud = palabra.length();
        System.out.println("La palabra tiene " + longitud + " letras.");

    }
    
}
