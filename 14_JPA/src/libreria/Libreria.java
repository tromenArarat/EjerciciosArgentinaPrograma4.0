/*
 Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
interactuar con el usuario. En esta clase se muestra el menú de opciones con las operaciones
disponibles que podrá realizar el usuario.
e) Tareas a realizar
Al alumno le toca desarrollar, las siguientes funcionalidades:
1) Crear base de datos Librería
2) Crear unidad de persistencia
3) Crear entidades previamente mencionadas (excepto Préstamo)
4) Generar las tablas con JPA
5) Crear servicios previamente mencionados.
6) Crear los métodos para persistir entidades en la base de datos librería.
7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
8) Búsqueda de un Autor por nombre.
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título.
11) Búsqueda de un libro/s por nombre de Autor.
12) Búsqueda de un libro/s por nombre de Editorial.
13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados.
 */
package libreria;

import java.util.Scanner;
import libreria.persistencia.DAOAutor;
import libreria.persistencia.DAOEditorial;
import libreria.servicios.AutorServicio;
import libreria.servicios.ClienteServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;


public class Libreria {

    public static void main(String[] args) throws Exception{
       
        
//        AutorServicio sabueso = new AutorServicio();
//        sabueso.darDeAlta(sabueso.buscarPorNombre("Jerome David Salinger"));

//        LibroServicio cebador = new LibroServicio();
//        cebador.mostrarLibros();
        
//        EditorialServicio corpo = new EditorialServicio();
//            corpo.darDeBajaEditorial(corpo.buscarPorId("1101"));
        
        
        
        try{
        menu();    
        }catch(Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
        
        
    }
    
    public static void menu()throws Exception{
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        LibroServicio librebrio = new LibroServicio();
        AutorServicio sabueso = new AutorServicio();
        String confirmacion = "no";
        do{
            System.out.println("------ Bienvenido a LIBROS SOCHA ------");
            System.out.println("--(1)--- BUSCAR LIBRO -----------------");
            System.out.println("--(2)--- BUSCAR AUTOR/A ---------------");
            System.out.println("--(3)--- BUSCAR EDITORIAL -------------");
            System.out.println("--(4)--- CREAR CLIENTE    -------------");
            System.out.println("--(5)--- OPCIONES DE ADMINISTRADOR-----");
            System.out.println("--(6)--- SALIR ------------------------");
            
            switch(sc.nextInt()){
                case 1:
                    System.out.println("--(1)--- BUSCAR POR ISBN -------");
                    System.out.println("--(2)--- BUSCAR POR AUTOR/A ----");
                    System.out.println("--(3)--- BUSCAR POR EDITORIAL --");
                    System.out.println("--(4)--- BUSCAR POR TÍTULO -----");
                    System.out.println("--(5)--- VOLVER AL MENÚ --------");
                    int rta = sc.nextInt();
                    switch(rta){
                        case 1:
                            System.out.println("ISBN:");
                            Long isbn = sc.nextLong();
                            System.out.println(librebrio.buscarLibroPorISBN(isbn).getTitulo());
                            break;
                        case 2:
                            librebrio.buscarLibrosPorAutor();
                            break;
                        case 3:
                            librebrio.buscarLibrosPorEditorial();
                            break;
                        case 4:
                            librebrio.buscarLibrosPorTitulo();
                            break;
                        case 5:
                            menu();
                    }
                    break;
                case 2:
                    librebrio.buscarLibrosPorAutor();
                    break;
                case 3:
                    librebrio.buscarLibrosPorEditorial();
                    break;
                case 4:
                    ClienteServicio cliente = new ClienteServicio();
                    cliente.crearCliente();
                    break;
                case 5:
                    System.out.println("--(1)--- CARGAR LIBRO ----------");
                    System.out.println("--(2)--- ELIMINAR LIBRO --------");
                    System.out.println("--(3)--- PRESTAR LIBRO ---------");
                    System.out.println("--(4)--- DEVOLVER LIBRO ---------");
                    System.out.println("--(5)--- VOLVER AL MENÚ --------");
                    switch(sc.nextInt()){
                        case 1:
                            librebrio.crearLibro();
                            break;
                        case 2:
                            System.out.println("Ingrese el id del libro que quiere eliminar");
                            int anioProvisto = sc.nextInt();
                            librebrio.eliminarLibro(librebrio.buscarLibroPorAnio(anioProvisto));
                            break;
                        case 3:
                            PrestamoServicio prestamista = new PrestamoServicio();
                            prestamista.crearPrestamo();
                            break;
                        case 4:
                            PrestamoServicio prestamista3 = new PrestamoServicio();
                            prestamista3.devolverLibro();
                            break;
                        case 5:
                            menu();
                            break;
                    }
                    break;
                case 6:
                    System.out.println("¿Está seguro de que desea salir?");
                    confirmacion = sc.next();
                    break;
            }
        }while(confirmacion.equals("no"));
    }
}
