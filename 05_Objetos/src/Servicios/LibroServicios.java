
package Servicios;

import java.util.Scanner;
import Entidad.Libro;

public class LibroServicios {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Libro relleno(){
        
        System.out.println("ISBN:");
        long isbn = sc.nextLong();
        
        System.out.println("Título:");
        String titulo = sc.next();
        
        System.out.println("Autor:");
        String autor = sc.next();
        
        System.out.println("Cantidad de páginas:");
        int pp = sc.nextInt();
        
        
        return new Libro(isbn,titulo,autor,pp);
    }
}
