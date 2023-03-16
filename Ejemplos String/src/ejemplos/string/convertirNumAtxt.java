/*
Java al ser un lenguaje de tipado estático, requiere que para pasar una variable
de un tipo de dato a otro necesitemos usar un conversor. Por lo que, para
convertir cualquier tipo de dato a un String, utilicemos la función valueOf(n).
 */
package ejemplos.string;

public class convertirNumAtxt {

    public static void main(String[] args) {
       int numEntero = 4;
       String numCadena = String.valueOf(numEntero);
       System.out.println(numCadena+"5");

    }
    
}
