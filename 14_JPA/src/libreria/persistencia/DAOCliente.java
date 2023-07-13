
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Cliente;

public class DAOCliente extends DAO<Cliente>{
    
    @Override
    public void guardar(Cliente cliente) {
        super.guardar(cliente);
    }
    
    public List<Cliente> listarClientes(){
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT m FROM Cliente m ").getResultList();
        desconectar();
        return clientes;
    }
    
    public Cliente buscarPorId(Integer id){
        Cliente cliente = (Cliente) em.createQuery("SELECT m FROM Cliente m WHERE m.id = :id").setParameter("id",id).getSingleResult();
        return cliente;
    }
    
}
