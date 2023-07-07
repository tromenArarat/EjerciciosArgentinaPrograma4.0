package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

public class DAOEditorial extends DAO<Editorial> {
        @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    public void eliminar(String dni) throws Exception {
        Editorial editorial = buscarPorDNI(dni);
        super.eliminar(editorial);
    }

    public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> editorials = em.createQuery("SELECT m FROM Editorial m ").getResultList();
        desconectar();
        return editorials;
    }

    public Editorial buscarPorDNI(String nombre) throws Exception {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT m FROM Editorial m WHERE m.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return editorial;
    }
}
