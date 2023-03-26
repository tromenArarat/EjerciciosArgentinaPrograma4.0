/*
Realizar un algoritmo que llene un vector de tamaño N 
con valores aleatorios 
y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y 
si se encuentra repetido
 */
package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
       
        int N = sc.nextInt();
        
        int[] lista = new int[N];
        
        for(int i=0;i<N;i++){
            lista[i]=(int) (Math.random()*10);
            System.out.println(lista[i]);
         }
        System.out.println("Ingrese número:");
        int numero = sc.nextInt();
        
        int contador=0, i=0;
        String aux="";
        for(int nudmero:lista){
            i++;
            if(numero==nudmero){
                contador++;
                aux += " " + i; 
            }
        }
        System.out.println("El número se encuentra en la lista "+contador+" veces."+'\n'+"Y está en las posiciones "+aux);
            }
        }
        


