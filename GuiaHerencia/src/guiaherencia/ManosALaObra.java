/*
EJERCICIO ANIMAL
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. 

Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. 

Luego, en el main vamos a crear un ArrayList de animales y los siguientes animales
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */

/*
Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar
un objeto a partir de la interfaz

*/


package guiaherencia;

import java.time.LocalDate;
import java.util.ArrayList;


public class ManosALaObra implements Operaciones {
    
     @Override
        public int sumar(int num1,int num2){
            int suma = num1+num2;
            return suma;
        }
    
    public static void main(String[] args) {
       ArrayList<Animal> animales = new ArrayList();
       /*
       Animal es un método abstracto, por eso no podemos instanciarlo
       */
//       Animal a = new Animal();
       Animal b = new Perro();
       Animal c = new Gato();
       
//       animales.add(a);
       animales.add(b);
       animales.add(c);
       
        for (Animal animale : animales) {
            animale.hacerRuido();
        }
        
        int num1 = animales.get(0).caminar();
        int num2 = animales.get(1).caminar();
        
        ManosALaObra o = new ManosALaObra();
        int sumaO = o.sumar(num1, num2);
        
       
        System.out.println("La cantidad de pasos que dieron los animales es: "+ sumaO);
        
        LocalDate ahora = LocalDate.now();
        System.out.println(ahora);
        LocalDate otroDia = ahora.plusDays(10);
        System.out.println(otroDia);
        }
        
    }
    
    

