package libreria.persistencia;

import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class DAOLibro extends DAO<Libro> {
    
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(Libro libro) throws Exception {
        super.eliminar(libro);
    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT m FROM Libro m ").getResultList();
        desconectar();
        return libros;
    }
    
    @Override
    public void conectar(){
        super.conectar();
    }

    public Libro buscarPorISBN(long isbn) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT m FROM Libro m WHERE m.isbn = :isbn").setParameter("isbn", isbn).getSingleResult();
        return libro;
    }
    
    public Libro buscarPorId(String id) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT m FROM Libro m WHERE m.id = :id").setParameter("id", id).getSingleResult();
        return libro;
    }
    public Libro buscarPorAnio(int anio) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT m FROM Libro m WHERE m.anio = :anio").setParameter("anio", anio).getSingleResult();
        return libro;
    }
    public void cambiarIsbn(Libro libro)throws Exception{
        super.editar(libro);
    }
    public List<Libro> buscarLibroPorAutor(Autor autor)throws Exception{
        List<Libro> libros;
        conectar();
        libros = (List<Libro>) em.createQuery("SELECT m FROM Libro m WHERE m.autor = :autor").setParameter("autor", autor).getResultList();
        desconectar();
        return libros;
    }
    public List<Libro> buscarEditorial(Editorial editorial)throws Exception{
        List<Libro> libros;
        conectar();
        libros = (List<Libro>) em.createQuery("SELECT m FROM Libro m WHERE m.editorial = :editorial").setParameter("editorial", editorial).getResultList();
        desconectar();
        return libros;
    }
    public List<Libro> buscarLibroPorTitulo(String titulo)throws Exception{
        List<Libro> libros;
        conectar();
        libros = (List<Libro>) em.createQuery("SELECT m FROM Libro m WHERE m.titulo = :titulo").setParameter("titulo", titulo).getResultList();
        desconectar();
        return libros;
    }
    public void cambiarEjemplaresPrestados(Libro libro)throws Exception{
        super.editar(libro);
    }
    public void cambiarEjemplaresRestantes(Libro libro)throws Exception{
        super.editar(libro);
    }
}
