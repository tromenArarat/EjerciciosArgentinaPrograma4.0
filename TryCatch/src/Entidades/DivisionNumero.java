/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package Entidades;

import static java.lang.Integer.parseInt;

public class DivisionNumero {
    
    private String num1;
    private String num2;

    public DivisionNumero() {
    }

    public DivisionNumero(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
   public int pasarAint(){
       int num1a = parseInt(num1);
       int num2a = parseInt(num2);
       return num1a/num2a;
       
   }
    
}
