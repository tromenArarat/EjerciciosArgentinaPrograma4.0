/*
 Ejercicio 1 Guía Utilidades
 */
package Ejercicios;

import Entidades.Cadena;
import Servicios.CadenaServicios;

public class Ej1_EjecucionPrincipal {

    public static void main(String[] args) {
        
        CadenaServicios gomero = new CadenaServicios();
        
        Cadena crashDummie = new Cadena("ubicuidad");
      
        int vocales = gomero.mostrarVocales(crashDummie);
        System.out.println(vocales);
        
        String invertida = gomero.invertirFrase(crashDummie);
        System.out.println(invertida);
        
        System.out.println(gomero.vecesRepetido(crashDummie));
        
        System.out.println(gomero.compararLongitud(crashDummie, "empaquetar"));
        
        System.out.println(gomero.unirFrases(crashDummie, ": estar al mismo tiempo en varios lugares"));
        
        System.out.println(gomero.critoMensaje(crashDummie, "¬"));
        
        System.out.println(gomero.contiene(crashDummie, "b"));

        
    }
    
}
