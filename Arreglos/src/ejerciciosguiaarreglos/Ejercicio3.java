/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejerciciosguiaarreglos;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Ingrese valor de N");
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int vector[] = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10000);
            System.out.println(vector[i]);
        }
//        System.out.println('\n');
//        System.out.println(String.valueOf(vector[0]).length());
        
        int contador1=0,contador2=0,contador3=0,contador4=0,contador5 =0;
        
        for (int i = 0; i < N; i++) {
            switch(String.valueOf(vector[i]).length()){
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
            }
            
        }
        System.out.println("1 dígito: "+contador1+'\n'+"2 dígitos: "+contador2+'\n'+"3 dígitos: "+contador3+'\n'+"4 dígitos: "+contador4+'\n'+"5 dígitos: "+contador5);
    }
    
}
