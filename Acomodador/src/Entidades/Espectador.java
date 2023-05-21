/*
del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 */
package Entidades;

public class Espectador {
    
    private String nombre;
    private int edad;
    private int dinero;
    private Asiento butaca;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Asiento getButaca() {
        return butaca;
    }

    public void setButaca(Asiento butaca) {
        this.butaca = butaca;
    }

    
}
