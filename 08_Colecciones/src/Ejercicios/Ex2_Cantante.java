/*
2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.

Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.

Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package Ejercicios;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Ex2_Cantante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> billboard = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantante:");
            String cantante = sc.next();
            System.out.println("Disco con más ventas:");
            String disco = sc.next();
            billboard.add(new CantanteFamoso(cantante, disco));
        }
        System.out.println("Listado del bilbor:");
        for (CantanteFamoso cantanteFamoso : billboard) {
            System.out.println(cantanteFamoso.getNombre());
            System.out.println(cantanteFamoso.getDiscoConMasVentas());
        }
        
        String salida = "no";
        do{
            System.out.println("---------MENÚ---------");
            System.out.println("1-AGREGAR CANTANTE----");
            System.out.println("2-MOSTRAR CANTANTES---");
            System.out.println("3-ELIMINAR CANTANTE---");
            System.out.println("4-SALIR---------------");
            int rta = sc.nextInt();
            switch(rta){
                    case 1:
                        System.out.println("Cantante:");
                        String cantante = sc.next();
                        System.out.println("Disco con más ventas:");
                        String disco = sc.next();
                        billboard.add(new CantanteFamoso(cantante, disco));
                        break;
                    case 2:
                        for (CantanteFamoso cantanteFamoso : billboard) {
                            System.out.println(cantanteFamoso.getNombre());
                        }
                        break;
                    case 3:
                        System.out.println("¿A quién fletamos?");
                        String rta2 = sc.next();
                        
                        for (CantanteFamoso c : billboard) {
                            if(c.getNombre().equals(rta2)){
                                billboard.remove(c);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("¿Seguro? si/no");
                        salida = sc.next();
                        break;
                }
            
        }while(salida.equalsIgnoreCase("no"));
        
    }
    
}
