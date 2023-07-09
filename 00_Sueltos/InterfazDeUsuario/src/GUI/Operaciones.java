
package GUI;


public class Operaciones {
    
    public boolean result;
    
   public String esP(boolean p){
        String resultado;
        if(p){
            resultado = "Verdadero";
        }else{
            resultado = "Falso";
        }
        return resultado;
    }
   
   public String esQ(boolean q){
        String resultado;
        if(q){
            resultado = "Verdadero";
        }else{
            resultado = "Falso";
        }
        return resultado;
    }
    
    public String noP(boolean p){
        String resultado;
        if(!p){
            resultado = "Verdadero";
        }else{
            resultado = "Falso";
        }
        return resultado;
    }
    public String noQ(boolean q){
        String resultado;
        if(!q){
            resultado = "Verdadero";
        }else{
            resultado = "Falso";
        }
        return resultado;
    }
    public String conjuncion(boolean p, boolean q){
        String resultado;
        if(p&q){
            resultado = "Verdadero";
        }else{
            resultado = "Falso";
        }
        return resultado;
    }
    public String disyuncion(boolean p, boolean q){
        String resultado;
        if(p||q){
            resultado = "Verdadero";
        }else{
            resultado = "Falso";
        }
        return resultado;
    }
    
    public String condicional(boolean p, boolean q){
        String resultado;
        if(!p||q){
            resultado = "Verdadero";
        }else{
            resultado = "Falso";
        }
        return resultado;
    }
    public String bicondicional(boolean p, boolean q){
        String resultado;
        if((!p||q)&(!q||p)){
            resultado = "Verdadero";
        }else{
            resultado = "Falso";
        }
        return resultado;
    }
    public String disyExcl(boolean p, boolean q){
        String resultado;
        if(!((!p||q)&(!q||p))){
            resultado = "Verdadero";
        }else{
            resultado = "Falso";
        }
        return resultado;
    }
}
