
package guiaherencia;

public class Gato extends Animal {
    
    @Override
    public void hacerRuido(){
        System.out.println("miauu");
    }
    
    @Override
     public int caminar(){
         int num = 6;
         return num;
     }
}
