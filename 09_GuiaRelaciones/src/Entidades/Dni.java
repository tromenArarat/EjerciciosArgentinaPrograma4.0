package Entidades;
    public class Dni {
        
    private char serie;
    private int num;

    public Dni() {
    }

    public Dni(char serie, int num) {
        this.serie = serie;
        this.num = num;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
        
    
}
