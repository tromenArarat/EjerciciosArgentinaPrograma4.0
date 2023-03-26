/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
Scanner leer = new Scanner(System.in).useDelimiter("\n");
*/
package ejercicios;
import java.util.Scanner;

public class PasoToMayusc {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresá una frase:");
        String frase = leer.nextLine();
        // String frase2;
        // frase2 = frase.toLowerCase();
        System.out.println((frase).toUpperCase());
        
       
        /*
        OTRA MANERA DE RESOLVERLO
        Scanner leer = new Scanner(System.in).delimiter(\n);
        */
        
         /*
        OTRA MANERA DE RESOLVERLO
        Scanner leer = new Scanner(System.in).delimiter(\n);
        */
        
/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/



/*
        double grados;
        System.out.println("Ingrese grados centígrados");
        grados = leer.next();
        double Far = 32 +
        System.out.println(32 + (9 * grados  );
*/
        
    }
    
}
