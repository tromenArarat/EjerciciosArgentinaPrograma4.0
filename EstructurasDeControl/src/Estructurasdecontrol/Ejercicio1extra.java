/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package Estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio1extra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos minutos?");
        int minutos = sc.nextInt();
       
        int dias = minutos/1440;
        int horas = (minutos/60)-(dias*24);
        System.out.println("Equivale a " + dias + " días y " + horas + " horas.");
        
        
    }
    
}
