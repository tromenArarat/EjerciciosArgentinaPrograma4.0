/*
 random(): Devuelve un número aleatorio entre 0 y 1.
 */
package ejemplos.math;

import java.util.Random;
import java.util.Scanner;

public class random {

    public static void main(String[] args) {
        double randomNum = Math.random(); 
        // randomNum es un número aleatorio entre 0 y 1

/*
Para generar un número aleatorio entre 1 y 28 en Java, 
puedes utilizar el método random() de la clase Math y 
luego escalar y trasladar el número generado 
para que esté en el rango deseado.

Por ejemplo, puedes hacer lo siguiente:
        
*/

int min = 1;
int max = 10;
int randomNum2 = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println(randomNum2);

// Otra
// 10+1 significa que devuelva 10 números a partir del 1
int num = (int) (Math.random()*89+10);

        System.out.println(num);

//NO CHEQUEADO
// Random randomizate= new Random();
// int (nombre int)= (nombre-random).nextInt(limite)
    
//  ASCII RANDOM
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    char randomChar = (char) (random.nextInt(128)); // Rango de valores de ASCII: 0-127
    System.out.println(randomChar);
    }
    
}
