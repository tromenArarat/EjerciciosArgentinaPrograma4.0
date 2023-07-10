
package biblioteca;

import biblioteca.persistencia.DAOAutor;
import biblioteca.persistencia.DAOEditorial;
import biblioteca.servicios.EditorialServicio;
import biblioteca.servicios.LibroServicio;
import java.util.Scanner;


public class Main {

 
        public static void main(String[] args) throws Exception{
       
        
        DAOAutor sabueso = new DAOAutor();
//        sabueso.eliminarAutor(sabueso.buscarPorId("951"));
        
        EditorialServicio corpo = new EditorialServicio();
        corpo.darDeBajaEditorial(corpo.buscarPorNombre("Alianza"));
//            System.out.println(corpo.buscarPorNombre("Alianza").getActiva());
//        corpo.eliminarEditorial(corpo.buscarPorId("952"));
        
        
        
//        try{
//        menu();    
//        }catch(Exception e){
//            System.out.println(e.toString());
//        }
        
        
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
                    librebrio.mostrarLibros();
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
    

