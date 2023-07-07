
package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.DAOAutor;


public class AutorServicio {
    
    
    
    private final DAOAutor DAO;
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public AutorServicio(){
        this.DAO = new DAOAutor();
    }
    
    public Autor crearAutor() throws Exception{
        Autor escritor = new Autor();
        System.out.println("¿Cómo se llama el escritor?");
        String nombre = sc.next();
        escritor.setNombre(nombre);
        escritor.setAlta(Boolean.TRUE);
        DAO.evitarDuplicado(escritor, nombre);
        return escritor;
    }
    /*
        En este proyecto vamos a eliminar entidades, pero no es considerado una buena
        práctica. Por esto, además de eliminar nuestras entidades, vamos a practicar que nuestras
        entidades estén dadas de alta o de baja. Por lo que las entidades tendrán un atributo “activo”
        de tipo booleano, que estará en true al momento de crearlas y en false cuando las demos de
        baja, para evitar eliminarlas de la base de datos.
    */
    
    // 7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
    public void darDeBajaAutor(Autor escritor){
        escritor.setAlta(Boolean.FALSE);
    }
     public void darDeAltaAutor(Autor escritor){
        escritor.setAlta(Boolean.TRUE);
    }
    
     public void eliminarAutorPorNombre(Autor a) throws Exception{
         DAO.eliminar(a.getNombre());
     }
     
     public Autor buscarPorNombre() throws Exception{
         System.out.println("Nombre:");
         String nom = sc.next();
         return DAO.buscarPorNombre(nom);
     }
            
            
}
