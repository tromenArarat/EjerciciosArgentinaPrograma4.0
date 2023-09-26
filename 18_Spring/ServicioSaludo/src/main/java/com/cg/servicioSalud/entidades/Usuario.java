package com.cg.servicioSalud.entidades;

import com.cg.servicioSalud.enumeradores.Rol;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String nombre;

    private String apellido;

    private String mail;

    private Long telefono;

    private String nombreUsuario;

    private String clave;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    private Date alta;
}
