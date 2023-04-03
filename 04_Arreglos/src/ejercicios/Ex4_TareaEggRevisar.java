/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package ejercicios;

import java.util.Scanner;

public class Ex4_TareaEggRevisar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");                
       
        String[] alumnosNombre= new String[2];
        
        for (int i = 0; i < alumnosNombre.length; i++) {
          alumnosNombre[i] = sc.nextLine();
        }
        
        double[][] alumnosNotas=new double[alumnosNombre.length][5];
        
        for (int i = 0; i < alumnosNombre.length; i++) {
           
           for (int j = 0; j < 5; j++) {
               switch(j){
                   case 0 :
                       System.out.println("¿Qué se sacó en el 1er TP?");
                       alumnosNotas[i][j] = sc.nextInt();
                       continue;
                    case 1 :
                       System.out.println("¿Qué se sacó en el 2do TP?");
                       alumnosNotas[i][j] = sc.nextInt();
                       continue;
                     case 2 :
                       System.out.println("Nota 1er integrador:");
                       alumnosNotas[i][j] = sc.nextInt();
                       continue;
                     case 3 :
                       System.out.println("Nota 2do integrador:");
                       alumnosNotas[i][j] = sc.nextInt();
                       continue;
                      case 4 :
                       System.out.println("Promedio:");
                       alumnosNotas[i][j] = ((alumnosNotas[i][0]*10)+(alumnosNotas[i][1]*15)+(alumnosNotas[i][2]*25)+(alumnosNotas[i][3]*50))/100;
                       continue;
                       
               }
                
                                
            }

            
           
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Alumno: "+alumnosNombre[i]);
                System.out.println(alumnosNotas[i][j]);     
            }
            System.out.println("");
            
        }
    }
    
}

//            for (int j = 1; j < 2; j++) {
//                System.out.println("¿Qué se sacó en el 2do TP?");
//                alumnosNotas[i][j] = sc.nextInt();
//                                
//            }
//            for (int j = 2; j < 3; j++) {
//                System.out.println("Nota 1er integrador:");
//                alumnosNotas[i][j] = sc.nextInt();
//                                
//            }
//            for (int j = 3; j < 4; j++) {
//                System.out.println("Nota 2do integrador:");
//                alumnosNotas[i][j] = sc.nextInt();
//                                
//            }
//            for (int j = 4; j < 5; j++) {
//                alumnosNotas[i][j] = ((alumnosNotas[i][0]*10)+(alumnosNotas[i][1]*15)+(alumnosNotas[i][2]*25)+(alumnosNotas[i][3]*50))/100;
//                                
//            }
