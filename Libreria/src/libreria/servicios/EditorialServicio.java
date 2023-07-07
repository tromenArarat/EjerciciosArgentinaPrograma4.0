
package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.DAOEditorial;

public class EditorialServicio {
    private final DAOEditorial DAO;
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public EditorialServicio(){
        this.DAO = new DAOEditorial();
    }
    
    public Editorial crearEditorial(){
        Editorial publisher = new Editorial();
        System.out.println("¿Cómo se llama la editorial?");
        publisher.setNombre(sc.next());
        publisher.setAlta(Boolean.TRUE);
        return publisher;
    }
    /*
        En este proyecto vamos a eliminar entidades, pero no es considerado una buena
        práctica. Por esto, además de eliminar nuestras entidades, vamos a practicar que nuestras
        entidades estén dadas de alta o de baja. Por lo que las entidades tendrán un atributo “activo”
        de tipo booleano, que estará en true al momento de crearlas y en false cuando las demos de
        baja, para evitar eliminarlas de la base de datos.
    */
    
    // 7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
    public void darDeBajaEditorial(Editorial publisher){
        publisher.setAlta(Boolean.FALSE);
    }
     public void darDeAltaEditorial(Editorial publisher){
        publisher.setAlta(Boolean.TRUE);
    }
}
