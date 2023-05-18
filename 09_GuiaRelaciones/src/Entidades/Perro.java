
package Entidades;
public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private int kg;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, int kg) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.kg = kg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
    
    
    
}
