
package guiaherencia;

public class Perro extends Animal {
  
      @Override
    public void hacerRuido(){
        System.out.println("guauu");

}
 
     @Override
     public int caminar(){
         int num = 2;
         return num;
     }
    
}
