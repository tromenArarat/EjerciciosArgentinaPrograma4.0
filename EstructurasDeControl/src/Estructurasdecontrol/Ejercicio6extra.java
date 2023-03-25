/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package Estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio6extra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cuántos sujetos va a medir?");
        int medidos = sc.nextInt();
        int suma = 0;
        int sumaSopetis = 0;
        double sumaAlturaSope = 0;
        double sumaAlturaNoSope = 0;
        double sumaAlturas = 0;
        double promedioGral = 0;
        double promedioSopetis = 0;
        for (int i = 0; i < medidos; i++) {
            System.out.println("Ingrese altura:");
            double altura = sc.nextDouble();
            if(altura<1.60){
                sumaAlturaSope+=altura;
                sumaSopetis++;
                }else {
                sumaAlturaNoSope+=altura;
                suma++;
            }
            sumaAlturas = sumaAlturaSope + sumaAlturaNoSope;
            promedioGral = sumaAlturas/medidos;
            promedioSopetis = (medidos*100)/sumaSopetis;
            
        }
        System.out.println("El promedio de personas que miden menos de 1.6 es "+ promedioSopetis);
        System.out.println("y el promedio general de estatura es "+ promedioGral);
    }
    
}
