/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package ejercicios;


public class Ex2_ComparaVectores {


    public static void main(String[] args) {
        int n=8;
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        int flag=0;
        for (int i = 0; i < n; i++) {
            vector2[i]=445;
            vector1[i]=445;
           
        }
        for (int i = 0; i < n; i++) {
            if(vector1[i]==vector2[i]){
                flag++;
                continue;
              
            }else{
                System.out.println("No son iguales");
                break;
            }
    
        }
 if(flag==n){
     System.out.println("Son todos los valores iguales. Me tomé la molestia de chequearlos uno por uno.");
 }
    }
    
}
