
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;
import tienda.servicios.productoServicio;

public final class productoDAO extends DAO{
    
    private productoServicio productoServicio;

    public productoDAO() {
        this.productoServicio = productoServicio;
    }
    
    public void insertarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio, idFabricante) "
                    + "VALUES ( '" + producto.getCodigo() + "' , '" + producto.getNombre() + "' ," + 
                    producto.getPrecio()+ "' ," + producto.getCodigoFabricante() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
}
