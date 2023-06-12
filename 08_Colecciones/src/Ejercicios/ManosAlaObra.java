
package Ejercicios;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ManosAlaObra {

    public static void main(String[] args) {
    
    /*
    Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
    */
        
    //instanciar colección
       
    // Lista
     ArrayList<Persona> listados = new ArrayList();
     
     /*
     Comentario sobre las listas:
     -  son indiciables y esa es la manera de acceder a los valores alojados ahí, 
        indicando su posición en la lista.
     -  LinkedList funciona distinto que ArrayList. Es más eficiente si necesito
        reposicionar los elementos de la lista o colocar uno nuevo entre medio
        de dos existentes. PROBAR ESTO CON ATRIL DOMINÓ
     -  Se implementa como una lista de doble enlace. Su rendimiento al agregar y quitar es mejor que
        Arraylist, pero peor en los métodos set y get.
        
        ARRAY LIST 
        0 1 2 3 4 5 6 7
        5:2 6:3 3:4 1:2 3:4 3:3 1:1
     
        LINKED LIST
     
     */
     
     
    // Conjunto
     HashSet<Persona> fichasDomino = new HashSet();
     
     /*
     
     */
     
     // Mapa
     HashMap<String,Persona> espias = new HashMap();
     
       
    //instanciar objeto 5 veces
        
        String nombre = "Pepe";
        int edad = (int) (Math.random()*99+25);
        // UNO
        Persona bot1 = new Persona(nombre,edad);
        
        nombre = "Ricarda";
        edad = (int) (Math.random()*99+25);
        // DOS
        Persona bot2 = new Persona(nombre,edad);
        
        nombre = "Fenicio";
        edad = (int) (Math.random()*99+25);
        // TRES
        Persona bot3 = new Persona(nombre,edad);
        
        nombre = "Amigo";
        edad = (int) (Math.random()*99+25);
        // CUATRO
        Persona bot4 = new Persona(nombre,edad);
        
        nombre = "Leftraru";
        edad = (int) (Math.random()*99+25);
        // CINCO
        Persona bot5 = new Persona(nombre,edad);
   
  
     // Agregar objeto a la colección
        listados.add(bot1);
        listados.add(bot2);
        listados.add(bot3);
        listados.add(bot4);
        listados.add(bot5);
        
        fichasDomino.add(bot1);
        fichasDomino.add(bot2);
        fichasDomino.add(bot3);
        fichasDomino.add(bot4);
        fichasDomino.add(bot5);
        
        espias.put("marrón", bot1);
        espias.put("blanco", bot2);
        espias.put("rosado", bot3);
        espias.put("magenta", bot4);
        espias.put("amarillo", bot5);
        
        /*
        Uso de la clase predefinida COLlECTIONS
        */
        Collections.reverse(listados);

        /*
        Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
        cada forma que aprendiste arriba.
        */
        
        System.out.println("Elimino al listado desde la posición que ocupa");
        listados.remove(0);
        System.out.println("Elimino al listado cuyo nombre coincida con el buscado");
        String buscado = "Fenicio";
        
        
        System.out.println("Elimino del conjunto al bot4");
        fichasDomino.remove(bot4);
        
        System.out.println("Elimino al espía rosado");
        espias.remove("rosado");
        
        // Impresiones de prueba
        
        // imprimo la lista de listados en sus índices 0 y 1
        System.out.println("Muestro vago en la posición cero: nombre y edad");
        System.out.println(listados.get(0).getNombre()+
                " "+listados.get(0).getEdad());
        
        // imprimo el conjunto de fichasDomino con un for each
        System.out.println("Muestro fichasDomino en la colección: nombres y edad");
        for (Persona laburante : fichasDomino) {
            System.out.println(laburante.getNombre()+" "+laburante.getEdad());
        }
        
        // imprimo del mapa de espias a "marrón"
        System.out.println("Muestro nombre del espía marrón:");
        System.out.println(espias.get("marrón").getNombre());
        
        /*
        USO DE ITERATOR
        */
        
        // para mostrar elementos de la lista escenarios que es un ArrayList de String
        
        ArrayList<String> escenarios = new ArrayList();
        escenarios.add("Hong Kong");
        escenarios.add("Purgatorio");
        escenarios.add("Egipto");
        escenarios.add("Bahamas");
        
        Iterator loop = escenarios.iterator();
        
        System.out.println("Elementos de la lista escenarios:");
        
        while(loop.hasNext()){
            System.out.println(loop.next()+"");
        }
        
        // para quitar elementos de la lista
        Iterator bucle = escenarios.iterator();
        System.out.println("Elementos de la lista escenario luego de eliminar uno:");
        while(bucle.hasNext()){
            if(bucle.next().equals("Egipto")){
                bucle.remove();    
            }
        }
        while(bucle.hasNext()){
            System.out.println(bucle.next()+"");
        }
        
        // Manos a la obra página 11
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while(it.hasNext()){
            if (it.next().equals("café")){
                System.out.println(it.next());
                it.remove();
            }
        }
       
        /*
        ORDENAR UNA COLECCIÓN
        */
    
        //  Ordenar una lista:
        //  Collections.sort(escenarios);
        
        //  para ordenar los conjuntos, deberemos convertirlos a listas
        //  ArrayList<String> fichasDominoID = new ArrayList(fichasDomino);
        //  Collections.sort(fichasDominoID);
        
        //  a la hora de ordenar un mapa como tenemos dos datos para ordenar,
        //  vamos a convertir el HashMap a un TreeMap. Nota: recordemos que los TreeSet y TreeMap se ordenan por sí mismos.
        //  PENDIENTE ESTO
        
        /*
        RECORRER UNA COLECCIÓN CON OBJETOS
        */
        
        // con un forEach
        
        for (Persona obrebrio : fichasDomino) {
            System.out.println(obrebrio.getNombre());
        }
        
}
}
