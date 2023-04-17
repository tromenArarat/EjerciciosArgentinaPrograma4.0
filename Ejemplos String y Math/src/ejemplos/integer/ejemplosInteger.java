/*


compareTo(entero,
otroEntero)
Compara dos objetos Integer
numéricamente. Retorna 0 si son iguales,
entero negativo si el primer número es
menor o entero positivo si el primer número
es mayor.


doubleValue() Retorna el valor del Integer en tipo primitivo
double

equals(Object obj) Compara el Integer con el objeto del
parámetro. Devuelve true si son iguales y
false si no.

parseInt(String s) Convierte la cadena de caracteres numérica
del parámetro en tipo primitivo int.

toString() Retorna el valor del Integer en una cadena
de caracteres.

 */
package ejemplos.integer;

public class ejemplosInteger {

    public static void main(String[] args) {
        
        /*
            Integer(String s) Constructor que inicializa un objeto con una
            cadena de caracteres. Esta cadena debe
            contener un número entero.
        */
      
 
        
        
      // Ejemplo 1: convirtiendo una cadena en un objeto Integer
        String numeroComoString = "123";
        Integer numeroComoInteger = Integer.parseInt(numeroComoString);
        System.out.println(numeroComoInteger+1);

        // Ejemplo 2: convirtiendo un número entero en un objeto Integer
        int numeroEntero = 456;
        Integer numeroComoInteger2 = Integer.valueOf(numeroEntero);
        System.out.println(numeroComoInteger2+"Cadena");
        
        System.out.println(numeroComoInteger2.doubleValue());
        
        
        Integer numero1 = 10;

        Integer numero2 = 15;

        System.out.println("------------------------------------------------------");
        System.out.println("CompareTo: ");
        System.out.println("El numero " + numero1 + " comparado con " + numero2
                + " para saber si son iguales dio un resultado de " + numero1.compareTo(numero2));

        System.out.println("------------------------------------------------------");
        System.out.println("DoubleValue: ");

        double numReal = numero1.doubleValue();

        System.out.println("Numero transformado a real: " + numReal);

        System.out.println("------------------------------------------------------");
        System.out.println("Equals: ");
        System.out.println("El numero " + numero1 + " es igual a 10"
                + "/ Resultado: " + numero1.equals(10));

        System.out.println("------------------------------------------------------");
        System.out.println("ParseInt: ");

        int num = Integer.parseInt("20");

        System.out.println("La cadena pasada a num quedo: " + num);

        System.out.println("------------------------------------------------------");
        System.out.println("ToString: ");

        String numCadena = numero1.toString();

        System.out.println("El numero pasado a cadena quedo: " + numCadena);

        

    }
    
}
