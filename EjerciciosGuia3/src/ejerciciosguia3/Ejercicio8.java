/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:

* * * *
*     *
*     *
* * * *

*/
package ejerciciosguia3;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Número de lados:");
        int lados = sc.nextInt();
        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if(i==0 || i==(lados-1) || j==0 || j==(lados-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }                
            }
            System.out.println('\n');
        }
    }
}
