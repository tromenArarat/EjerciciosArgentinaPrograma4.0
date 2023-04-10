/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
con su correspondiente letra (NIF). Los atributos serán el número de DNI
(entero largo) y la letra (String o char) que le corresponde. 
 */
package Entidades;

public class NIF {
    private int dni;
    private String letra;

    public NIF() {
    }

    public NIF(int dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

}

