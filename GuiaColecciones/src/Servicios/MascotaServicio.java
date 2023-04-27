
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

public class MascotaServicio {
    private Scanner sc;
    private ArrayList<String> mascotas;

    public MascotaServicio() {
        this.sc = new Scanner(System.in);
        this.mascotas = new ArrayList();
    }
    
    public void crearMascota(){
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("Apodo:");
        String apodo = sc.next();
        System.out.println("Tipo:");
        String tipo = sc.next();
        
        String mascota = nombre + " " + apodo + " " + tipo;
        
        mascotas.add(mascota);
    }
    
    public void mostrarMascota(){
        for (String aux : mascotas) {
            System.out.println(aux);
        }
    }
    
}
