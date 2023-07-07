
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;


public class DAOAutor extends DAO<Autor>{
    
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
        
    }

    public void evitarDuplicado(Autor autor, String nombre) throws Exception {
        Autor escritor;
        try{
            escritor = (Autor) em.createQuery("SELECT a.nombre FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
        }catch (Exception e){
            super.guardar(autor);
        }
    }
    
    public void eliminar(String nombre) throws Exception {
        Autor autor = buscarPorNombre(nombre);
        super.eliminar(autor);
    }

    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> autors = em.createQuery("SELECT m FROM Autor m ").getResultList();
        desconectar();
        return autors;
    }

    public Autor buscarPorNombre(String nombre) throws Exception {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT m FROM Autor m WHERE m.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }
}
