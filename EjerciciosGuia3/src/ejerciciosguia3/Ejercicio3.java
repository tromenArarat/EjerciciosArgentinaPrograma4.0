/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package ejerciciosguia3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Escribe una palabra de 8 letras:");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        if (frase.length()==8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
