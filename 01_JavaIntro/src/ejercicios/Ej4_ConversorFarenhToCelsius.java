package ejercicios;

import java.util.Scanner;

public class Ej4_ConversorFarenhToCelsius {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c,f;
        System.out.println("Ingrese grados Celsius");
        c = leer.nextInt();
        f = 32 + (9 * c / 5);
        System.out.println("°C: "+c+"°F: "+f);
    }
    
}
