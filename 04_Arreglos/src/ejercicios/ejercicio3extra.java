/*
Crear una función que rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package ejercicios;

public class ejercicio3extra {

    public static void main(String[] args) {
        int arreglo[]=new int[5];
        
        // Llamada a la función de relleno.
        rellenameVector(arreglo);
        
               
        // Llamada a la función de imprimir.   
        imprimirVector(arreglo);
    }
    
    public static int[] rellenameVector(int vector[]){
        int[] relleno=new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) (Math.random()*10);
        }
        return relleno;
}
    public static void imprimirVector(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
            
        }
}
    
}

