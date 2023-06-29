
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
    
    public void modificarProductoPrecio(Producto producto) throws Exception{
        try{
            if(producto == null){
                throw new Exception("Debe indicar el producto cuyo precio desea modificar");
            }
            String sql = "UPDATE producto SET "
                    + " nombre = '" + producto.getNombre() + "' , precio = '" + producto.getPrecio() + "' , codigoFabricante = " + producto.getCodigoFabricante()
                    + " WHERE codigo = '" + producto.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        }
    
    public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try{
            String sql = "SELECT * FROM producto WHERE nombre = " + nombre + "";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                
            }
            desconectarBase();
            return producto;
        }catch(Exception e){
            desconectarBase();
            throw e;
        }
    }
    
    
    }
    

