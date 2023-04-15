/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. 
 */
package Entidades;

public class ParDeNumeros {
    private Integer integer1;
    private Integer integer2;

    public ParDeNumeros() {
        this.integer1 = (int)(Math.random()*10+-10);
        this.integer2 = (int)(Math.random()*10+-10);
        
    }

    public Integer getInteger1() {
        return integer1;
    }

    public void setInteger1(Integer integer1) {
        this.integer1 = integer1;
    }

    public Integer getInteger2() {
        return integer2;
    }

    public void setInteger2(Integer integer2) {
        this.integer2 = integer2;
    }
    
    
    
    
}
