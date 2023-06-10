
package Entidades;

import java.util.Set;

public class Doctor {
    private String nombre;
    private boolean trabajaNoche;
    private boolean trabaja24;
    private Set<Dias> diasDisponibles;
    private int guardiasSemanales = 0;
    private int mediasGuardiasSemanales = 0;
    private int guardiasMensuales = 0;
    private int mediasGuardiasMensuales = 0;

    public Doctor(String nombre, boolean trabajaNoche, boolean trabaja24, Set<Dias> diasDisponibles) {
        this.nombre = nombre;
        this.trabajaNoche = trabajaNoche;
        this.trabaja24 = trabaja24;
    }

    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTrabajaNoche() {
        return trabajaNoche;
    }

    public void setTrabajaNoche(boolean trabajaNoche) {
        this.trabajaNoche = trabajaNoche;
    }

    public Set<Dias> getDiasDisponibles() {
        return diasDisponibles;
    }

    public void setDiasDisponibles(Set<Dias> diasDisponibles) {
        this.diasDisponibles = diasDisponibles;
    }

    public int getGuardiasSemanales() {
        return guardiasSemanales;
    }

    public void setGuardiasSemanales(int guardiasSemanales) {
        this.guardiasSemanales = guardiasSemanales;
    }

    public int getMediasGuardiasSemanales() {
        return mediasGuardiasSemanales;
    }

    public void setMediasGuardiasSemanales(int mediasGuardiasSemanales) {
        this.mediasGuardiasSemanales = mediasGuardiasSemanales;
    }

    public int getGuardiasMensuales() {
        return guardiasMensuales;
    }

    public void setGuardiasMensuales(int guardiasMensuales) {
        this.guardiasMensuales = guardiasMensuales;
    }

    public int getMediasGuardiasMensuales() {
        return mediasGuardiasMensuales;
    }

    public void setMediasGuardiasMensuales(int mediasGuardiasMensuales) {
        this.mediasGuardiasMensuales = mediasGuardiasMensuales;
    }

    public boolean isTrabaja24() {
        return trabaja24;
    }

    public void setTrabaja24(boolean trabaja24) {
        this.trabaja24 = trabaja24;
    }
    
    
    public void agregarGuardia() {
        guardiasSemanales--;
        guardiasMensuales++;
    }

    public void agregarMediaGuardia() {
        mediasGuardiasSemanales--;
        mediasGuardiasMensuales++;
    }

    public void resetearGuadiasSemanales() {
        guardiasSemanales = 0;
        mediasGuardiasSemanales = 0;
    }
}
