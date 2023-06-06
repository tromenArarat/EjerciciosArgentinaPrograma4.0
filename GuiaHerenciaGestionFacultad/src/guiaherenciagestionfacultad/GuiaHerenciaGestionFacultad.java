/*
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:

• Cambio del estado civil de una persona.

• Reasignación de despacho a un empleado.

• Matriculación de un estudiante en un nuevo curso.

• Cambio de departamento de un profesor.

• Traslado de sección de un empleado del personal de servicio.

• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.

*/
package guiaherenciagestionfacultad;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.Profesores;
import Servicios.FacultadServicios;

public class GuiaHerenciaGestionFacultad {

    public static void main(String[] args) {
        
        Profesores profesores = new Profesores();
        Estudiante estudiante = new Estudiante();
        
        FacultadServicios bedel = new FacultadServicios();
        bedel.cambiarEstado(estudiante);
        bedel.cambiarEstado(profesores);
        System.out.println(profesores.getEstadoCivil());
        
        bedel.reasignacionDespacho(profesores);
        System.out.println(profesores.getDespacho());
   
    }
    
}
