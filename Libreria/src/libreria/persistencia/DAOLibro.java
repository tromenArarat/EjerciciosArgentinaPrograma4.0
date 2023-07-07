package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

public class DAOLibro extends DAO<Libro> {
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(String dni) throws Exception {
        Libro libro = buscarPorDNI(dni);
        super.eliminar(libro);
    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT m FROM Libro m ").getResultList();
        desconectar();
        return libros;
    }

    public Libro buscarPorDNI(String nombre) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT m FROM Libro m WHERE m.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return libro;
    }
}
