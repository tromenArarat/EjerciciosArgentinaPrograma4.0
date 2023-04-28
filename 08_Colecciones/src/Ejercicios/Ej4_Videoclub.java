/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
 */
package Ejercicios;

import Servicios.PeliculaServicio;

public class Ej4_Videoclub {

    public static void main(String[] args) {
        PeliculaServicio alfredo = new PeliculaServicio();
        alfredo.cargarPelicula();
        alfredo.ordenarPelis();
        alfredo.ordenarRevero();
        alfredo.ordenarAlfab();
        
    }
    
}
