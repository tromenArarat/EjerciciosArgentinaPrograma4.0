
package biblioteca.servicios;

import biblioteca.entidades.Editorial;
import biblioteca.persistencia.DAOEditorial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditorialServicio {
     private final DAOEditorial DAO;
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public EditorialServicio(){
        this.DAO = new DAOEditorial();
    }
    
    public void crearEditoriale(Editorial editorial) throws Exception{
        DAO.guardar(editorial);
    }
    
    public Editorial buscarPorNombre(String nom) throws Exception{
        return DAO.buscarPorNombre(nom);
     }
     
     public List<Editorial> listarEditoriales() throws Exception{
         List<Editorial> editoriales = new ArrayList();
         editoriales = DAO.listarTodos();
         return editoriales;
     }
}
