
package Entidades;

public class Asiento {
    
    private boolean ocupada;
    private char letra;
    private int numero;
    

    public Asiento() {
    }

    public Asiento(boolean ocupada, char letra, int numero) {
        this.ocupada = ocupada;
        this.letra = letra;
        this.numero = numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        String ocu = "";
        if(ocupada){
            ocu = "X";
        }else{
            ocu="";
        }
        
        return numero +" "+ letra +" "+ ocu + " |";
    }
    
    
           
}


