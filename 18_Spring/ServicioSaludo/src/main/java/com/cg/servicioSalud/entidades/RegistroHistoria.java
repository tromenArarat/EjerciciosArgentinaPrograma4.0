package com.cg.servicioSalud.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class RegistroHistoria {

    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    private String observacion;
    
    private Turno turno;
    
}
