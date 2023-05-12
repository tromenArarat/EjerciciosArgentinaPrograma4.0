/*
2) Clase Programador: esta clase posee los siguientes 
                    atributos: 
                        - id (representa el número del jugador), 
                        - nombre (Empezara con Programador más su ID, “Programador 1” por ejemplo) 
                        - vive (indica si está con vida o no el programador). 

El número de programadores será decidido por el usuario, pero debe ser entre 1 y 6. 
Si no está en este rango, por defecto será 6.
    
Métodos:
    • disparo(Revolver r): el método, recibe el revolver de vida y llama a los métodos de
    darVida() y siguienteDisparo() de Revolver. El programador se apunta, aprieta el gatillo y si el
    revolver tira vida, el jugador se anima. El atributo vive pasa a true y el método
    devuelve true, sino false y false.
 */
package Entidades;

public class Programador {
    
        private int id;
        private String nombre;
        private boolean vive = false;

    public Programador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

        

public boolean disparo(Revolver r){
    // llama al método darVida para comprobar si la posActual coincide con posVida
    if(r.darVida()){
        r.siguienteDisparo();
        this.vive = true;
        return true;
         
    }else{
        r.siguienteDisparo();
        this.vive = false;
        return false;
    }
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
