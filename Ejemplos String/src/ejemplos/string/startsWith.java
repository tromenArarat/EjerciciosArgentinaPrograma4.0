/*
    startsWith(String prefix)

    Retorna verdadero si el comienzo de la cadena 
    es igual al prefijo del parámetro.

 */
package ejemplos.string;

public class startsWith {

    public static void main(String[] args) {
        String saludo = "Buenas buenas";

        if (saludo.startsWith("Buenas")) {
        System.out.println("La cadena empieza con 'Buenas'");
        } else {
        System.out.println("La cadena no empieza con 'Buenas'");
        }
    }
    
}
