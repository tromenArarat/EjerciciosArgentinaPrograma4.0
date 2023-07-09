
package biblioteca.persistencia;

import java.util.List;
import biblioteca.entidades.Libro;

public class DAOLibro extends DAO<Libro> {
    
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(long isbn) throws Exception {
        Libro libro = buscarPorISBN(isbn);
        super.eliminar(libro);
    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT m FROM Libro m ").getResultList();
        desconectar();
        return libros;
    }

    public Libro buscarPorISBN(long isbn) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT m FROM Libro m WHERE m.isbn = :isbn").setParameter("isbn", isbn).getSingleResult();
        return libro;
    }
    
}
