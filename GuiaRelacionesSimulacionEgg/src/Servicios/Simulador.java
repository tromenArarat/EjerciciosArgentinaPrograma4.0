
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;

public class Simulador {
    /*
    La clase Simulador debe tener un método que genere un listado de alumnos manera
    aleatoria y lo retorne. 
    
    Las combinaciones de nombre y apellido deben ser generadas de
    manera aleatoria. 
    
    Nota: usar listas de tipo String para generar los nombres y los apellidos.
    */
    
    private ArrayList<Alumno> alumnos = new ArrayList();
    
    private ArrayList<String> nombres = new ArrayList();
    private ArrayList<String> apellidos = new ArrayList();
    private ArrayList<Integer> dnis = new ArrayList();
    
    String nombre = "";
    
   public ArrayList<Alumno> crearAlumnos(){
       nombres.add(0,"Jesús");
       nombres.add(1,"Maria");
       nombres.add(2,"David");
       nombres.add(3,"Pedro");
       nombres.add(4,"Lucas");
       nombres.add(5,"Mateo");
       nombres.add(6,"Marcos");
       nombres.add(7,"Juan");
       nombres.add(8,"Tomás");
       nombres.add(9,"Santiago");
       
       apellidos.add(0, "Molina");
       apellidos.add(1, "Vidal");
       apellidos.add(2, "Saihueque");
       apellidos.add(3, "Dellepiane");
       apellidos.add(4, "Court");
       apellidos.add(5, "Manriquez");
       apellidos.add(6, "Lombardo");
       apellidos.add(7, "Principi");
       apellidos.add(8, "Ciro");
       apellidos.add(9, "Soto");
       
       for (String apellido : apellidos) {
           int x = (int)(Math.random()*9);
           String nombreYapellido = nombres.get(x) + " " + apellido;
           alumnos.add(new Alumno(nombreYapellido));
       }
             
       return alumnos;
   } 
   
   /*
    Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
    rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
    debe retornar la lista de dnis.
   */
   
   public ArrayList<Integer> generarDni(){
       
       int dniFalso = 21126545;
       for (Alumno alumno : alumnos) {
           dniFalso = (int) (Math.random()*21130589+10000000);
           alumno.setDni(dniFalso);
           dnis.add(alumno.getDni());
       }
       return dnis;
   }
   
   
   public void mostrarAlumnos(){
       for (Alumno alumno : alumnos) {
           System.out.println(alumno.toString());
       }
       for (Integer dni : dnis) {
           System.out.println(dni);
       }
   }
   
}
