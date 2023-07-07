
package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.persistencia.DAOLibro;

public class LibroServicio {
    
    private final DAOLibro DAO;
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public LibroServicio(){
        this.DAO = new DAOLibro();
    }
    
    public Libro crearLibro(){
        System.out.println("ISBN:");
        String isbn = sc.next();
        System.out.println("Título:");
        String titulo = sc.next();
        System.out.println("Año:");
        Integer anio = sc.nextInt();
        System.out.println("Ejemplares:");
        Integer ejemplares = sc.nextInt();
        Boolean activo = true;
        Libro codice = new Libro(isbn,titulo,anio,ejemplares,activo);
        
        return codice;
    }
    /*
        En este proyecto vamos a eliminar entidades, pero no es considerado una buena
        práctica. Por esto, además de eliminar nuestras entidades, vamos a practicar que nuestras
        entidades estén dadas de alta o de baja. Por lo que las entidades tendrán un atributo “activo”
        de tipo booleano, que estará en true al momento de crearlas y en false cuando las demos de
        baja, para evitar eliminarlas de la base de datos.
    */
    
    // 7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
    public void darDeBajaLibro(Libro broli){
        broli.setAlta(Boolean.FALSE);
    }
     public void darDeAltaEditorial(Libro broli){
        broli.setAlta(Boolean.TRUE);
    }
    
}
