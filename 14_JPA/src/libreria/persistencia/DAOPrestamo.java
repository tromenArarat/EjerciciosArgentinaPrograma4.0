
package libreria.persistencia;

import libreria.entidades.Prestamo;

public class DAOPrestamo extends DAO<Prestamo> {
    @Override
    public void guardar(Prestamo prestamo){
        super.guardar(prestamo);
    }
    
    public Prestamo buscarPrestamoPorIsbn(long isbn){
        conectar();
        Prestamo prestamo = (Prestamo) em.createQuery("SELECT m FROM Prestamo m INNER JOIN Libro f ON m.libro_id = f.id WHERE f.isbn = :isbn").setParameter("isbn",isbn).getSingleResult();
        desconectar();
        return prestamo;
    }
    public void editarPrestamo(Prestamo prestamo){
       conectar();
       em.getTransaction().begin();
       em.merge(prestamo);
       em.getTransaction().commit();
       desconectar();
    }
}
