
package Entidades;

import java.time.LocalDate;

public class Profesional {
    private int id_prof;
    
    private String nombre;
    private int credito;
    
    private String diasDisp;
    private String nochesDisp;
    private String centinelaDisp;
    
    private LocalDate fechaLicencia;
    private LocalDate finLicencia;
    
    private int guardias24;
    
    private int guardiasFinde;
    private int guardiasFindeAmterior;
    private int guardiasMes;
    private int guardiasMesAnterior;
    
     // cantidad de guardias / cantidad de docs 

    public Profesional() {
    }
       
    public Profesional(int id_prof, String nombre, int credito, String diasDisp, String nochesDisp, String centinelaDisp, LocalDate fechaLicencia, LocalDate finLicencia, int guardiasFinde, int guardiasFindeAmterior, int guardiasMes, int guardiasMesAnterior) {
        this.id_prof = id_prof;
        this.nombre = nombre;
        this.credito = credito;
        this.diasDisp = diasDisp;
        this.nochesDisp = nochesDisp;
        this.centinelaDisp = centinelaDisp;
        this.fechaLicencia = fechaLicencia;
        this.finLicencia = finLicencia;
        this.guardiasFinde = guardiasFinde;
        this.guardiasFindeAmterior = guardiasFindeAmterior;
        this.guardiasMes = guardiasMes;
        this.guardiasMesAnterior = guardiasMesAnterior;
    }

    public int getId_prof() {
        return id_prof;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getDiasDisp() {
        return diasDisp;
    }

    public void setDiasDisp(String diasDisp) {
        this.diasDisp = diasDisp;
    }

    public String getNochesDisp() {
        return nochesDisp;
    }

    public void setNochesDisp(String nochesDisp) {
        this.nochesDisp = nochesDisp;
    }

    public String getCentinelaDisp() {
        return centinelaDisp;
    }

    public void setCentinelaDisp(String centinelaDisp) {
        this.centinelaDisp = centinelaDisp;
    }

    public LocalDate getFechaLicencia() {
        return fechaLicencia;
    }

    public void setFechaLicencia(LocalDate fechaLicencia) {
        this.fechaLicencia = fechaLicencia;
    }

    public LocalDate getFinLicencia() {
        return finLicencia;
    }

    public void setFinLicencia(LocalDate finLicencia) {
        this.finLicencia = finLicencia;
    }

    public int getGuardiasFinde() {
        return guardiasFinde;
    }

    public void setGuardiasFinde(int guardiasFinde) {
        this.guardiasFinde = guardiasFinde;
    }

    public int getGuardiasFindeAmterior() {
        return guardiasFindeAmterior;
    }

    public void setGuardiasFindeAmterior(int guardiasFindeAmterior) {
        this.guardiasFindeAmterior = guardiasFindeAmterior;
    }

    public int getGuardiasMes() {
        return guardiasMes;
    }

    public void setGuardiasMes(int guardiasMes) {
        this.guardiasMes = guardiasMes;
    }

    public int getGuardiasMesAnterior() {
        return guardiasMesAnterior;
    }

    public void setGuardiasMesAnterior(int guardiasMesAnterior) {
        this.guardiasMesAnterior = guardiasMesAnterior;
    }

    public int getGuardias24() {
        return guardias24;
    }

    public void setGuardias24(int guardias24) {
        this.guardias24 = guardias24;
    }
    

    @Override
    public String toString() {
        return "Profesional{" + "id_prof=" + id_prof + ", nombre=" + nombre + ", credito=" + credito + ", diasDisp=" + diasDisp + ", nochesDisp=" + nochesDisp + ", centinelaDisp=" + centinelaDisp + ", fechaLicencia=" + fechaLicencia + ", finLicencia=" + finLicencia + ", guardiasFinde=" + guardiasFinde + ", guardiasFindeAmterior=" + guardiasFindeAmterior + ", guardiasMes=" + guardiasMes + ", guardiasMesAnterior=" + guardiasMesAnterior + '}';
    }
   
    
    
    
    
    
}
