
package Entidades;


public class Guardia {
    private Dias diaDeLaSemana;
    private Turno turno;
    private boolean mediaGuardia;

    public Guardia(Dias diaDeLaSemana, Turno turno, boolean mediaGuardia) {
        this.diaDeLaSemana = diaDeLaSemana;
        this.turno = turno;
        this.mediaGuardia = mediaGuardia;
    }

    public Dias getDiaDeLaSemana() {
        return diaDeLaSemana;
    }

    public Turno getTurno() {
        return turno;
    }

    public boolean isMediaGuardia() {
        return mediaGuardia;
    }
}
