/*
atributos: 
                        - posición actual (posición del tambor que se dispara, 
                            puede que esté LA VIDA o no) y 
                        - posición VIDA (la posición del tambor donde se encuentra LA VIDA). 

• llenarRevolver(): le pone los valores de posición actual y de posición DE LA VIDA. Los valores
    deben ser aleatorios.
    • darVida(): devuelve true si la posición DE LA VIDA coincide con la posición actual
    • siguienteDisparo(): cambia a la siguiente posición del tambor
    • toString(): muestra información del revolver (posición actual y donde está LA VIDA)
 */
package Entidades;

public class Revolver {
    
    private int posActual;
    private int posVida;
    
    public void llenarRevolver(){
        this.posActual = (int)(Math.random()*7+1);
        this.posVida = (int)(Math.random()*7+1);
    }
    
    public boolean darVida(){
        if(posVida==posActual){
            return true;
        }else{
            return false;
        }
    }
    
    public void siguienteDisparo(){
        if(posActual==7){
            this.posActual = 1;
        }else{
            this.posActual += 1;
        }
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosVida() {
        return posVida;
    }

    public void setPosVida(int posVida) {
        this.posVida = posVida;
    }

    
    
    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posVida=" + posVida + '}';
    }
    
   
}
