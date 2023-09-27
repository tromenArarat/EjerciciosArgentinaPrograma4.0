
package com.cg.servicioSalud.entidades;

import com.cg.servicioSalud.enumeradores.Dia;
import com.cg.servicioSalud.enumeradores.Horario;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Disponibilidad {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @Enumerated(EnumType.STRING)
    private Dia dia;
    
    @Enumerated(EnumType.STRING)
    private Horario horario;
}
