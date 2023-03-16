/*
    El método split en Java se utiliza para dividir una cadena 
    en un arreglo de subcadenas, utilizando un separador especificado.
    
    Este ejemplo crea una cadena cadena que contiene una lista de frutas 
    separadas por comas. Luego, utiliza el método split para dividir la cadena 
    en un arreglo de subcadenas, utilizando la coma como separador. 
    El método devuelve un arreglo de cadenas, donde cada elemento es una subcadena 
    que se encuentra entre los separadores especificados. 
    En este caso, el arreglo contendrá cuatro elementos: 
    "Manzanas", "Naranjas", "Plátanos" y "Uvas".

    Finalmente, se utiliza un bucle for-each para recorrer 
    el arreglo e imprimir cada elemento en la consola.

    Es importante tener en cuenta que el separador especificado 
    puede ser cualquier cadena de caracteres. 
    Si se desea utilizar un separador que contenga caracteres especiales, 
    se debe escapar esos caracteres con una barra invertida.
*/
package ejemplos.string;

public class split {

    public static void main(String[] args) {
        String cadena = "Manzanas,Naranjas,Plátanos,Uvas";
        String[] arreglo = cadena.split(",");
        for (String elemento : arreglo) {
        System.out.println(elemento);
}
    }  
}
