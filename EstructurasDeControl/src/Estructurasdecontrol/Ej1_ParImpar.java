/*
 Crear un programa que dado un número determine si es par o impar.
 */
package Estructurasdecontrol;

public class Ej1_ParImpar {
 
    public static void main(String[] args) {
    
     int num = (int) (Math.random() * 10);
     if (num % 2 == 0){
         System.out.println("El número " + num + " es par");
         
     }else{
         System.out.println("El número " + num + " es impar");
     }
    }
    
}
