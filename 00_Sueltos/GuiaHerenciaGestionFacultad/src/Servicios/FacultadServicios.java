
package Servicios;

import Entidades.Empleado;
import Entidades.EstadoCivil;
import Entidades.Persona;
import Entidades.Profesores;
import java.util.Scanner;




public class FacultadServicios {
    
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /*
    • Cambio del estado civil de una persona. 
    
    
    
    • Reasignación de despacho a un empleado.

    • Matriculación de un estudiante en un nuevo curso.

    • Cambio de departamento de un profesor.

    • Traslado de sección de un empleado del personal de servicio.

    • Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
        que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.

    */
    
    public void cambioDepto(Profesores r){
        System.out.println("El profesor cuyo departamento quieres cambiar actualmente está en: "+r.getDepto());
        System.out.println("¿Cuál es el departamento al que se va?");
        String rta = sc.next();
        
    }
    
    public void reasignacionDespacho(Empleado z){
        System.out.println("La persona cuyo despacho quieres cambiar actualmente es: "+z.getDespacho());
        System.out.println("¿Cuál es el número de su nuevo despacho?");
        int rta = sc.nextInt();
        z.setDespacho(rta);
    }
    
    public void cambiarEstado(Persona x){
        System.out.println("La persona cuya estado civil quieres cambiar actualmente es "+x.getEstadoCivil());
        System.out.println("¿Cuál es su nuevo estado?");
        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        System.out.println("3 - Divorciado");
        System.out.println("4 - Buscando");
        
        int rta = sc.nextInt();
        switch(rta){
            case 1:
                x.setEstadoCivil(EstadoCivil.SOLTERO);
                break;
            case 2:
                x.setEstadoCivil(EstadoCivil.CASADO);
                break;
            case 3:
                x.setEstadoCivil(EstadoCivil.DIVORCIADO);
                break;
            case 4:
                x.setEstadoCivil(EstadoCivil.BUSCANDO);
                break;
        }
    }
    
    
    
}
