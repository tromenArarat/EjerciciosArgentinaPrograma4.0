/*

 */
package Ejercicios;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

public class Ej2_ParDeNumeros {

    public static void main(String[] args) {
        ParDeNumerosService mecanico = new ParDeNumerosService();
        ParDeNumeros numPar = new ParDeNumeros();
        mecanico.mostrarValores(numPar);
        
        System.out.println(mecanico.calcularPotencia(numPar));
        System.out.println(mecanico.calcularRaiz(numPar));
        
        
    }
    
}
