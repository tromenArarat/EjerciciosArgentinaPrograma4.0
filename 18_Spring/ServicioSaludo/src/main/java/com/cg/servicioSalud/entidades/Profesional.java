package com.cg.servicioSalud.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Profesional extends Usuario implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private Double reputacion;

    private Integer tarifa;

    private String disponibilidad;
    
    private String modalidad; //telemedicina o presencial

    private String ubicacion;

    private Boolean obrasSociales; // Desarrollar aparte el descuento según qué obra tenga
    
    private String especialidad;

    private Boolean activo; // true = alta; false = baja
}


//Crear un método crearDisponibilidad()
//ModificarDisponibilidad Cada vez que se tome un turno
