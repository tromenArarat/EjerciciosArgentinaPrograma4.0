/*

 */
package Servicios;

import java.util.Arrays;
import java.lang.Integer;

public class ArregloService {
/*
    Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
    */
    public void inicializarA(double[] vectorA){
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (Math.random()*10+1);
        }
    }
    
    
    /*
    Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
    */
    public void mostrar(double[] vector){
        
        
        System.out.println(Arrays.toString(vector));
        
//        for (int i = 0; i < vector.length; i++) {
//            System.out.print(vector[i]);
//            
//        }
    }
    
    /*
    Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
    */
    public void sort(double[] vector){
        Arrays.sort(vector);
        double[] vectorNuevo = new double[vector.length];
        int contador=0;
        for (int i = vector.length-1; i >= 0; i--) {
            vectorNuevo[contador]=vector[i];
            contador++;
        }
        System.out.println(Arrays.toString(vectorNuevo));
    }
    
    /*
    Método inicializarB copia los primeros 10 números del arreglo A en el
    arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    */
    public void inicializarB(double vectorA[],double vectorB[]){
        
        for (int i = 0; i < 10; i++) {
            vectorB[i] = vectorA[i];
        }
        
        Arrays.fill(vectorB, 10, 19, 0.5);
   
//        
//        for (int i = 10; i < 20; i++) {
//            vectorB[i] = 0.5;
//        }
    }
    
}
