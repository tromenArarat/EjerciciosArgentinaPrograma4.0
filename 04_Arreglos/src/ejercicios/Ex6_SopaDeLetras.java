/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package ejercicios;

import java.util.Scanner;

public class Ex6_SopaDeLetras {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String palabra[] = new String[5];
        
        System.out.println("Ingrese 5 palabras de 3 letras como mínimo y 5 letras como máximo");
        
        // Bucle para guardar las palabras ingresadas dentro de un vector
        for (int i = 0; i < palabra.length; i++) {
            System.out.println("palabra "+(i+1));
            palabra[i] = sc.next();
            while(palabra[i].length() < 3 || palabra[i].length() > 5){
                System.out.println("palabra "+(i+1));
                palabra[i] = sc.next();
            }
        }
        
        // Bucle para rellenar el vector con número aleatorios convertidos a String
        String sopa[][] = new String[20][20];
        
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                sopa[i][j] = String.valueOf((int)(Math.random ()*9+1));
//                System.out.print(sopa[i][j]);
            }
//            System.out.println("");
        }
        
        // Bucle para intercalar palabras ingresadas dentro de una fila random
             
        for (int i = 0; i < 5; i++) {
            int numRandom = (int)(Math.random ()*19+1);
         
            for (int j = 0; j < palabra[i].length() ; j++) {
            if(j<palabra[i].length() && (sopa[numRandom][j].equals("1")||sopa[numRandom][j].equals("2")||sopa[numRandom][j].equals("3")||sopa[numRandom][j].equals("4")||sopa[numRandom][j].equals("5")||sopa[numRandom][j].equals("6")||sopa[numRandom][j].equals("7")||sopa[numRandom][j].equals("8")||sopa[numRandom][j].equals("9"))){
                sopa[numRandom][j] = palabra[i].substring(j, j+1);
            }else if(j<palabra[i].length()){
                numRandom = (int)(Math.random ()*19+1);
                sopa[numRandom][j] = palabra[i].substring(j, j+1);
            }
        }
            
        }
        
      
        // Bucle para imprimir resultado
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                System.out.print(sopa[i][j]);
            }
            System.out.println("");
        }
        
        
    }
    
}
