/*
 Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package Estructurasdecontrol;

import java.util.Scanner;

public class Ej4_Substring {

    public static void main(String[] args) {
        
        System.out.println("Escribe una palabra o frase:");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
//        String letra = "a";
        if ("a".equalsIgnoreCase(frase.substring(0,1))){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
    

