
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
            //INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('mouse' , 10, 1);
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ( '" +producto.getNombre() + "' ," + 
                    producto.getPrecio()+ " ," + producto.getCodigoFabricante() + " );";
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
            String sql = "UPDATE producto SET precio = " + producto.getPrecio()+ " WHERE codigo = " + producto.getCodigo()+"";
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
    
      public Collection<Producto> listarProductos()throws Exception{
          try{
              String sql = "SELECT * FROM producto ";
              consultarBase(sql);
              Producto producto = null;
              Collection<Producto> productos = new ArrayList();
              while(resultado.next()){
                  producto = new Producto();
                  producto.setCodigo(resultado.getInt(1));
                  producto.setNombre(resultado.getString(2));
                  producto.setPrecio(resultado.getDouble(3));
                  producto.setCodigoFabricante(resultado.getInt(4));
                  productos.add(producto);
              }
              desconectarBase();
              return productos;
          }catch(Exception e){
              e.printStackTrace();
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
                producto.setNombre(resultado.getString("nombre"));
                productosNombre.add(producto.getNombre()+"\n");
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
    public ArrayList<String> listarProductosPorNombreYprecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ";
            consultarBase(sql);
            Producto producto = null;
            ArrayList<String> productosNombreyPrecio = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                String nombreYprecio = producto.getNombre()+"\n"+producto.getPrecio();
                productosNombreyPrecio.add(nombreYprecio);
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
    public ArrayList<String> productosOferta()throws Exception{
        try{
            
        String sql = "SELECT nombre,precio FROM producto WHERE precio > 119 AND precio < 203 ";
            consultarBase(sql);
            Producto producto = null;
            ArrayList<String> productosOferta = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                String nombreYprecio = producto.getNombre() + " " + producto.getPrecio() +"\n";
                productosOferta.add(nombreYprecio);
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
    public ArrayList<String> productosPortatiles()throws Exception{
        try{
            
        String sql = "SELECT nombre,precio FROM producto WHERE nombre LIKE '%ort%'";
            consultarBase(sql);
            Producto producto = null;
            ArrayList<String> productosPortatiles = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                String portatiles = producto.getNombre() + " " + producto.getPrecio();
                 
                productosPortatiles.add(portatiles);
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
    public ArrayList<String> productoMasBarato()throws Exception{
        try{
        String sql = "SELECT nombre,precio FROM producto "
                +"WHERE precio = (SELECT min(precio) FROM producto)";
            consultarBase(sql);
            Producto producto = null;
            ArrayList<String> productoMasBarato = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                String toraba = producto.getNombre() + " " + producto.getPrecio();
                productoMasBarato.add(toraba);
            }
            desconectarBase();
            return productoMasBarato;
            } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    /*
    public void modificarProducto(producto Producto) throws Exception {
        try {
            if (Producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto SET "
                    + " nombre = '" + Producto.getNombre() + "' , precio = " + Producto.getPrecio() + " , codigo_fabricante = " + Producto.getCodigoFabricante()
                    + " WHERE codigo = " + Producto.getCodigo();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    */
    
    }
    

