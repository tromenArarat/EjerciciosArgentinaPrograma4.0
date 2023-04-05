
package Ejercicios;

import Entidades.Cafetera;
import Servicios.CafeteraServicios;

public class Ej2_Cafeteria {

    public static void main(String[] args) {
       CafeteraServicios plomero = new CafeteraServicios();
       Cafetera maquinaExpendedora = new Cafetera();
       
       plomero.llenarCafetera(maquinaExpendedora);
       
       System.out.println(maquinaExpendedora.getCantidadActual());
       
       plomero.servirTaza(maquinaExpendedora);
       
       System.out.println(maquinaExpendedora.getCantidadActual());
       
       plomero.llenarCafetera(maquinaExpendedora);
       
       System.out.println(maquinaExpendedora.getCantidadActual());
//       
       plomero.vaciarCafetera(maquinaExpendedora);
       
       System.out.println(maquinaExpendedora.getCantidadActual());
               
               
    }
    
}
