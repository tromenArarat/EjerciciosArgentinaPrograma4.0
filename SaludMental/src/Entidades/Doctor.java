
package Entidades;

import java.util.ArrayList;
import java.util.HashMap;

public class Doctor {
    private String nombre;
    private boolean trabajaNoche;
    private boolean trabaja24;
    private ArrayList<Disponibilidad> disponibilidad = new ArrayList();
    private int guardiasSemanales = 0;
    private int creditoParaGuardias = 28; // cantidad de guardias / cantidad de docs 
    private int guardias12Asignadas = 0;
    private int guardias24Asignadas = 0;
    private int guardiasFindOferiado = 0;
    private ArrayList<Guardia> guardias;
    // listado

    public Doctor(String nombre, boolean trabajaNoche, boolean trabaja24, ArrayList<Disponibilidad> disponibilidad) {
        this.nombre = nombre;
        this.trabajaNoche = trabajaNoche;
        this.trabaja24 = trabaja24;
        this.disponibilidad = disponibilidad;
       
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

    public ArrayList<Disponibilidad> getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(ArrayList<Disponibilidad> disponibilidad) {
        this.disponibilidad = disponibilidad;
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
    
     public void mostrarDiasDisponiblessDr(){
         for (Disponibilidad disponibilidad1 : disponibilidad) {
             System.out.println(disponibilidad.toString());
         }
    }
    
  
    public void resetearGuardias() {
        guardiasSemanales = 0;
        guardias24Asignadas = 0;
        guardias12Asignadas = 0;
    }
    
    public String toStringo(){
        StringBuilder sb = new StringBuilder();
        for (Disponibilidad disponibilidad1 : disponibilidad) {
            sb.append(disponibilidad1.toString()).append(" ");
        }
        String result = sb.toString();
        if(!result.isEmpty()){
            result = result.substring(0,result.length()-2);
        }
        return "["+result+"]";
    }
    

    @Override
    public String toString() {
        
        
               
        return "Doctor: "+ nombre + 
                '\n' +"Trabaja de noche: " + trabajaNoche + 
                '\n' +"Trabaja 24 hs: " + trabaja24 + 
                '\n' +"Días disponibles: " + toStringo() + 
                '\n' +"Guardias de 24 hs asignadas: " + guardias24Asignadas +
                '\n' +"Guardias de 12 hs asignadas: " + guardias12Asignadas + 
                '\n' +"Guardias de finde o feriado: " + guardiasFindOferiado +
                '\n' +"Promedio de guardias semanales: " + guardiasSemanales +
                '\n' +"Crédito para guardias: " + creditoParaGuardias + 
                '\n';
    }
    
    
    
    
}
