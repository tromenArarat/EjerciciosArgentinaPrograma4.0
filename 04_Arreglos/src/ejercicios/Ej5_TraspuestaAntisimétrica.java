/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = ՞AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicios;

public class Ej5_TraspuestaAntisimétrica {

   public static void main(String[] args) {
       
       //Creo una matriz y la relleno con número aleatorios del -9 al 9
       
   int matriz[][] = new int[3][3];
   
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j]=(int) (Math.random()*19+(-9));
            System.out.print("["+matriz[i][j]+"]");
            }
        System.out.println("");
        }
    
       System.out.println("-----------------");
        //Creo una segunda matriz que aloja los valores opuestos de la matriz anterior y de forma traspuesta
    
    int matriz2[][] = new int[3][3];
    
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if(matriz[j][i]<0){
                matriz2[i][j] = Math.abs(matriz[j][i]);
            }else if(matriz[j][i]==0){
                matriz2[i][j]=0;
            }else{
                matriz2[i][j] = (matriz[j][i]*-1);
            }
           System.out.print("["+matriz2[i][j]+"]");
            }
        System.out.println("");
        }
    }
    
}
