/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
*/
package ejercicios;

import java.util.Scanner;

public class Ex07_MaxMinProm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        int i = 0;
        int card = 1;
        int max = 0;
        int min = 0;
//        int aux = 0;
        System.out.println("¿Cuántos números va a ingresar?");
        int n = sc.nextInt();
        
        do{
            System.out.println(card+"° número:");
            num = sc.nextInt();
            if(num>max){
                max = num;
                }else if(num<min){
                min=num;
            }
            suma = suma + num;
//            aux = num;
            i++;
            card++;
        }while(i!=n);
        int prom = suma / n;
        System.out.println("Máximo: " + max + " Mínimo: " + min + " Promedio: " + prom);
    }
    
}
