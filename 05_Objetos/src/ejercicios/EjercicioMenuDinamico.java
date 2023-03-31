/*
Intentando crear un menu dinámico.
 */
package ejercicios;

import Entidad.MenuDinamico;
import Servicios.MenuServicios;


public class EjercicioMenuDinamico {

    public static void main(String[] args) {
        MenuServicios service = new MenuServicios();
        
        MenuDinamico menuNuevo = service.crearMenu();
       
        System.out.println(menuNuevo.imprimirMenu());
        
    }
    
}
