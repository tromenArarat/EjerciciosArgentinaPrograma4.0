/*
1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_ArcaDeNoel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> arca = new ArrayList();
        int num = 0;
        do{
            System.out.println("Valor ingresado:");
            num = sc.nextInt();
            if(num == (-99)){
                break;
            }else{
                arca.add(num);
            }
           
        }while(num != (-99));
        
        int suma = 0;
        for (Integer integer : arca) {
            suma += integer;
        }
        System.out.println("Se han ingresado "+ arca.size()+" valores.");
        System.out.println("La suma de todos los valores ingresados es: "+ suma);
        System.out.println("El promedio: "+suma/arca.size());
    }
    
}
