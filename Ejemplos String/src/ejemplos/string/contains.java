/*
El método contains en Java se utiliza para verificar 
si una cadena contiene una subcadena específica.

contains distingue entre mayúsculas y minúsculas.

Si se desea realizar una búsqueda que ignore la capitalización, 
se puede convertir tanto la cadena como la subcadena 
a minúsculas (o mayúsculas) antes de realizar 
la verificación con contains.
 */
package ejemplos.string;

public class contains {

    public static void main(String[] args) {
        String improperio = "Yo a vos no te insulté, gil";
        if (improperio.contains("gil")) {
        System.out.println("El improperio contiene la palabra 'gil'");
        } else {
        System.out.println("El improperio no contiene la palabra 'gil'");
}
    }
    
}
