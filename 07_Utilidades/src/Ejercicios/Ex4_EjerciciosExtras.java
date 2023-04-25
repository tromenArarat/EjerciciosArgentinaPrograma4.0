/*
Ejercicio 2: Crear una aplicación de gestión de empleados
Crea una clase llamada Empleado que tenga los siguientes atributos: 
nombre, edad y salario. 

Crea una clase llamada ServicioEmpleado que tenga los siguientes métodos: 
agregarEmpleado, eliminarEmpleado y buscarEmpleado. 

Crea una clase llamada Main donde puedas probar los métodos de la clase ServicioEmpleado.
 */
package Ejercicios;

import Servicios.ServicioEmpleados;
import java.util.Scanner;

public class Ex4_EjerciciosExtras {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ServicioEmpleados fontanero = new ServicioEmpleados();
        
        
        
        String confirmacionSalida = "no";
        int respuesta = 0;
        
        do{
            System.out.println("Menu");
            System.out.println("1.Agregar Empleado");
            System.out.println("2.Buscar Empleado");
            System.out.println("3.Salir");
            
            respuesta = sc.nextInt();
            
            switch(respuesta){
                case 1:
                    fontanero.agregarEmpleado();
                    break;
                case 2:
                    fontanero.buscarEmpleado();
                break;
                case 3:
                    System.out.println("¿Está seguro de que desea salir?");
                confirmacionSalida = sc.next();
            }
            
        }while(confirmacionSalida.equals("no"));
        
        
        
        
    }
    
}
