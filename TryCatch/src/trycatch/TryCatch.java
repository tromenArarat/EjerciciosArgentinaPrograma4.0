/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package trycatch;

import Entidades.DivisionNumero;
import java.util.Scanner;


public class TryCatch {

    public static void main(String[] args) {    
        
//    ServiciosVector pepe = new ServiciosVector();
    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Número 1");
        String num1 = sc.next();
        System.out.println("Número 2");
        String num2 = sc.next();
        
        DivisionNumero x = new DivisionNumero(num1,num2);
        
        try{
            System.out.println(x.pasarAint());
        }catch(Exception e){
            System.out.println("Hubo un problema");
        }
        
        
        
//    try{
//        String[] supl = new String[3];
//        for (int i = 0; i < 4; i++) {
//           supl[i] = sc.next();
//            }
//        
//    }catch(ArrayIndexOutOfBoundsException e){
//        System.out.println("Olvidate");
//        
//    }
        
    
            
    }
    
}
