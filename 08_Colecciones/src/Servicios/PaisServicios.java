
package Servicios;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServicios {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private HashSet<Pais> paises = new HashSet();
    
    
    public void cargarPais(){
    String confirmacionRespuesta = "si";
    do{
        System.out.println("País:");
              
        paises.add(new Pais(sc.next()));
        
        System.out.println("Desea seguir?");
        confirmacionRespuesta = sc.next();
        
    }while(confirmacionRespuesta.equalsIgnoreCase("si"));
   
    // Mostrar paises
    paises.forEach((lugar) -> System.out.println(lugar));
}
    
    //Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto.
    public void ordenarAlfabeticamente(){
        
        // Convertimos el HashSet paises a un ArrayList de objetos de tipo Pais
        ArrayList<Pais> paiString = new ArrayList(paises);
        // Convertimos ese ArrayList de objeto a un ArrayList de String
        ArrayList<String> naciones = new ArrayList();
        for (Pais pais : paiString) {
            naciones.add(pais.getNombre());
        }
        // Ordenamos
        Collections.sort(naciones);
        
        // Mostramos
        for (String nacione : naciones) {
            System.out.println(nacione);
        }
        
    }
    
    /*
    Al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    al usuario.
    */
    
    public void eliminarPais(){
        Iterator loop = paises.iterator();
        
        System.out.println("¿Dónde tiramos la bomba atómica?");
        String rta = sc.next();
        
        int contador = 0;
        
        while(loop.hasNext()){
            if(rta.equals(loop.next())){
                loop.remove();
            }else{
                contador++;
            }
        }
        if(contador==paises.size()){
            System.out.println("El país no se encuentra");
        }
        System.out.println("Listado de Países sanos y salvos:");
        for (Pais paise : paises) {
            System.out.println(paise);
        }
        
    }
    
}
