
package biblioteca.persistencia;

import biblioteca.entidades.Autor;
import java.util.List;

public class DAOAutor extends DAO<Autor> {
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
        
    }

    public void evitarDuplicado(Autor autor, String nombre) throws Exception {
        String escritor;
            escritor = (String) em.createQuery("SELECT a.nombre FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
        if(!escritor.equals(autor.getNombre())){
            super.guardar(autor);
        }else{
            System.out.println("El autor ya fue cargado");
        }
    }
    
    public void eliminarAutor(Autor escritor) throws Exception {
    if (escritor != null) {
        em.getTransaction().begin();
        Autor mergedAutor = em.merge(escritor);
        em.getTransaction().commit();
        super.eliminar(mergedAutor);
    } else {
        throw new IllegalArgumentException("No se encontró ningún Autor con el nombre proporcionado: " + escritor.getNombre());
    }
}

    public List<Autor> listarTodosLosAutores() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT m FROM Autor m ").getResultList();
        return autores;
    }

    public Autor buscarPorNombre(String nombre) throws Exception {
        conectar();
        List<Autor> escritores;
        escritores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).setMaxResults(1).getResultList();
        desconectar();
         if (!escritores.isEmpty()) {
        Autor escritor = escritores.get(0);
        return escritor;
    } else {
        throw new Exception("No se encontró ningún Autor con el nombre proporcionado: " + nombre);
    }
    }
    
    public Autor buscarPorId(String id) throws Exception {
        conectar();
        List<Autor> escritores;
        escritores = em.createQuery("SELECT a FROM Autor a WHERE a.id = :id").setParameter("id", id).setMaxResults(1).getResultList();
        desconectar();
         if (!escritores.isEmpty()) {
        Autor escritor = escritores.get(0);
        return escritor;
    } else {
        throw new Exception("No se encontró ningún Autor con el id proporcionado: " + id);
    }
    }
}
