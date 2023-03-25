/*
Elaborar un algoritmo en el cual se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package Estructurasdecontrol;

import java.util.Scanner;

public class ejercicio3extra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra ="x";
        do{
        System.out.println("Ingrese una vocal:");
        letra = sc.nextLine();
        if("a".equals(letra)||"e".equals(letra)||"i".equals(letra)||"o".equals(letra)||"u".equals(letra)){
        continue;    
        }else{
            System.out.println("Error. Volver al jardín");
            break;
        }
    }while(letra.length()==1);
    
}
}
