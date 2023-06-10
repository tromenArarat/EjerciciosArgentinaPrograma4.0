
package Servicios;

import Entidades.Doctor;
import Entidades.Guardia;
import Entidades.Turno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuardiasServicios {

    private List<Guardia> guardias = new ArrayList();
    private List<Doctor> doctores = new ArrayList();

    public GuardiasServicios() {
        guardias = new ArrayList<>();
        doctores = new ArrayList<>();
    }

    public void agregarGuardia(Guardia guardia) {
        guardias.add(guardia);
    }
    
    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void asignarGuardias() {
        
        // Mezclar las guardias y los doctores for fairness
        Collections.shuffle(guardias);
        Collections.shuffle(doctores);
        
        /*
        Acá empiezan las condiciones:
        1ero. Reservar 1 guardia de fin de semana para cada uno (SÁBADO O DOMINGO)
        2do. mientras doctor.getGuardiasMensuales sea mayor a cero, 
            SI trabaja de noche es verdadero o el turno de la guardia es de dia Y doctor.getGuardiasSemanales =< 3.5
                SI trabaja 24hs
                    asignarle la guardia y la que sigue en orden, para eso volver a ordenar con Collections.sort por fecha
                SINO
                    asignarle la guardia
            SI trabaja de noche es falso y turno de la guardia es de dia y doctor.getGuardiasSemanales =< 3.5
            
        asignarle guardia
        */
        
        
        for (Guardia guardia : guardias) {
            
        }

        // Asignar guardias a doctor
        for (Doctor doctor : doctores) {
            while (doctor.getGuardiasSemanales() > 0) {
                for (Guardia guardia : guardias) {
                    if (doctor.isTrabajaNoche() || guardia.getTurno() == Turno.DIA) {
                        if (doctor.getDiasDisponibles().contains(guardia.getDiaDeLaSemana())) {
                            asignarGuardiaDoctor(doctor, guardia);
                            if (doctor.getGuardiasSemanales() == 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        // Asignar media guardia a doctor
        for (Doctor doctor : doctores) {
            while (doctor.getMediasGuardiasSemanales() > 0) {
                for (Guardia guardia : guardias) {
                    if (doctor.isTrabajaNoche() || guardia.getTurno() == Turno.DIA) {
                        if (doctor.getDiasDisponibles().contains(guardia.getDiaDeLaSemana())) {
                            asignarMediaGuardiaDoctor(doctor, guardia);
                            if (doctor.getMediasGuardiasSemanales() == 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        // Imprimir la wea
        for (Doctor doctor : doctores) {
            System.out.println(doctor.getNombre() +
                    "\" - Guardias semanales: " + doctor.getGuardiasSemanales() +
                    "\" - Medias Guardias Semanales: " + doctor.getMediasGuardiasSemanales() +
                    "\" - Guardias Mensuales: " + doctor.getGuardiasMensuales() +
                    "\" Medias Guardias Mensuales: " + doctor.getMediasGuardiasMensuales());
        }
    }

private void asignarGuardiaDoctor(Doctor doctor, Guardia guardia) {
        doctor.agregarGuardia();
        guardias.remove(guardia);
    }

    private void asignarMediaGuardiaDoctor(Doctor doctor, Guardia guardia) {
        doctor.agregarMediaGuardia();
        guardias.remove(guardia);
    }
    
    // Métodos de ayuda para contar guardias y medias guardias
    private int contarGuardias() {
        int contador = 0;
        for (Guardia guardia : guardias) {
            if (!guardia.isMediaGuardia()) {
                contador++;
            }
        }
        return contador;
    }

    private int contarMediasGuardias() {
        int contador = 0;
        for (Guardia guardia : guardias) {
            if (guardia.isMediaGuardia()) {
                contador++;
            }
        }
        return contador;
    }
    
    public void mostrarDiasDisponiblessDr(Doctor doc){
        System.out.println(doc.getDiasDisponibles());
    }

    

    
}

