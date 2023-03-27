/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13ր
50 ՟ 13 ֟ 37 una resta realizada
37 ՟ 13 ֟ 24 dos restas realizadas
24 ՟ 13 ֟ 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
 */
package ejercicios;

import java.util.Scanner;

public class Ex09_DivisionConResta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 2;
        int num2 = 2;
        
        do{
            System.out.println("Ingrese valores mayores a 1");
            System.out.println("Número 1:");
            num1 = sc.nextInt();
            System.out.println("Número 2:");
            num2 = sc.nextInt();
        }while(num1<1 || num2<1);
        
        int resta = num1;
        int contador = 0;
        do{
            resta -= num2;
            contador++;
        }while(num2<=resta);
        
        System.out.println("Resultado: "+contador+'\n'+"Residuo: "+resta);
        
        
        
    }
    
}
