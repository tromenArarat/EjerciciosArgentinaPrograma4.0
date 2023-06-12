
package Entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Doctor {
    private String nombre;
    private boolean trabajaNoche;
    private boolean trabaja24;
    // Convertir en HashMap<Dia,Turno>
    HashMap<Dia,Turno> diasYturnosDisp = new HashMap();
//    private ArrayList<Dia> diasDisponibles;
    private int guardiasSemanales = 0;
    private int creditoParaGuardias = 28;
    private int guardias12Asignadas = 0;
    private int guardias24Asignadas = 0;
    private int guardiasFindOferiado = 0;
    private ArrayList<Guardia> guardias;

    public Doctor(String nombre, boolean trabajaNoche, boolean trabaja24, HashMap<Dia,Turno> diasYturnosDisp) {
        this.nombre = nombre;
        this.trabajaNoche = trabajaNoche;
        this.trabaja24 = trabaja24;
        this.diasYturnosDisp = diasYturnosDisp;
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

    public HashMap<Dia,Turno> getDiasYturnosDisp() {
        return diasYturnosDisp;
    }

    public void setDiasYturnosDisp(HashMap<Dia,Turno> diasYturnosDisp) {
        this.diasYturnosDisp = diasYturnosDisp;
    }

    public int getGuardiasSemanales() {
        return guardiasSemanales;
    }

    public void setGuardiasSemanales(int guardiasSemanales) {
        this.guardiasSemanales = guardiasSemanales;
    }

    public int getGuardias12Asignadas() {
        return guardias12Asignadas;
    }

    public void setGuardias12Asignadas(int guardias12Asignadas) {
        this.guardias12Asignadas = guardias12Asignadas;
    }

    public int getCreditoParaGuardias() {
        return creditoParaGuardias;
    }

    public void setCreditoParaGuardias(int creditoParaGuardias) {
        this.creditoParaGuardias = creditoParaGuardias;
    }

    public int getGuardias24Asignadas() {
        return guardias24Asignadas;
    }

    public void setGuardias24Asignadas(int guardias24Asignadas) {
        this.guardias24Asignadas = guardias24Asignadas;
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

    public int getGuardiasFindOferiado() {
        return guardiasFindOferiado;
    }

    public void setGuardiasFindOferiado(int guardiasFindOferiado) {
        this.guardiasFindOferiado = guardiasFindOferiado;
    }
    
    
    
  
    public void resetearGuardias() {
        guardiasSemanales = 0;
        guardias24Asignadas = 0;
        guardias12Asignadas = 0;
    }
    
    

    @Override
    public String toString() {
        
        
               
        return "Doctor: "+ nombre + 
                '\n' +"Trabaja de noche: " + trabajaNoche + 
                '\n' +"Trabaja 24 hs: " + trabaja24 + 
                // Dudas acá
                '\n' +"Días disponibles: " + diasYturnosDisp.keySet() + 
                '\n' +"Guardias de 24 hs asignadas: " + guardias24Asignadas +
                '\n' +"Guardias de 12 hs asignadas: " + guardias12Asignadas + 
                '\n' +"Crédito para guardias: " + creditoParaGuardias + 
                '\n';
    }
    
    
    
    
}
