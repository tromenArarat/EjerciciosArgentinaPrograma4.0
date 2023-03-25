/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejerciciosguiaarreglos;

public class cuboMagico {

    public static void main(String[] args) {
        int min = 1;
        int max = 9;
        boolean c;
        int numx;
        
        // Creo un vector de tamaño 9 y lo relleno con el valor cero (0).
        int vector[]=new int[9];
        for (int i = 0; i < 3; i++) {
            vector[i]=0;                       
        }
        
        int matriz[][]=new int[3][3];
        
        // Creo un bucle para llenar el vector con n° aleatorios del 1 al 9.
        
        do{
            for (int i = 0; i < 9; i++) {
            c = false;
            numx = min + (int)(Math.random() * ((max - min) + 1));
            
            for (int j = 0; j < 9; j++) {
                if(numx==vector[j]){
                    c=true;
                    }
            }
            
            if(c){
                i--;
            }else{
                vector[i]=numx;
            }
            c= false;                      
        }
        int n = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=vector[n];
                n++;        
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.print("["+vector[i]+"]");           
        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println(esMagicou(matriz));
        }while(esMagicou(matriz)==false);
        
    }
    public static boolean esMagicou(int matriz[][]){
        boolean retorno=false;
        int suma0=0;
        int suma1=0;
        int suma2=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                suma0+=matriz[i][j];
            }
          }
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 2; j++) {
                suma1+=matriz[i][j];
            }
          }
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j < 3; j++) {
                suma2+=matriz[i][j];
            }
          }
        if(suma1==suma2 && suma2==suma0){
            retorno=true;
            return true;
       }else{
            return false;
        }
       
    }
}

