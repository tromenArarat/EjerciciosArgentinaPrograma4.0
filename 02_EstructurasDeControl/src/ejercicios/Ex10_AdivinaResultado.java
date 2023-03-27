/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.

El programa debe indicar al usuario si su respuesta es o no correcta. 

En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. 

Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package ejercicios;

import java.util.Scanner;

public class Ex10_AdivinaResultado {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String juega = "no";
        do{
            int rta = 0;
            int resultado = 0;
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);
            resultado = num1 * num2;
        
        do{
            System.out.println(num1+" x "+num2+" =");
            rta = sc.nextInt();
            if(rta!=resultado){
                System.out.println("Su respuesta es incorrecta. Intentelo nuevamente");
                continue;
            }else{
                System.out.println("Su respuesta es correcta");
            }
        }while(rta!=resultado);
        
            System.out.println("¿Querés seguir jugando?");
            juega = sc.next();
        
        }while(juega.equals("si"));
        
       
    }
    
}
