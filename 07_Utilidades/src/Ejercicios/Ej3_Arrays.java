/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. 

En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.

*/
package Ejercicios;

import Servicios.ArregloService;

public class Ej3_Arrays {

  
    public static void main(String[] args) {
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];

        ArregloService plomero = new ArregloService();
       
       plomero.inicializarA(vectorA);
        System.out.println("");
       plomero.mostrar(vectorA);
        System.out.println("");
       plomero.sort(vectorA);
        System.out.println("");
       plomero.inicializarB(vectorA, vectorB);
        System.out.println("");
       plomero.mostrar(vectorA);
        System.out.println("");
       plomero.mostrar(vectorB);
       
    }
    
}
