package biblioteca.servicios;

import biblioteca.entidades.Autor;
import biblioteca.persistencia.DAOAutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutorServicio {
    
    private final DAOAutor DAO;
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public AutorServicio(){
        this.DAO = new DAOAutor();
    }
    
    public void cargarAutor(Autor autor) throws Exception{
        DAO.guardar(autor);
    }
    
    public Autor buscarPorNombre(String nom) throws Exception{
         return DAO.buscarPorNombre(nom);
     }
     
     public List<Autor> listarAutores() throws Exception{
         List<Autor> autores = new ArrayList();
         autores = DAO.listarTodosLosAutores();
         return autores;
     }
    
}
