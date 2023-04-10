/*

 */
package Ejercicios;

import Entidades.NIF;
import Servicios.NIFService;

public class Ex2_NIF {

    public static void main(String[] args) {
       NIFService electricista = new NIFService();
       NIF persona1 = electricista.crearNif();
       electricista.mostrar(persona1);
       
    }
    
}
