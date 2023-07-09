
package pruebajpa.servicios;

import pruebajpa.entidades.Mesa;
import pruebajpa.persistencia.DAO;
import pruebajpa.persistencia.DAOMesa;

public class mesaServicios {
    
    private final DAOMesa DAO;

    public mesaServicios() {
        this.DAO = new DAOMesa();
    }
    
    public Mesa crearMesa(){
        int cant = 4;
        Mesa mesa = new Mesa(cant);
        
            mesa.setCantSillas(4);
            
            return mesa;
         
        
    }
    
}
