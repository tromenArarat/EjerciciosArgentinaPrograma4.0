
package guiacolecciones;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;



public class ManosAlaObra {


    public static void main(String[] args) {
    
    /*
    Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
    */
        
    //instanciar colección
        
     ArrayList<Persona> vagos = new ArrayList();
     
     HashSet<Persona> laburantes = new HashSet();
     
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
        
        nombre = "Disculpas";
        edad = (int) (Math.random()*99+25);
        // CUATRO
        Persona bot4 = new Persona(nombre,edad);
        
        nombre = "Leftraru";
        edad = (int) (Math.random()*99+25);
        // CINCO
        Persona bot5 = new Persona(nombre,edad);
   
  
     //agregar objeto a la colección
        vagos.add(bot1);
        vagos.add(bot2);
        vagos.add(bot3);
        vagos.add(bot4);
        vagos.add(bot5);
        
        laburantes.add(bot1);
        laburantes.add(bot2);
        laburantes.add(bot3);
        laburantes.add(bot4);
        laburantes.add(bot5);
        
        espias.put("marrón", bot1);
        espias.put("blanco", bot2);
        espias.put("rosado", bot3);
        espias.put("magenta", bot4);
        espias.put("amarillo", bot5);

        /*
        Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
        cada forma que aprendiste arriba.
        */
        
        System.out.println("Elimino vago de la posición 0");
        vagos.remove(0);
        
        System.out.println("Elimino al laburante bot4");
        laburantes.remove(bot4);
        
        System.out.println("Elimino al espía rosado");
        espias.remove("rosado");
        
        // Impresiones de prueba
        
        // imprimo la lista de vagos en sus índices 0 y 1
        System.out.println("Muestro vago en la posición cero: nombre y edad");
        System.out.println(vagos.get(0).getNombre()+
                " "+vagos.get(0).getEdad());
        
        // imprimo el conjunto de laburantes con un for each
        System.out.println("Muestro laburantes en la colección: nombres y edad");
        for (Persona laburante : laburantes) {
            System.out.println(laburante.getNombre()+" "+laburante.getEdad());
        }
        
        // imprimo del mapa de espias a "marrón"
        System.out.println("Muestro nombre del espía marrón:");
        System.out.println(espias.get("marrón").getNombre());
        
        /*
        Uso de iterator 
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
         System.out.println(bucle.next()+"");
        }
        
        // Manos a la obra página 11
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while(it.hasNext()){
            if (it.next().equals("café")){
            it.remove();
            }
        }
        while(it.hasNext()){
            System.out.println(it.next());
        }
    
}
}
