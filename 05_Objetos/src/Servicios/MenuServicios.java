
package Servicios;

import Entidad.MenuDinamico;
import java.util.Scanner;


public class MenuServicios {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public MenuDinamico crearMenu(){
        System.out.println("Opciones:");
        int opciones = sc.nextInt();
        return new MenuDinamico(opciones);
    }
    
}
