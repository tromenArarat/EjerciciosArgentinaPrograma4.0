/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.

Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no. Probar fill(List<T> lista, Objeto objeto)
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Pelicula> stock = new ArrayList();
    
public void cargarPelicula(){
    String confirmacionRespuesta = "si";
    do{
        System.out.println("Título:");
        String titulo = sc.next(); 
        System.out.println("Director:");
        String director = sc.next();
        System.out.println("Cuántas horas:");
        int duracion = sc.nextInt();
        stock.add(new Pelicula(titulo,director,duracion));
        System.out.println("Desea seguir?");
        confirmacionRespuesta = sc.next();
        
    }while(confirmacionRespuesta.equalsIgnoreCase("si"));
    
}

    //  Mostrar en pantalla todas las películas.
public void mostrarPeliculas(){
    stock.forEach((pelicula) -> {
        System.out.println(pelicula);
        });
}

    //  Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
public void mostrarLargometrajes(){
    System.out.println("Listado de largometrajes:");
       for (Pelicula muvi : stock) {
        if(muvi.getHoras()>1){
            System.out.println(muvi);
        }
    }
}
    //  Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
public void ordenarPelis(){
    
    //    Collections.sort(stock, Pelicula.ordenarPorTiempo);
    
    stock.sort(Pelicula.ordenarPorTiempo);
    System.out.println("Las pelis ordenadas de más duración a menos duración:");
    mostrarPeliculas();
}

    //  Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public void ordenarRevero(){
        stock.sort(Pelicula.ordenarPorOpmeit);
        System.out.println("Las pelis ordenadas de menor duración a mayor duración:");
        mostrarPeliculas();
    }

    //  Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarAlfab(){
        ArrayList<String> pelis = new ArrayList();
        for (Pelicula pelicula : stock) {
            pelis.add(pelicula.getTitulo());
        }
        Collections.sort(pelis);
        System.out.println("Las películas ordenadas alfabéticamente según su título:");
        for (String peli : pelis) {
            System.out.println(peli);
        }   
    }
    
    //  Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
      public void ordenarAlfabPorDire(){
        ArrayList<String> pelisPorDirector = new ArrayList();
        for (Pelicula pelicula : stock) {
            pelisPorDirector.add(pelicula.getDirector());
        }
        Collections.sort(pelisPorDirector);
        System.out.println("Las películas ordenadas alfabéticamente según su director:");
        for (String peli : pelisPorDirector) {
            System.out.println(peli);
        }   
    }
    
    
}
