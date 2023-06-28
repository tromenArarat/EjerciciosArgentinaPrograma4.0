package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
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
            //Creamos el mascota
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            dao.insertarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }

    /*
    public void crearProducto(String correoElectronico, String clave) throws Exception {

        try {
            //Validamos
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }
            if (correoElectronico.contains("@") == false) {
                throw new Exception("El correo electrónico es incorrecto");
            }
            if (clave == null || clave.trim().isEmpty()) {
                throw new Exception("Debe indicar la clave");
            }
            if (clave.length() < 8) {
                throw new Exception("La clave no puede tener menos de 8 caracteres");
            }
            if (buscarUsuarioPorCorreoElectronico(correoElectronico) != null) {
                throw new Exception("Ya existe un usuario con el correo electrónico indicado " + correoElectronico);
            }

            //Creamos el usuario
            Usuario usuario = new Usuario();
            usuario.setCorreoElectronico(correoElectronico);
            usuario.setClave(clave);
            dao.guardarUsuario(usuario);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarClaveUsuario(String correoElectronico, String claveActual, String nuevaClave) throws Exception {

        try {

            //Validamos
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el usuario");
            }

            if (claveActual == null || claveActual.trim().isEmpty()) {
                throw new Exception("Debe indicar la clave actual");
            }

            if (nuevaClave == null || nuevaClave.trim().isEmpty()) {
                throw new Exception("Debe indicar la clave nueva");
            }

            //Buscamos
            Usuario usuario = buscarUsuarioPorCorreoElectronico(correoElectronico);

            //Validamos
            if (!usuario.getClave().equals(claveActual)) {
                throw new Exception("La clave actual no es la regsitrada en el sistema para el correo electrónico indicado");
            }

            //Modificamos
            usuario.setClave(nuevaClave);

            dao.modificarUsuario(usuario);
        } catch (Exception e) {
            throw e;
        }
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

    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception {

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
