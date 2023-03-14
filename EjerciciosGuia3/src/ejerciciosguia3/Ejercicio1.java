/*
 Crear un programa que dado un número determine si es par o impar.
 */
package ejerciciosguia3;

public class Ejercicio1 {
 
    public static void main(String[] args) {
    
     int num = (int) (Math.random() * 10);
     if (num % 2 == 0){
         System.out.println("El número " + num + " es par");
         
     }else{
         System.out.println("El número " + num + " es impar");
     }
    }
    
}
