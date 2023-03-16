/*
replace retorna una nueva cadena reemplazando los caracteres del
primer parámetro con el carácter del segundo parámetro.

Es importante tener en cuenta que replace devuelve una nueva cadena 
con los caracteres reemplazados. La cadena original no se modifica.
 */
package ejemplos.string;

public class replace {

    public static void main(String[] args) {
        String solucion = "La solución es homogénea";
        String nuevaSolucion = solucion.replace("homogénea", "heterogénea");
        System.out.println("Luego de incorporar dulce de leche " + nuevaSolucion.toLowerCase() + ".");

    }
    
}
