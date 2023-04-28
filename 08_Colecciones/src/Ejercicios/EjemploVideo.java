
package Ejercicios;

import Servicios.MascotaServicio;

public class EjemploVideo {

    public static void main(String[] args) {
        // Instanciar servicio
        MascotaServicio veterinario = new MascotaServicio();
        
        // CrearMascota x2
        veterinario.crearMascota();
        veterinario.crearMascota();
        veterinario.crearMascota();
        
        // MostrarMascota
        System.out.println("Las mascotas cargadas en la colección Mascotas");
        veterinario.mostrarMascota();
    }
    
}
