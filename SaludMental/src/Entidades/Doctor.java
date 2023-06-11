
package Entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Doctor {
    private String nombre;
    private boolean trabajaNoche;
    private boolean trabaja24;
    private ArrayList<Dia> diasDisponibles;
    private int guardiasSemanales = 0;
    private int mediasGuardiasSemanales = 0;
    private int creditoParaGuardias = 28;
    private int mediasGuardiasMensuales = 0;
    private ArrayList<Guardia> guardias;

    public Doctor(String nombre, boolean trabajaNoche, boolean trabaja24, ArrayList<Dia> diasDisponibles) {
        this.nombre = nombre;
        this.trabajaNoche = trabajaNoche;
        this.trabaja24 = trabaja24;
        this.diasDisponibles = diasDisponibles;
        this.guardias = new ArrayList();
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

    public ArrayList<Dia> getDiasDisponibles() {
        return diasDisponibles;
    }

    public void setDiasDisponibles(ArrayList<Dia> diasDisponibles) {
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

    public int getCreditoParaGuardias() {
        return creditoParaGuardias;
    }

    public void setCreditoParaGuardias(int creditoParaGuardias) {
        this.creditoParaGuardias = creditoParaGuardias;
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

    public ArrayList<Guardia> getGuardias() {
        return guardias;
    }

    public void setGuardias(ArrayList<Guardia> guardias) {
        this.guardias = guardias;
    }
    
    
    
  
    public void resetearGuadiasSemanales() {
        guardiasSemanales = 0;
        mediasGuardiasSemanales = 0;
    }
    
    

    @Override
    public String toString() {
        return "Doctor: "+ nombre + 
                '\n' +"Trabaja de noche: " + trabajaNoche + 
                '\n' +"Trabaja 24 hs: " + trabaja24 + 
                '\n' +"Días disponibles: " + diasDisponibles + 
                '\n' +"Cant. guardias semanales de 24 hs: " + guardiasSemanales +
                '\n' +"Cant. guardias semanales de 12 hs: " + mediasGuardiasSemanales + 
                '\n' +"Crédito para guardias: " + creditoParaGuardias + 
                '\n' +"Guardias asignadas: " + guardias.toArray().toString()+
                '\n';
    }
    
    
    
}
