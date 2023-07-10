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
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;


public class Libreria {

    public static void main(String[] args) throws Exception{
       
        
//        AutorServicio sabueso = new AutorServicio();
//        sabueso.editarProcedencia(sabueso.buscarPorNombre("Jorge Luis Borges"),"Argentina");
        
//        EditorialServicio corpo = new EditorialServicio();
//            corpo.darDeBajaEditorial(corpo.buscarPorId("1101"));
        
        
        
        try{
        menu();    
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        
    }
    
    public static void menu()throws Exception{
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        LibroServicio librebrio = new LibroServicio();
        String confirmacion = "no";
        do{
            System.out.println("------ Bienvenido a LIBROS SOCHA ------");
            System.out.println("--(1)--- VER LIBROS -------------------");
            System.out.println("--(2)--- VER AUTORES ------------------");
            System.out.println("--(3)--- VER EDITORIALES --------------");
            System.out.println("--(4)--- OPCIONES DE ADMINISTRADOR-----");
            System.out.println("--(5)--- SALIR ------------------------");
            
            switch(sc.nextInt()){
                case 1: 
                    break;
                case 2:
                    break;
                case 3: 
                    break;
                case 4:
                    System.out.println("--(1)--- CARGAR LIBRO ----------");
                    System.out.println("--(2)--- ELIMINAR LIBRO --------");
                    System.out.println("--(3)--- PRESTAR LIBRO ---------");
                    System.out.println("--(4)--- VOLVER AL MENÚ --------");
                    switch(sc.nextInt()){
                        case 1:
                            librebrio.crearLibro();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            menu();
                            break;
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro de que desea salir?");
                    confirmacion = sc.next();
                    break;
            }
        }while(confirmacion.equals("no"));
    }
}
