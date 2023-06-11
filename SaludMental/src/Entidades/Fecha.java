
package Entidades;

public class Fecha {
    Dia dia;
    Mes mes;
    int año;
    int num;
    Guardia guardia;

    public Fecha(Dia dia, Mes mes, int año,int num) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.num = num;
    }
    
    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }

    public Guardia getGuardia() {
        return guardia;
    }

    public void setGuardia(Guardia guardia) {
        this.guardia = guardia;
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
    
}
