
package ejercicios;

public class Trama {

    public static void main(String[] args) {
        
        int cuadroFilas = 25;
        int cuadroColumnas = 5;
        for (int i = 0; i < cuadroFilas; i++) {
            for (int j = 0; j < cuadroColumnas; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        if(l%2==0 ||i%2==0 && i!=j){
                            System.out.print("|");
                        }else{
                            System.out.print("-");
                      }
                    }
//                    System.out.println("");
                }
//                System.out.print("\n");
            }
            System.out.print("\n");
        }
//        System.out.print("\n");
    }
    
}
