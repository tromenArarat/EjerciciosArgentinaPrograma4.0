/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 */
package ejerciciosguiaarreglos;

import java.util.Scanner;

public class EjerciciosGuiaArreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creo un arreglo llamado vector con dimensión 5 que
        // solo pueda alojar números enteros
//        String[] equipo = new String[10];
//        
//        for (String nombre:equipo){
//            nombre = sc.nextLine();
//        }
        
//        for (int i = 0; i < equipo.length; i++) {
//            System.out.println("Nombre:");
//            equipo[i] = sc.nextLine();
//               
//        }
        
        
        
//        for (int i = 0; i < equipo.length; i++) {
//            System.out.println("["+equipo[i]+"]");
//            
//        }
        
//        for(String elemento:equipo){
//            System.out.print(elemento);
//        }
        
        // Creo una matriz con dimensión 3x3 que
        // solo pueda alojar cadenas
        
        String[][] pantalla = new String[2][2];
        pantalla[0][0] = "Esquina superior izquierda";
        pantalla[0][1] = "Esquina superior derecha";
        pantalla[1][0] = "Esquina inferior izquierda";
        pantalla[1][1] = "Esquina inferior derecha";

        int i = 0;
        int j = 0;

        for (String[] posicionVertical : pantalla) {
            String aux = " ";
            for (String posicionHorizontal : posicionVertical) {
                aux+=posicionVertical+posicionHorizontal;
                System.out.println(aux);
            }
          }
//     int[][] matriz = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matriz[i][j] = 6;
//                System.out.print(matriz[i][j]);
//                 }
//            System.out.println(" ");
        }
    }
    

