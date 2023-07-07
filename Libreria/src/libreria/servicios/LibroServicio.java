
package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.DAOLibro;

public class LibroServicio {
    
    private final DAOLibro DAO;
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public LibroServicio(){
        this.DAO = new DAOLibro();
    }
    
    public Libro crearLibro() throws Exception{
        Libro codice = new Libro();
        System.out.println("ISBN:");
        long isbn = sc.nextLong();
        
        // Acá empieza la joda
        long anterior = 0;
        try{
            anterior = DAO.buscarPorISBN(isbn).getIsbn();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        if(isbn==anterior){
            System.out.println("Un libro con este ISBN ya fue cargado. El libro es " + DAO.buscarPorISBN(isbn).getIsbn());
            crearLibro();
        }
        
        System.out.println("Título:");
        String titulo = sc.next();
        System.out.println("Año:");
        Integer anio = sc.nextInt();
        System.out.println("Ejemplares:");
        Integer ejemplares = sc.nextInt();
        System.out.println("Nombre del autor");
        String nombreAutor = sc.next();
        Autor autor = new Autor();
        autor.setNombre(nombreAutor);
        System.out.println("Nombre de la editorial");
        String nombreEditorial = sc.next();
        Editorial editorial = new Editorial();
        editorial.setNombre(nombreEditorial);
       
        Boolean activo = true;
        
        codice = new Libro(isbn,titulo,anio,ejemplares,activo,autor,editorial);
        
        
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
