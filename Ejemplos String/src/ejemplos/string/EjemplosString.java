/*
El método concat en Java se utiliza para unir dos cadenas (strings) en una sola. 
Aquí hay algunos ejemplos de cómo se puede usar:
 */
package ejemplos.string;

public class EjemplosString {

    public static void main(String[] args) {
        
        /*
        Ejemplo 1: Concatenar dos cadenas
        Este ejemplo crea dos cadenas, cadena1 y cadena2, y luego usa el método 
        concat para unirlas en una sola cadena resultado.
        */
        String cadena1 = "Hola ";
        String cadena2 = "Mundo!";
        String resultado = cadena1.concat(cadena2);
        System.out.println(resultado); // Salida: "Hola Mundo!"
        
        /*
        Ejemplo 2: Concatenar múltiples cadenas.
        Este ejemplo concatena siete cadenas diferentes utilizando el método concat en cadena.
        */
       
        String cadena3 = "El ";
        String cadena4 = "rápido ";
        String cadena5 = "zorro ";
        String cadena6 = "marrón ";
        String cadena7 = "saltó ";
        String cadena8 = "sobre ";
        String cadena9 = "el perro perezoso.";
        String resultado2 = cadena3.concat(cadena4).concat(cadena5).concat(cadena6).concat(cadena7).concat(cadena8).concat(cadena9);
        System.out.println(resultado2); // Salida: "El rápido zorro marrón saltó sobre el perro perezoso."
        
        /*
        Ejemplo 3: Concatenar cadenas con valores numéricos
        En este ejemplo, se concatenan dos cadenas junto con el resultado de la suma de dos valores numéricos. 
        Para hacer esto, se utiliza el método toString para convertir el resultado de la suma en una cadena 
        antes de concatenarlo con la cadena original.
        */
        
        int num1 = 10;
        int num2 = 20;
        String cadena10 = "El resultado de la suma es: ";
        String cadena11 = Integer.toString(num1 + num2);
        String resultado3 = cadena10.concat(cadena11);
        System.out.println(resultado3); // Salida: "El resultado de la suma es: 30"

        
    }
    
}
