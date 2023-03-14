/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package ejerciciosguia3;

import java.util.Scanner;

public class Ejercicio6extra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos sujetos va a medir?");
        int medidos = sc.nextInt();
        int suma = 0;
        int sumaSopetis = 0;
        double sumaAlturas = 0;
        double promedioGral = 0;
        double promedioSopetis = 0;
        for (int i = 1; i == medidos; i++) {
            System.out.println("Ingrese altura:");
            double altura = sc.nextDouble();
            if(altura<1.60){
                sumaSopetis++;
                }else {
                suma++;
            }
            sumaAlturas = sumaAlturas + altura;
            promedioGral = medidos/sumaAlturas;
            promedioSopetis = medidos/sumaSopetis;
            
        }
        System.out.println("El promedio de personas que miden menos de 1.6 es "+ promedioSopetis +" y el promedio general de estatura es "+ promedioGral);
    }
    
}
