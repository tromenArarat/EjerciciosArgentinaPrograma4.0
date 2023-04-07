/*
Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando Մ1֡1Յ
Análogamente, la sucesión del número 3 es Մ1֡2Յ,
Y la del 5 es Մ2֡3Յ,
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente
link: https://quantdare.com/numeros-de-fibonacci/
 */
package ejercicios;


public class Ex7_Fibonacci {

    public static void main(String[] args) {
        int n = 5;
        int fibo = 1;
        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(fibo);
            fibo = a + b;
            a = b;
            b = fibo;    
        }
    }
    
}
