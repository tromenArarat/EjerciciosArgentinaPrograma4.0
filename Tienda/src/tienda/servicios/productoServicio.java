package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.productoDAO;

/*
CRUD (create, read, update y delete)
crear (o insertar), consultar, actualizar y borrar
*/

public class productoServicio {
    
     private productoDAO dao;

    public productoServicio() {
        this.dao = new productoDAO();
    }
    
    public void insertarProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            //Validamos
            if (codigo == 0 ) {
                throw new Exception("Debe indicar el código");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar nombre del producto");
            }
             if (precio == 0) {
                throw new Exception("Debe indicar un precio razonable");
            }
             if (codigoFabricante == 0 ) {
                throw new Exception("Debe indicar el código del fabricante");
            }
            //Creamos el producto
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.insertarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }
        
        public void modificarProductoPrecio(String nombre, double nuevoPrecio) throws Exception {

        try {

            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del producto");
            }

            if (nuevoPrecio == 0) {
                throw new Exception("Debe indicar el precio");
            }

            //Buscamos
            Producto producto = buscarProductoPorNombre(nombre);

            //Modificamos
            producto.setPrecio(nuevoPrecio);

            dao.modificarProductoPrecio(producto);
            
        } catch (Exception e) {
            throw e;
        }
        }
        
        public Producto buscarProductoPorNombre(String nombre) throws Exception {

        try {

            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del producto");
            }

            Producto producto = dao.buscarProductoPorNombre(nombre);

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
        
    }

    /*
        
    public void eliminarUsuario(String correoElectronico) throws Exception {

        try {

            //Validamos 
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }

            dao.eliminarUsuario(correoElectronico);
        } catch (Exception e) {
            throw e;
        }
    }

    public Usuario buscarProductoPorNombre(String nombre) throws Exception {

        try {

            //Validamos
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }

            Usuario usuario = dao.buscarUsuarioPorCorreoElectronico(correoElectronico);

            return usuario;
        } catch (Exception e) {
            throw e;
        }
    }

    public Usuario buscarUsuarioPorId(Integer id) throws Exception {

        try {

            //Validamos
            if (id == null) {
                throw new Exception("Debe indicar el id");
            }

            Usuario usuario = dao.buscarUsuarioPorId(id);

            return usuario;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Usuario> listarUsuario() throws Exception {

        try {

            Collection<Usuario> usuarios = dao.listarUsuarios();

            return usuarios;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirUsuarios() throws Exception {

        try {

            //Listamos los usuarios
            Collection<Usuario> usuarios = listarUsuario();

            //Imprimimos los usuarios
            if (usuarios.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Usuario u : usuarios) {
                    System.out.println(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    }

    */
    
    
    
}
