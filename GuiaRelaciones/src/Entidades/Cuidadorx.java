
package Entidades;

    public class Cuidadorx {
    
        private String nombre;
        private String apellido;
        private int edad;
        private int dni;
        private Perro rope;

    public Cuidadorx() {
    }

    public Cuidadorx(String nombre, String apellido, int edad, int dni, Perro rope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.rope = rope;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public Perro getRope() {
        return rope;
    }

    public void setRope(Perro rope) {
        this.rope = rope;
    }
        
        
        
}
