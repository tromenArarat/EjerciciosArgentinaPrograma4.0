
package ejerciciosguia3;

import java.util.Scanner;

public class Ejercicio6bis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        String rta = "n";
        do{
            System.out.println("MENU" + '\n' + "1.Entrar" + '\n' + "2.Salir");
            opc = sc.nextInt();
            if (opc == 1) {
                continue;
            }else if(opc == 2){
                System.out.println("¿Confirma salida? s/n");
                rta = sc.next();
                continue;
            }
        }while("n".equalsIgnoreCase(rta));
        
    }
}

