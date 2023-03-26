/*
Elaborar un algoritmo en el cual se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package ejercicios;

import java.util.Scanner;

public class Ex04_NumerosRomanos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10:");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Equivalente en números romanos: I");
            break;
            case 2:
                System.out.println("Equivalente en números romanos: II");
            break;
            case 3:
                System.out.println("Equivalente en números romanos: III");
             break;
            case 4:
                System.out.println("Equivalente en números romanos: IV");
             break;
            case 5:
                System.out.println("Equivalente en números romanos: V");
           break;
            case 6:
                System.out.println("Equivalente en números romanos: VI");
             break;
            case 7:
                System.out.println("Equivalente en números romanos: VII");
             break;
            case 8:
                System.out.println("Equivalente en números romanos: VIII");
            break;
            case 9:
                System.out.println("Equivalente en números romanos: IX");
             break;
            case 10:
                System.out.println("Equivalente en números romanos: X");
             break;
            default:
                System.out.println("Entre uno y diez dije");
             break;   
        }
    
}
}
