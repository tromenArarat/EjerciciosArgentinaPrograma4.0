package com.cg.servicioSalud.entidades;

import com.cg.servicioSalud.enumeradores.Estado;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Turno {

    @Id
    @GeneratedValue(generator = "uuid")     
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @OneToOne
    private Paciente paciente;
    
    @OneToOne
    private Profesional profesional;
    
    @Enumerated(EnumType.STRING)
    private Estado estado;// 
    
    private String motivo;
    
    private Double precioFinal;
}
