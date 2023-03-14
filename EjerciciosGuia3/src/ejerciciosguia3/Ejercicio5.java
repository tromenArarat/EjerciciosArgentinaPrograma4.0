/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial
 */
package ejerciciosguia3;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor máximo:");
        int max = sc.nextInt();
        int suma = 0;
        
        do {
        System.out.println("Ingrese número a sumar");
        int x = sc.nextInt();
        suma = x + suma;      
        }while (suma<max);
        
        System.out.println("La suma es " + suma);
    
}
}