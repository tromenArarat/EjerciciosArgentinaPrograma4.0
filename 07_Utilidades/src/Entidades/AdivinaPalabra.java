/*
Crear una clase AdivinaPalabra, la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario. 
 */
package Entidades;

public class AdivinaPalabra {
    
    public String[] palabraOculta;
    
    public int letrasEncontradas;
    
    public int limiteIntentos;

    public AdivinaPalabra() {
    }

    public AdivinaPalabra(String[] palabraOculta, int letrasEncontradas, int limiteIntentos) {
        this.palabraOculta = palabraOculta;
        this.letrasEncontradas = letrasEncontradas;
        this.limiteIntentos = limiteIntentos;
    }
    
    // Esto no se está usando, es solo un ejemplo de usar el this
    // Constructor que pasa por defecto el valor de cero a letras encontradas
        public AdivinaPalabra(String[] palabraOculta, int limiteIntentos) {
        this(palabraOculta,0,limiteIntentos);
    }
    
    public String[] getPalabraOculta() {
        return palabraOculta;
    }

    public void setPalabraOculta(String[] marmota) {
        this.palabraOculta = marmota;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getLimiteIntentos() {
        return limiteIntentos;
    }

    public void setLimiteIntentos(int limiteIntentos) {
        this.limiteIntentos = limiteIntentos;
    }
    
    
    
}


   