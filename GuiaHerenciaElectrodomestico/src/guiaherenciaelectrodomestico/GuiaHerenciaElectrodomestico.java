/*
Finalmente, en el main debemos realizar lo siguiente:

Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.

*/
package guiaherenciaelectrodomestico;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.ElectrodomesticosServicio;

public class GuiaHerenciaElectrodomestico {

    public static void main(String[] args) {

        ElectrodomesticosServicio coco = new ElectrodomesticosServicio();
        
        Lavadora electrolux = coco.crearLavadora();
        
        Televisor philips = coco.crearTelevisor();
        
        System.out.println("Está todo muy caro. El tele sería: $" + philips.precioFinal());
        
        System.out.println("y el lavarropas: $" +electrolux.precioFinal());
                
        
        
    }
    
}
