
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.persistencia.DAOCliente;


public class ClienteServicio {
    
     private final DAOCliente DAO;
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public ClienteServicio(){
        this.DAO = new DAOCliente();
    }
    
    public void crearCliente(){
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("Apellido:");
        String apellido = sc.next();
        System.out.println("DNI:");
        Long dni = sc.nextLong();
        System.out.println("Teléfono:");
        String tel = sc.next();
        DAO.guardar(new Cliente(dni,nombre,apellido,tel));
    }
    
    public void listarClientes(){
        List<Cliente> clientes = DAO.listarClientes();
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getId() + " " + cliente.getNombre() + " " + cliente.getApellido());
        }
    }
    
    public void buscarPorId(Integer id){
        DAO.buscarPorId(id);
    }

    
}
