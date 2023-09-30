package com.cg.servicioSalud.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Paciente extends Usuario {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String obraSocial;

    @OneToMany
    private List<HistorialClinico> historial;
}

/*
Métodos con permiso USER: registrarPaciente, actualizarPaciente

Métodos con permiso ADMIN: eliminarPaciente 

*/