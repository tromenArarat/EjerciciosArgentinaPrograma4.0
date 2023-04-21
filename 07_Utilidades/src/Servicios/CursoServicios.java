
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicios {

    private Scanner sc = new Scanner(System.in);
    
    /*
    d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
    los alumnos que asisten a las clases. Nosotros nos encargaremos de
    almacenar esta información en un arreglo e iterar con un bucle,
    solicitando en cada repetición que se ingrese el nombre de cada
    alumno.
    */
    public void cargarAlumnos(Curso pibes){
        
        String[] alumno = new String[5];
        
        for (int i = 0; i < pibes.getAlumnos().length; i++) {
            
            System.out.println("Nombre alumno:");
            
            alumno[i] = sc.next();
            
            pibes.setAlumnos(alumno);
        }
  
    }
  
    /*
    e) Método crearCurso(): el método crear curso, le pide los valores de
    los atributos al usuario y después se le asignan a sus respectivos
    atributos para llenar el objeto Curso. En este método invocamos al
    método cargarAlumnos() para asignarle valor al atributo alumnos    
    
    
    NO ESTARÍA INVOCANDO EL MÉTODO SINO HACIENDO LO MISMO QUE HACE EL MÉTODO
    */  
    
    public Curso crearCurso(){
        System.out.println("Nombre del curso:");
        String nombreCurso = sc.next();
        System.out.println("Cantidad de horas por día:");
        int cantidadHorasPorDia = sc.nextInt();
        System.out.println("Cantidad de horas por día:");
        int cantidadDiasPorSemana = sc.nextInt();
        System.out.println("Turno:");
        boolean turno = sc.nextBoolean();
        float precioPorHora = sc.nextFloat();
        
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            
            System.out.println("Nombre alumno:");
            
            alumnos[i] = sc.next();
            
        }
        
        
        return new Curso(nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,turno,precioPorHora,alumnos);
    }
    
    /*
    f) Método calcularGananciaSemanal(): este método se encarga de
    calcular la ganancia en una semana por curso. Para ello, se deben
    multiplicar la cantidad de horas por día, el precio por hora, la
    cantidad de alumnos y la cantidad de días a la semana que se repite
    el encuentro.
    
    ESTA QUEDA PENDIENTE POR MERCANTILISTA. QUE TE VAYA A LIQUIDAR EL SUELDO TU ABUELA ;)
    */
    
    
    
    
}
