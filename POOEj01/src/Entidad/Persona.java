
package Entidad;

public class Persona {

    // atributos
    
    public String nombre;
    public int edad;
    public int dni;
    public boolean occiso;
    
    
    // constructores
    
    public Persona(String nombre, int edad, int dni, boolean occiso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.occiso = occiso;
    }

    public Persona(){
        
    }
    
    // métodos propios

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isOcciso() {
        return occiso;
    }

    public void setOcciso(boolean occiso) {
        this.occiso = occiso;
    }
    
    
}



