/*
Patova
 */
package ejercicios;

import java.util.Scanner;

public class Patova {
    
    public static void main(String[] args) {
             confirmacion();
    }
    
    public static void confirmacion() {
        Scanner leer = new Scanner(System.in);    
        String nombre;
        int edad;
        System.out.println("desea ingresar un nuevo dato? (s/n)");
        String opc = leer.next();
        while (opc.equals("s")) {
            
            System.out.println("ingrese nombre: ");
            nombre=leer.next();
            
            System.out.println("ingrese edad: ");
            edad=leer.nextInt();
            
            if (edad>=18) {
                System.out.println(nombre+" es mayor de edad.");
            }
            else {
                System.out.println(nombre+" es menor.");
            }
            System.out.println("desea ingresar un nuevo dato? (s/n)");
            opc = leer.next();
        }   
    }
    
}
