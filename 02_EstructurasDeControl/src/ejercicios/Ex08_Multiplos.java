/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejercicios;

import java.util.Scanner;

public class Ex08_Multiplos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int contador = 0;
        int pares = 0;
        int impares = 0;
        System.out.println("Ingresa un número positivo:");
        do{
        num = sc.nextInt();
        if(num>0){
           contador++;
            if(num % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
        }while(num % 5 != 0);
        
        System.out.println("Números leídos: "+contador+'\n'+"Pares: "+pares+'\n'+"Impares: "+impares);
    }
    
}
