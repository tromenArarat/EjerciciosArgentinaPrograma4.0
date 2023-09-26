package com.cg.servicioSalud.entidades;

import com.cg.servicioSalud.enumeradores.Modalidad;
import com.cg.servicioSalud.enumeradores.ObraSocial;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Profesional extends Usuario {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @OneToOne
    private Imagen imagen;

    private Integer reputacion;

    private Integer tarifa;

    @ManyToOne
    private Disponibilidad disponibilidad;

    @ManyToOne
    private Modalidad modalidad;

    private String ubicacion;

    private ObraSocial[] obrasSociales;
}
