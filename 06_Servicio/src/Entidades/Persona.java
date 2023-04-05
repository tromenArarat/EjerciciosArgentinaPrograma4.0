/*
Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
atributo, puede hacerlo. Agregar constructores, getters y setters.
 */
package Entidades;

public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private boolean esFeliz;
    //Constructores

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura, boolean esFeliz) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.esFeliz = esFeliz;
    }
    //Getter y setter

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isEsFeliz() {
        return esFeliz;
    }

    public void setEsFeliz(boolean esFeliz) {
        this.esFeliz = esFeliz;
    }
    
    
    
}
