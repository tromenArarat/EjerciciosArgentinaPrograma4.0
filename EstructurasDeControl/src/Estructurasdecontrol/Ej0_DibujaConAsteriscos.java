/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20 e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
4 ****
3 ***
2 **

 */
package Estructurasdecontrol;

import java.util.Scanner;

public class Ej0_DibujaConAsteriscos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int num = (int) (Math.random() * 10);
            System.out.print(num);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }

    }
    
}
