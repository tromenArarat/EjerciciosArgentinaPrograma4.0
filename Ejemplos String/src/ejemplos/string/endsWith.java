/*
El método endsWith en Java se utiliza para verificar 
si una cadena termina con una subcadena específica.

endsWith distingue entre mayúsculas y minúsculas, 
lo que significa que la subcadena debe coincidir en capitalización 
con el final de la cadena original para ser considerada una coincidencia. 

Si se desea realizar una verificación que ignore la capitalización, 
se puede convertir tanto la cadena como la subcadena a minúsculas 
(o mayúsculas) antes de realizar la verificación con endsWith.
 */
package ejemplos.string;

public class endsWith {

    public static void main(String[] args) {
        String esPregunta = "Mañana paso?";
        if (esPregunta.endsWith("?")) {
            System.out.println("Es pregunta");
        } else {
            System.out.println("No es pregunta");
        }
    }  
}
