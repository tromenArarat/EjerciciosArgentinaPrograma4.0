package pruebajpa.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import pruebajpa.entidades.Mesa;

public class DAO<T> {
    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("pruebaJPAPU");
    protected EntityManager em = EMF.createEntityManager();
    
    
    
    
    protected void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }
    
    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
    protected void guardar(T k){
        conectar();
        em.getTransaction().begin();
        em.persist(k);
        em.getTransaction().commit();
        desconectar();
    }
    
}
