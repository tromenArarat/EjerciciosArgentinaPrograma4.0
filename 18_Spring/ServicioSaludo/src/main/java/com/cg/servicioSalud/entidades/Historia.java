package com.cg.servicioSalud.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Historia {

    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @OneToOne
    private String idPaciente;

    private RegistroHistoria[] registros;
}
