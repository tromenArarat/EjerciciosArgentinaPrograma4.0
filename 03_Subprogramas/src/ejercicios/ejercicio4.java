/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
 */
package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es primo:");
        int num = sc.nextInt();
        int i = 1;
        int contador = 0;
        do {
            i++;
            if (num % i == 0) {
                contador++;
            }
	}while(i!=num);
        if (contador==1){
            System.out.println("El número es primo");
        }else{
            System.out.println("El número no es primo");
        }
    }
    
}
/*
Esto me larga GPT
There is a flaw in the logic of the code, as it will always print 
"El número no es primo" for any input number greater than 2. 
The reason for this is that the loop will increment i until it reaches num, 
but since the loop condition is i != num, the loop will always iterate one 
time too many. To fix this issue, the loop condition should be changed to 
i < num. Here's the corrected code:

Scanner sc = new Scanner(System.in);
System.out.println("Ingrese un número para saber si es primo:");
int num = sc.nextInt();
int i = 1;
int contador = 0;
do {
    i++;
    if (num % i == 0) {
        contador++;
    }
} while (i < num);
if (contador == 1) {
    System.out.println("El número es primo");
} else {
    System.out.println("El número no es primo");
}

*/
