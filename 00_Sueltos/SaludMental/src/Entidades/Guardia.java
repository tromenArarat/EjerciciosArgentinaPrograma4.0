
package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Guardia {
    private int id_guardia;
    private LocalDate fecha;
    private char turno;
    
    private Profesional profesional;
    private ArrayList<Profesional> candidates = new ArrayList();
    
    private boolean feriado;
    private char dia;

    public Guardia(int id_guardia, LocalDate fecha, char turno, Profesional profesional, boolean feriado, char dia) {
        this.id_guardia = id_guardia;
        this.fecha = fecha;
        this.turno = turno;
        this.profesional = profesional;
        this.feriado = feriado;
        this.dia = dia;
    }

    public int getId_guardia() {
        return id_guardia;
    }

    public void setId_guardia(int id_guardia) {
        this.id_guardia = id_guardia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    
    public boolean isFeriado() {
        return feriado;
    }

    public void setFeriado(boolean feriado) {
        this.feriado = feriado;
    }

    public char getDia() {
        return dia;
    }

    public void setDia(char dia) {
        this.dia = dia;
    }

    public ArrayList<Profesional> getCandidates() {
        return candidates;
    }

    public void setCandidates(ArrayList<Profesional> candidates) {
        this.candidates = candidates;
    }
    
    
    
    //Comparator
    public static Comparator<Guardia> ordenarPorDia = new Comparator<Guardia>(){
        @Override
        public int compare(Guardia g1,Guardia g2){
            LocalDate guardia1 = g1.getFecha();
            LocalDate guardia2 = g2.getFecha();
            return guardia1.compareTo(guardia2);
        }
    };

    @Override
    public String toString() {
        return "Guardia{" + "id_guardia=" + id_guardia + ", fecha=" + fecha + ", turno=" + turno + ", profesional=" + profesional + ", feriado=" + feriado + ", dia=" + dia + '}';
    }

    
}
