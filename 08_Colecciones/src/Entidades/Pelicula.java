/*
Una clase Pelicula con el título, director y duración de la película (en horas)
 */
package Entidades;

import java.util.ArrayList;
import java.util.Comparator;

public class Pelicula {

    //Atributos
    private String titulo;
    private String director;
    private Integer duracion;

    // Constructores
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    // To String 
    @Override
    public String toString() {
        return "Peli: " + titulo + "\n"+ 
                "Director: " + director + "\n"+ 
                "Horas=" + duracion;
    }

    // Getter y setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHoras() {
        return duracion;
    }

    public void setHoras(int duracion) {
        this.duracion = duracion;
    }

    // Comparadores
    public static Comparator<Pelicula> ordenarPorTiempo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula menInBlack, Pelicula forrestGump){
            return forrestGump.getHoras().compareTo(menInBlack.getHoras());
        }
    };

    public static Comparator<Pelicula> ordenarPorOpmeit = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula menInBlack, Pelicula forrestGump){
            return menInBlack.getHoras().compareTo(forrestGump.getHoras());
        }
    };
    
    
    
}

