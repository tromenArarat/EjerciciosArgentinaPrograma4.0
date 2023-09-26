package com.cg.servicioSalud.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Calendario {

    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    private Profesional profesional;

    private Turno[] turnos;
}
