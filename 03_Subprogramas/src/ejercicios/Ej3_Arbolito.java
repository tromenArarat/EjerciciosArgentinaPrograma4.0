/*


*/
package ejercicios;

import java.util.Scanner;

public class Ej3_Arbolito {

    public static void main(String[] args) {
        String rta = "si";
        do{
            System.out.println("Dale, cambio, ¿cuánto tenés?");
            Scanner sc = new Scanner(System.in);
            int valor = sc.nextInt();
            System.out.println("¿Querés dólares(1), libras(2) o yenes(3)?");
            String opc = sc.next();
            conversor(valor,opc);
            System.out.println("¿Querés más?");
            rta = sc.next();
        }while("si".equalsIgnoreCase(rta));
        
    }
    public static void conversor(int euros, String moneda){
        switch(moneda){
            case "1":
                System.out.println("Por " + euros + " euros, te doy " + euros*1.28611+ " dólares.");
            break;
            case "2":
                System.out.println("Por " + euros + " euros, te doy " + euros*0.86+ " libras.");
            break;
            case "3":
                System.out.println("Por " + euros + " euros, te doy " + euros*129.852+ " yenes.");
                break;
    }
    }
    
}
