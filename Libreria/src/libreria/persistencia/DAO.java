
package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DAO<T> {
    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("libreria");
    protected EntityManager em = EMF.createEntityManager();
    
    
}
