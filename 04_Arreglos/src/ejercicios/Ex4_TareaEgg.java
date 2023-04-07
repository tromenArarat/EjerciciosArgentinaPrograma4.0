/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package ejercicios;

import java.util.Scanner;

public class Ex4_TareaEgg {

    public static void main(String[] args) {
       // Creo una matriz para las notas y un vector para el promedio.
        int[][] notas=new int[10][4];
        double[] promedio=new double[notas.length];
        int suma;
        // Lleno las notas con número aleatorios entre 1 y 10.
                // ¿Cómo buscar la longitud de la matriz notas? notas.length para la 1era dimension
                // y notas[0].length para la segunda.
                
        System.out.println("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = (int)(Math.random() *9+2);
                System.out.print(notas[i][j]);
            }
            // Cargo el vector promedio.
            promedio[i] = (notas[i][0]*0.1)+(notas[i][1]*0.15)+(notas[i][2]*0.25)+(notas[i][3]*0.5);
                System.out.println("");
        }
        
        System.out.println("--------------");
        
        System.out.println("Promedios: ");
        for (int i = 0; i < promedio.length; i++) {
            System.out.println(promedio[i]);
        }
        
        int sumaDesaprobados = 0;
        int sumaAprobados = 0;
        
        for (int i = 0; i < promedio.length; i++) {
            if(promedio[i]<7){
                sumaDesaprobados++;
            }else{
                sumaAprobados++;
            }
        }
        System.out.println("--------------");
        
        System.out.println("La suma de aprobados es "+sumaAprobados);
        System.out.println("La suma de desaprobados es "+sumaDesaprobados);
        
    }
}

        