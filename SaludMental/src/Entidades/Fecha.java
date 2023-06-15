
package Entidades;

public class Fecha {
    Dia dia;
    Mes mes;
    int año;
    int num;
    boolean feriado;
    //revisar
    Guardia guardiaDia;
    Guardia guardiaNoche;
    int semana;

    public Fecha(Dia dia, Mes mes, int año,int num,boolean feriado, int semana) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.num = num;
        this.feriado = feriado;
        this.semana = semana;
    }
    
    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }

    public Guardia getGuardiaDia() {
        return guardiaDia;
    }
    
    public Guardia getGuardiaNoche(){
        return guardiaNoche;
    }

    public void setGuardiaDia(Guardia guardiaDia) {
        this.guardiaDia = guardiaDia;
    }
    
    public void setGuardiaNoche(Guardia guardiaNoche) {
        this.guardiaNoche = guardiaNoche;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isFeriado() {
        return feriado;
    }

    public void setFeriado(boolean feriado) {
        this.feriado = feriado;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }
    
}
