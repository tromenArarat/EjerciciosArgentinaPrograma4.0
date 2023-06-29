
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
    
   // f) Ingresar un producto a la base de datos.
    public void insertarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO producto (nombre, precio, idFabricante) "
                    + "VALUES ( '" +producto.getNombre() + "' ," + 
                    producto.getPrecio()+ "' ," + producto.getCodigoFabricante() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    // h) Editar un producto con datos a elección
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
    
    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try{
            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + "";
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
    
    // a) Listar el nombre de todos los productos que hay en la tabla producto
    public ArrayList<String> listarProductosPorNombre() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto ";
            consultarBase(sql);
            Producto producto = null;
            ArrayList<String> productosNombre = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                productosNombre.add(producto.getNombre());
            }
            desconectarBase();
            return productosNombre;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    // b) Lista los nombres y los precios de todos los productos de la tabla producto
    public Collection<Producto> listarProductosPorNombreYprecio() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productosNombreyPrecio = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                productosNombreyPrecio.add(producto);
            }
            desconectarBase();
            return productosNombreyPrecio;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    // c) Listar aquellos productos que su precio esté entre 120 y 202.
    public Collection<Producto> productosOferta()throws Exception{
        try{
            
        String sql = "SELECT nombre,precio FROM producto "
                +"WHERE precio > 119 AND precio < 203 ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productosOferta = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                productosOferta.add(producto);
            }
            desconectarBase();
            return productosOferta;
            } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    // d) Buscar y listar todos los Portátiles de la tabla producto.
    public Collection<Producto> productosPortatiles()throws Exception{
        try{
            
        String sql = "SELECT nombre,precio FROM producto "
                +"WHERE nombre LIKE '%port%'";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productosPortatiles = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                productosPortatiles.add(producto);
            }
            desconectarBase();
            return productosPortatiles;
            } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    // e) Listar el nombre y el precio del producto más barato
    public Collection<Producto> productoMasBarato()throws Exception{
        try{
        String sql = "SELECT nombre,precio FROM producto "
                +"WHERE precio = (SELECT min(precio) FROM producto)";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productoMasBarato = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                productoMasBarato.add(producto);
            }
            desconectarBase();
            return productoMasBarato;
            } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    }
    

