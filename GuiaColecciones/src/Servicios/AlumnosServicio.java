import Listas.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cami
 */
public class AlumnosServicio {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> nota = new ArrayList();
    int nota1, nota2, nota3;
    String nombre;
    String rsp = "";
    ArrayList<Alumno> curso = new ArrayList();
    
    public void crearAlumno(){
        do{
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            System.out.println("Nota 1: ");
            nota1 = sc.nextInt();
            nota.add(nota1);
            System.out.println("Nota2: ");
            nota2 = sc.nextInt();
            nota.add(nota2);
            System.out.println("Nota 3: ");
            nota3 = sc.nextInt();
            nota.add(nota3);
            
            System.out.println("¿Desea ingresar otro alumno? si/no");
            rsp = sc.next();
            curso.add(new Alumno(nombre, nota));
            
            
            
            
}while(rsp.equals("si"));
    }
    
    

   
 
    
    public double promedioFinal(ArrayList nota){
        System.out.println("Ingrese el nombre del alumno que desea buscar: ");
        String nombre = sc.nextLine();
        Iterator iterador = curso.iterador();
        while(iterador.next().equals(nombre)){   
        }
    }
    
    
}