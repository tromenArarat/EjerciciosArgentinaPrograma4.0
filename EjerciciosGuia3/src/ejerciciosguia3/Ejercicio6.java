/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
ՄS/NՅ? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package ejerciciosguia3;

import java.util.Scanner;

public class Ejercicio6 {

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
                    System.out.println(num1 + num2);
                    System.out.print('\n');
                    continue;
                case 2:
                    System.out.println(num1 - num2);
                    System.out.print('\n');
                    continue;
                case 3:
                    System.out.println(num1 * num2);
                    System.out.print('\n');
                    continue;
                case 4:
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

    


