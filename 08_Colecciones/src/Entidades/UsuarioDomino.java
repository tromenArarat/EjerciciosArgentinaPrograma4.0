
package Entidades;

import java.util.LinkedList;

public class UsuarioDomino {
    
    private String nombre;
    private LinkedList atril = new LinkedList();

    public UsuarioDomino() {
    }

    public UsuarioDomino(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public LinkedList getAtril() {
        return atril;
    }

    public void setAtril(LinkedList atril) {
        this.atril = atril;
    }

    @Override
    public String toString() {
        return "Atril: " + atril;
    }
    
    
}
