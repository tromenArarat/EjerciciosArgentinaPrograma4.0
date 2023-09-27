package com.cg.servicioSalud.entidades;

import com.cg.servicioSalud.enumeradores.Modalidad;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Profesional extends Usuario {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private Double reputacion;

    private Integer tarifa;

    @OneToMany
    private List<Disponibilidad> disponibilidad;

    @Enumerated(EnumType.STRING)
    private Modalidad modalidad; //telemedicina o presencial

    private String ubicacion;

    @OneToMany
    private List<String> obrasSociales; //con cuáles trabaja
    
    private String especialidad;

    private Boolean estado; //true = alta; false = baja
}


//Crear un método crearDisponibilidad()
//ModificarDisponibilidad Cada vez que se tome un turno
