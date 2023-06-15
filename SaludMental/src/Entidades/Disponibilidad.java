
package Entidades;


public class Disponibilidad {
    
    private Dia dia;
    private Turno turno;

    public Disponibilidad() {
    }

    public Disponibilidad(Dia dia, Turno turno) {
        this.dia = dia;
        this.turno = turno;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "[" + dia + ", Turno:" + turno + "] ";
    }
    
    
}
