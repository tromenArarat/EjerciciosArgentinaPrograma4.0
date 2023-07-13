/*
Tareas a realizar

3) Crear entidad Préstamo
4) Registrar el préstamo de un libro.
5) Devolución de un libro
6) Búsqueda de todos los préstamos de un Cliente.
• Agregar validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados.
• No generar condiciones inválidas. Por ejemplo, no se debe permitir prestar más
ejemplares de los que hay, ni devolver más de los que se encuentran prestados.
No se podrán prestar libros con fecha anterior a la fecha actual, etc.
 */

package libreria.servicios;

import java.util.Date;
import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.DAOCliente;
import libreria.persistencia.DAOLibro;
import libreria.persistencia.DAOPrestamo;

public class PrestamoServicio {
    
    private final DAOPrestamo DAO;
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public PrestamoServicio(){
        this.DAO = new DAOPrestamo();
    }
    
    public void crearPrestamo()throws Exception{
        Prestamo prestamo = new Prestamo();
        //mostrar clientes de la lista
        ClienteServicio clienteServ = new ClienteServicio();
        clienteServ.listarClientes();
        System.out.println("Seleccione el id de su cliente");
        Integer id = sc.nextInt();
        DAOCliente daoC = new DAOCliente();
        try{
            prestamo.setCliente(daoC.buscarPorId(id));
        }catch(Exception e){
            System.out.println("El id ingresado no existe");
        }

        System.out.println("ISBN del libro que se va a prestar:");
        long isbn = sc.nextLong();
        DAOLibro librero = new DAOLibro();
        Libro libroAprestar = librero.buscarPorISBN(isbn);
        
        prestamo.setLibro(libroAprestar);
        libroAprestar.setEmplaresPrestados(+1);
        libroAprestar.setEmplaresRestantes(libroAprestar.getEjemplares()-libroAprestar.getEmplaresPrestados());
        librero.cambiarEjemplaresPrestados(libroAprestar);
        librero.cambiarEjemplaresRestantes(libroAprestar);
        
        Date diaActual = new Date();
        prestamo.setFechaPrestamo(diaActual);
        long diaActualEnMiliSegundos = diaActual.getTime();
        long unDiaEnMiliSegundos = 24 * 60 * 60 * 1000;
        long quinceDiasDespues = diaActualEnMiliSegundos + (unDiaEnMiliSegundos*15);
        Date fechaDev = new Date(quinceDiasDespues);
        prestamo.setFechaDevolucion(fechaDev);
        
        DAO.guardar(prestamo);
        
    }
    

    public void devolverLibro(){
        System.out.println("ISBN del libro:");
        long isbn = sc.nextLong();
        
        Prestamo prestamo = DAO.buscarPrestamoPorIsbn(isbn);
        
        Date fechaPrevista = prestamo.getFechaDevolucion();
        prestamo.setFechaDevolucion(new Date());
        
        
        if(prestamo.getFechaDevolucion().after(fechaPrevista)){
            System.out.println("eeehhhh");
        }else{
            System.out.println("Qué lindo día no?");
        }
        
        /*
        prestamo.setEmplaresPrestados(-1);
        libroAprestar.setEmplaresRestantes(libroAprestar.getEjemplares()-libroAprestar.getEmplaresPrestados());
        librero.cambiarEjemplaresPrestados(libroAprestar);
        librero.cambiarEjemplaresRestantes(libroAprestar);
        */
        
        
        
        DAO.editarPrestamo(prestamo);
    }
    
   
    
    
    
}
