/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package ejercicios;

import java.util.Scanner;

public class Ex06_BajitosXaRevisar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cuántos sujetos va a medir?");
        int medidos = sc.nextInt();
        int sumaBajitos = 0;
        float sumaAlturaBajitos = 0;
        float sumaAlturaNoBajitos = 0;
        float sumaAlturas;
        float promedioGral = 0;
        float promedioBajitos = 0;
        for (int i = 0; i < medidos; i++) {
            System.out.println("Ingrese altura:");
            float altura = sc.nextFloat();
            if(altura<1.60){
                sumaAlturaBajitos+=altura;
                sumaBajitos++;
                }else {
                sumaAlturaNoBajitos+=altura;
            }
            sumaAlturas = sumaAlturaBajitos + sumaAlturaNoBajitos;
            promedioGral = sumaAlturas/medidos;
            promedioBajitos = (sumaBajitos/medidos)*100;
            
        }
        System.out.println("El promedio de personas que miden menos de un metro sesenta es "+ promedioBajitos+"%");
        System.out.println("y el promedio general de estatura es "+ promedioGral + " m.");
        
        System.out.println("sumaBajitos"+sumaBajitos);
        System.out.println("medidos"+medidos);
        System.out.println("promedioBajitos"+promedioBajitos);
        System.out.println(1/2);
        
    }
    
}
