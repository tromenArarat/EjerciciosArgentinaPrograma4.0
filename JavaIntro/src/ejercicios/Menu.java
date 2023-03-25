/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package ejercicios;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número:");
        int num2 = sc.nextInt();
        String rta = "N"; 
        while (rta.equalsIgnoreCase("N")) {
            System.out.println("MENU" + '\n' + "1.Sumar" + '\n' + "2.Restar" + '\n' + "3.Multiplicar" + '\n' + "4.Dividir" + '\n' + "5.Salir" + '\n' + "Elija opción:");
            int opc = sc.nextInt();
            
            if(opc>0 && opc<5){
            
            switch (opc) {
                case 1:
                    System.out.println("El resultado es:");
                    System.out.println(num1 + num2);
                    System.out.print('\n');
                    continue;
                case 2:
                    System.out.println("El resultado es:");
                    System.out.println(num1 - num2);
                    System.out.print('\n');
                    continue;
                case 3:
                    System.out.println("El resultado es:");
                    System.out.println(num1 * num2);
                    System.out.print('\n');
                    continue;
                case 4:
                    System.out.println("El resultado es:");
                    System.out.print('\n');
                    System.out.println(num1 / num2);
                    System.out.print('\n');
                    continue;
            }
            }else if(opc==5){
                    System.out.println("¿Está seguro de que desea salir? s/n");
                    rta = sc.next();
                        if("n".equalsIgnoreCase(rta)){                       
                          continue;
                            }
            }
}
        }
}
    

