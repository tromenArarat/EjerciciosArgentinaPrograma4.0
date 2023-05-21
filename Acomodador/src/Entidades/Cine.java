/*
De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, 

 */
package Entidades;


public class Cine {

    private String pelicula;
    private Sala auditorio;
    private int precioEntrada;
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    public Cine() {
    }

    public Cine(String pelicula, Sala auditorio, int precioEntrada, String titulo, int duracion, int edadMinima, String director) {
        this.pelicula = pelicula;
        this.auditorio = auditorio;
        this.precioEntrada = precioEntrada;
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getAuditorio() {
        return auditorio;
    }

    public void setAuditorio(Sala auditorio) {
        this.auditorio = auditorio;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
    
}
