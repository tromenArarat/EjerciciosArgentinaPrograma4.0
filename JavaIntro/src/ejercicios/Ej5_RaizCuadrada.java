/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejercicios;
import java.util.Scanner;
public class Ej5_RaizCuadrada {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num1 = leer.nextInt();
        double raiz = Math.sqrt(num1);
        System.out.println("El doble del número ingresado es " + num1*2);
        System.out.println("El triple del número ingresado es " + num1*3);
        System.out.println("La raiz del número ingresado es " + raiz);
                
    }
    
}
