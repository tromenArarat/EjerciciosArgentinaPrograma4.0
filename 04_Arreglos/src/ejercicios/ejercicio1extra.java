/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package ejercicios;

import java.util.Scanner;

public class ejercicio1extra {

    public static void main(String[] args) {

    Scanner leer = new Scanner (System.in);
    int vectorTamanio; 
    int i; 
    int sumaVector=0;
    
    System.out.println("Ingrese el tamaño del vector:");
    vectorTamanio = leer.nextInt();
    int [] vector = new int [vectorTamanio];
    
    
    for (i=0; i<= vectorTamanio-1; i++){
        System.out.println("Ingrese los valores a sumar:");
        vector[i]=leer.nextInt();
    } 
    
//        for (i = 0; i < vector.length; i++) {
//            System.out.print(vector[i]+ " ");
//            
//        }
    
        for ( i = 0; i < vector.length; i++) {
            sumaVector+=vector[i];
              
            
        }
        System.out.println("El resultado es " + sumaVector);    
    }
    
}
    
    

