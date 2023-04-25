/*

 */
package integrador;

import Entidades.Estudiante;
import java.util.Scanner;

public class Integrador {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 2; i <= 128; i*=2) {
            System.out.println("i: "+ i);
            
        }
        
        Estudiante piberio[] = new Estudiante[4];
        
        for (int i = 0; i < piberio.length; i++) {
            System.out.println("Alumno/a:");
            String nombre = sc.next();
            System.out.println("Nota:");
            double nota = sc.nextDouble();
            piberio[i] = new Estudiante(nombre,nota);
        }
        
        double promedio = 0;
        int suma = 0;
        
        // Probar ArrayFill
        for (int i = 0; i < piberio.length; i++) {
           suma += piberio[i].getNota(); 
        }
        
        promedio = suma/piberio.length;
        System.out.println("Promedio: "+promedio);
        
        
        int contador = 0;
        for (int i = 0; i < piberio.length; i++) {
            if(piberio[i].getNota()>promedio){
                contador++;
            }
        }
        Estudiante top[] = new Estudiante[contador];
        int contadorito = 0;
        for (int i = 0; i < piberio.length; i++) {
            if(piberio[i].getNota()>promedio){
                top[contadorito] = new Estudiante(piberio[i].getNombre(),piberio[i].getNota());
                contadorito++;
                }
            }   
       
        
        System.out.println("Alumnos por encima del promedio:");

        for (int i = 0; i < top.length; i++) {
            System.out.println(top[i].getNombre());
            
        }
    }
    
}
