/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package ejercicios;

import Entidad.Libro;
import Servicios.LibroServicios;
import java.util.Scanner;

public class Ej1_Libro {

    public static void main(String[] args) {
        
        LibroServicios service = new LibroServicios();
        
           
            Libro libro1 = service.relleno();
//         for (int i = 0; i < 5; i++) {
////           libro1 = libro1.setItem("libro"+i);
//            
//        }
            System.out.println(libro1.toString());

            
        
               
//        String rta = ""; 
//        do{
//            System.out.println("MENU:"+'\n'+ "1.Cargar libro"+'\n'+ "2.Consultar libro cargado"+'\n'+ "3.Salir");
//            rta = sc.next();
//            switch(rta){
//                case "1":
//                    relleno(libro);
//                continue;
//                case "2":
//                    System.out.println(consulta(libro));
//                continue;
//                default:
//                break;
//               }
//        }while(!"3".equals(rta));
//        
//    }
    
//    public static void relleno(Libro libro){
//        
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        
//        System.out.println("ISBN:");
//        libro.setIsbn(sc.nextLong());
//        
//        System.out.println("Título:");
//        libro.setTitulo(sc.next());
//        
//        System.out.println("Autor:");
//        libro.setAutor(sc.next());
//        
//        System.out.println("Cantidad de páginas:");
//        libro.setPp(sc.nextInt());
//    }
    
//    public static String consulta(Libro libro){
//        
//        String retorno = libro.toString();
//        
//        return retorno;
//    }
}
}

