/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package ejercicios;

import java.util.Scanner;

public class CarmenSanDiego {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE 20 NUMEROS:");
        int num;
        int c = 0;
        int suma = 0;
        do {
            num = leer.nextInt();
            c++;
            if (num > 0) {
                suma = num + suma;
            }else if (num == 0){
                System.out.println("Se capturó el número cero");
                break;
            }
        }while(c != 20);
        System.out.println("La suma de los números positivos ingresados es igual a " + " " + suma);
        
    }
}
