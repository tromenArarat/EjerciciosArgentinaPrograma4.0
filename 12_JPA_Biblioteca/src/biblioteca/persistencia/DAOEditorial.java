package biblioteca.persistencia;

import biblioteca.entidades.Editorial;
import java.util.List;

public class DAOEditorial extends DAO<Editorial>{
    
    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    public void eliminar(String nombre) throws Exception {
        Editorial editorial = buscarPorNombre(nombre);
        super.eliminar(editorial);
    }
    
    public void eliminarEditorial(Editorial e) throws Exception{
        super.eliminar(e);
    }

    public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> editorials = em.createQuery("SELECT m FROM Editorial m ").getResultList();
        return editorials;
    }

    public Editorial buscarPorNombre(String nombre) throws Exception {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT m FROM Editorial m WHERE m.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
//        desconectar();
        return editorial;
    }
    
    public Editorial buscarPorId(String id)throws Exception{
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT m FROM Editorial m WHERE m.id LIKE :id").setParameter("id", id).getSingleResult();
//        desconectar();
        return editorial;
    }
    
    public void cambiarEstado(Editorial editorial)throws Exception{
        super.editar(editorial);
    }
    
}
