/*
 random(): Devuelve un número aleatorio entre 0 y 1.
 */
package ejemplos.math;

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
int max = 28;
int randomNum2 = min + (int)(Math.random() * ((max - min) + 1));


// Random randomizate= new Random();
// int (nombre int)= (nombre-random).nextInt(limite)
    }
    
}
