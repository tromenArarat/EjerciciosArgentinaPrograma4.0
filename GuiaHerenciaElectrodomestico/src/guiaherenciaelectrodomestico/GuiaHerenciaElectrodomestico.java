/*
Finalmente, en el main debemos realizar lo siguiente:

Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.

Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.

Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. 

Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. 

Una vez hecho eso, también deberemos mostrar, la suma del precio de todos los Electrodomésticos. 

Por ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de 5000, 
el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.

*/
package guiaherenciaelectrodomestico;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.ElectrodomesticosServicio;
import java.util.ArrayList;

public class GuiaHerenciaElectrodomestico {

    public static void main(String[] args) {

        ElectrodomesticosServicio coco = new ElectrodomesticosServicio();
        
        ArrayList<Electrodomesticos> lista = new ArrayList();
        
        for (int i = 0; i < 4; i++) {
            Lavadora electrolux = coco.crearLavadora();
            Televisor philips = coco.crearTelevisor();
            lista.add(electrolux);
            lista.add(philips);
        }
        
        int suma=0;
        for (Electrodomesticos electrodomesticos : lista) {
            suma+=electrodomesticos.precioFinal();
            
        }
        
        System.out.println(suma);
                
        
        
    }
    
}
