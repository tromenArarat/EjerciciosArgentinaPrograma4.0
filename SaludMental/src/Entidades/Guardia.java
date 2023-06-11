
package Entidades;

import java.util.Comparator;

public class Guardia {
    private Fecha fecha;
    private Turno turno;

    public Guardia(Fecha fecha, Turno turno) {
        this.fecha = fecha;
        this.turno = turno;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Turno getTurno() {
        return turno;
    }

    
    //Comparator
    public static Comparator<Guardia> ordenarPorNumDia = new Comparator<Guardia>(){
        @Override
        public int compare(Guardia g1,Guardia g2){
            Integer guardia1 = g1.getFecha().getNum();
            Integer guardia2 = g2.getFecha().getNum();
            return guardia2.compareTo(guardia1);
        }
    };
    
}
