/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package trycatch;

import Entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatch {

    public static void main(String[] args) {    
        
//    ServiciosVector pepe = new ServiciosVector();
    
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
//        System.out.println("Número 1");
//        String num1 = sc.next();
//        System.out.println("Número 2");
//        String num2 = sc.next();
//        
//        DivisionNumero x = new DivisionNumero(num1,num2);
        
//        try{
//            System.out.println(x.pasarAint());
//        }catch(InputMismatchException e){
//            System.out.println("Se espera otro formato");
//        }catch(NumberFormatException a){
//            System.out.println("La cadena no puede convertirse a entero");
//        }catch(ArithmeticException b){
//            System.out.println("División por cero MAAl");
//        }
    try{
        int saludo = sc.nextInt();
        
    }catch(InputMismatchException e){
        System.out.println(e);
        
    }
        
    
            
    }
    
}
