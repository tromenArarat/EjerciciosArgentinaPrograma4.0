
package Servicios;

import Entidades.Empleado;
import java.util.Scanner;


public class ServicioEmpleados {
    
    private Scanner sc = new Scanner(System.in);
    
    public Empleado agregarEmpleado(){
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("Edad:");
        int edad = sc.nextInt();
        System.out.println("Salario:");
        double salario = sc.nextDouble();
        
        return new Empleado(nombre,edad,salario);
    }
    
    public void eliminarEmpleado(Empleado vaguito){
        vaguito.setNombre(null);
    }
    
    public void buscarEmpleado(){
        System.out.println("");
    }
    
}
