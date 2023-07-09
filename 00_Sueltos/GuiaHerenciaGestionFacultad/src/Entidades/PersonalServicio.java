/*
Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...r.
 */
package Entidades;

import java.util.Date;

public class PersonalServicio extends Empleado {
    
    private String seccion;

    public PersonalServicio(Date incorporacion, int despacho, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(incorporacion, despacho, nombre, apellido, id, estadoCivil);
    }
    
}
