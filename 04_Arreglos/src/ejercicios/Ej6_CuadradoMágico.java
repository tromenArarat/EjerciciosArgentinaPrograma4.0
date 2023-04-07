/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejercicios;

import java.util.Scanner;

public class Ej6_CuadradoMágico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cubo[][]= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un número del 1 al 9 para la columna "+(j+1)+", fila "+(i+1));
                num = sc.nextInt();
                while(num<1||num>9){
                    System.out.println("Ingrese un número del 1 al 9");
                    num = sc.nextInt();
                }
                cubo[i][j] = num;       
            }
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+cubo[i][j]+"]");
            }
        System.out.println("");
        }
        
        System.out.println("---------------------------");
        
        int suma0 = 0;
        int suma00 = 0;
        int suma1 = 0;
        int suma11 = 0;
        int suma2 = 0;
        int suma22 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==0){
                    suma0+=cubo[i][j];
                }else if(i==1){
                    suma1+=cubo[i][j];
                }else if(i==2){
                    suma2+=cubo[i][j];
                }else if(j==0){
                    suma00+=cubo[i][j];
                }else if(j==1){
                    suma11+=cubo[i][j];
                }else if(j==2){
                    suma22+=cubo[i][j];
                }
            }
        }
        if(suma0==suma1 && suma2==suma1 && suma1==suma0 && suma00==suma11 && suma11==suma22 && suma22==suma00){
            System.out.println("El cuadrado es mágico");
        }else{
            System.out.println("El cuadrado no es mágico");
        }
    }
    }
