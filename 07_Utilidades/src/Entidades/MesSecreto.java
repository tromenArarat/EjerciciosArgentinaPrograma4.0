
package Entidades;
public class MesSecreto {

    private String[] meses = new String[12];
    
    private String mesSecreto = meses[9];

    public MesSecreto(String[] meses, String mesSecreto) {
    this.meses = meses;
    this.mesSecreto = mesSecreto;
    }

    public MesSecreto() {
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
    
    
    
}
