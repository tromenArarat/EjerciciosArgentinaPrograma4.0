package com.cg.servicioSalud.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Turno {

    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    private Integer precioFinal;

    private String motivo;

    private Boolean estado;

    @OneToOne
    private Profesional profesional;

    @OneToOne
    private Paciente paciente;

    private Integer duracion;
}
