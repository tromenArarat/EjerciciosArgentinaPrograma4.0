package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnosServicio {
    // Atributos
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> nota;
    private ArrayList<Alumno> curso;
    
    // Constructor
    public AlumnosServicio() {
        this.sc = new Scanner(System.in);
        this.nota = new ArrayList();
        this.curso = new ArrayList();
    }
    
    
    // Método para crear objeto Alumno
    
    public void crearAlumno(){
        String rsp = "";
        do{
            int nota1, nota2, nota3;
            String nombre;
            
            System.out.println("Nombre: ");
            nombre = sc.next();
            
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
    
    /*
    El usuario ingresa el nombre del alumno que quiere calcular su nota
    final y se lo busca en la lista de Alumnos.
    
    Si está en la lista, se llama al método. Dentro
    del método se usará la lista notas para calcular el promedio final de alumno. 
    Siendo este promedio final, devuelto por el método y mostrado en el main
    */
    public void buscarAlumno(){
        
        System.out.println("Ingrese el nombre del alumno que desea buscar: ");
        String nombre = sc.next();
        for (Alumno pibe : curso) {
            if(pibe.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(promedioFinal(pibe));
            }
        }
        
    }
    
    public double promedioFinal(Alumno pibe){
        double promedio;
        int suma = 0;
        for (int i = 0; i < pibe.getNotas().size(); i++) {
            suma += pibe.getNotas().get(i);
        }
            
        promedio = suma/pibe.getNotas().size();
            
        return promedio;
    }
    
}