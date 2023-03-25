/*
Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package ejerciciosguia4;

import java.util.Scanner;

public class ejercicioGuiaTeorica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una secuencia de caracteres:");
        String secue = sc.next();
        String secueNueva = "";
        int pegue = secue.length();
        
        for (int i = 0; i < pegue; i++) {
            String letra = secue.substring(i, i+1);
            if(!letra.equals(".")){
            switch(letra){
                case "a": 
                    secueNueva = secueNueva.concat("@");
                break;
                case "e":
                    secueNueva = secueNueva.concat("#");
                break;
                case "i":
                    secueNueva = secueNueva.concat("$");
                break;
                case "o":
                    secueNueva = secueNueva.concat("%");
                break;
                case "u":
                    secueNueva = secueNueva.concat("*");
                break;
                default:
                   secueNueva = secueNueva.concat(letra);
                   break;
            }
                    }else{
                    break;
        }
    }
    System.out.println(secueNueva);
}
}
