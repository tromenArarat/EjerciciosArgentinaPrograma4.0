/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2.
 */
package ejercicios;

import Entidad.Operacion;
import java.util.Scanner;

public class Ej3_Calculadora {

    public static void main(String[] args) {
        
        Operacion calc = new Operacion();
        calc.crearOperacion();
        String confirmacion = "no";
        do{
        
        System.out.println("Presione:" + "\n" + "1 para Sumar || 2 para Restar" + "\n" + "3 para Multiplicar || 4 para Dividir" + "\n" + "5 para Salir");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        String rta = sc.next();
        
        switch(rta){
           case "1":
               System.out.println(calc.sumar(calc.getNum1(), calc.getNum2()));
           break;
           case "2":
               System.out.println(calc.restar(calc.getNum1(), calc.getNum2()));
           break;
           case "3":
               System.out.println(calc.multiplicar(calc.getNum1(), calc.getNum2()));
           break;
           case "4":
               System.out.println(calc.dividir(calc.getNum1(), calc.getNum2()));
           break;
           case "5":
               System.out.println("¿Está seguro de que desea salir?");
               confirmacion = sc.next();
           break;
       }
        
}while("no".equals(confirmacion));
        
        
}
}
