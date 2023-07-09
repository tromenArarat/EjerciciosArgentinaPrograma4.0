
package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.fabricanteDAO;
import tienda.persistencia.productoDAO;

public class fabricanteServicio {
   
    private fabricanteDAO dao;

    public fabricanteServicio() {
        this.dao = new fabricanteDAO();
    }
    
    public void insertarFabricante(String nombre) throws Exception {
        try {
            //Validamos
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar la gracia");
            }
            //Creamos el fabricante
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            dao.insertarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
}
