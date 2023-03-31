
package Entidad;

import java.util.Scanner;

public class Cocina {
    
    // Atributos
    private String receta;
 
    // Constructores
    public Cocina() {
    }

    public Cocina(String receta) {
        this.receta = receta;
    }
    // Get y set

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }
    
    // Métodos
    
    public void agregarReceta(){
        System.out.println("¿Qué vamos a comer?");
        Scanner sc = new Scanner(System.in);
        receta = sc.next();
        
    }
    public void buscarReceta(){
        System.out.println("¿Qué querés comer?");
        Scanner sc = new Scanner(System.in);
        String buscado = sc.next();
        if(buscado==receta){
            System.out.println("Bueno");
        }else{
            System.out.println("Nos faltan ingredientes");
        }
        
    }
    public void posibleReceta(){
        
    }
}
