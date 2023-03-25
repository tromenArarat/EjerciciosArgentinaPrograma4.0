/*
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package ejercicios;

import java.util.Scanner;

public class AndyOr {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("Los dos números son mayores a 25");

        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Alguno de los dos es mayor a 25");
        } else {
            System.out.println("Ninguno es mayor a 25");
        }
}
}
    
