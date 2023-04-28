/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.

*/
package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej1_buscarPerro {


    public static void main(String[] args) {
        String rta = "";
        Scanner sc = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        do{
            System.out.println("Raza:");
            String raza = sc.next();
            razas.add(raza);
            
            System.out.println("¿Seguir cargando? (si/no)");
            rta = sc.next();
            
        }while(rta.equalsIgnoreCase("si"));
        
        for (String raza : razas) {
            System.out.println(raza);
        }
        
    // usuario se le pedirá un perro
    
        System.out.println("¿Qué tipo de perro busca?");    
        String opcion = sc.next();
    
    // se recorrerá la lista con un Iterator
    
        Iterator loop = razas.iterator();
        
   
    // se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro
        int contador = 0;
        while(loop.hasNext()){
            if(loop.next().equals(opcion)){
                loop.remove();
        }else{
                contador++;
            }
        }
        
     // Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada.
      
        if ((contador-1)==razas.size()) {
            System.out.println("No se encuentra el rope");
            System.out.println("La lista de perros disponibles es:");
            for (String raza : razas) {
            System.out.println(raza);
        }
        }
        
        

    // se mostrará la lista ordenada con un for each
        System.out.println("La lista de perros:");
        for (String raza : razas) {
            System.out.println(raza);
        }
        
     
        
        

    
    }
}
