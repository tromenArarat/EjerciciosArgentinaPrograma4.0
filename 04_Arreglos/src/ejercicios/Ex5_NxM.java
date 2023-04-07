/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package ejercicios;

public class Ex5_NxM {

    public static void main(String[] args) {
        int n = 2;
        int m = 2;
        int matriz[][] = new int[n][m];
        
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=(int)(Math.random()*9+1);
                suma+=matriz[i][j];
            }
        }
        System.out.println(suma);
    }
    
}
