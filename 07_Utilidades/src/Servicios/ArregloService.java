/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;

public class ArregloService {
/*
    Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
    */
    public void inicializarA(double[] vectorA){
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) (Math.random()*10+1);
        }
    }
    /*
    Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
    */
    public void mostrar(double[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            
        }
    }
    
    /*
    Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
    */
    public void sort(double[] vector){
        Arrays.sort(vector);
    }
    
    /*
    Método inicializarB copia los primeros 10 números del arreglo A en el
    arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    */
    public void inicializarB(double vectorA[],double vectorB[]){
        for (int i = 0; i < 10; i++) {
            vectorB[i] = vectorA[i];
        }
        for (int i = 10; i < 20; i++) {
            vectorB[i] = 0.5;
        }
    }
    
}
