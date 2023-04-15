/*

 */
package Servicios;

import Entidades.ParDeNumeros;

/**
 
 */
public class ParDeNumerosService {
    /*
    Método mostrarValores que muestra cuáles son los dos números
    guardados.
    */
    
    public void mostrarValores(ParDeNumeros num){
        System.out.println(num.getInteger1());
        System.out.println(num.getInteger2());
    }
    
    /*
    Método devolverMayor para retornar cuál de los dos atributos tiene
    el mayor valor
    */
    
    public double devolveMayor(ParDeNumeros num){
        double numMayor = Math.max(num.getInteger1(), num.getInteger2());
        return numMayor;
    }
    
    /*
    Método calcularPotencia para calcular la potencia del mayor valor de
    la clase elevado al menor número. Previamente se deben redondear
    ambos valores.
    */
    
    public double calcularPotencia(ParDeNumeros num){
        double numMayor = Math.max(Math.round(num.getInteger1()), Math.round(num.getInteger2()));
        double numMenor = Math.min(Math.round(num.getInteger1()), Math.round(num.getInteger2()));
        double potencia = Math.pow(numMayor, numMenor);
        return potencia;
    }
    
    /*
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los
    dos valores. Antes de calcular la raíz cuadrada se debe obtener el
    valor absoluto del número.
    */
    public double calcularRaiz(ParDeNumeros num){
        double numMenor = Math.min(num.getInteger1(), num.getInteger2());
        double numAbs = Math.abs(numMenor);
        double raiz = Math.sqrt(numAbs);
        return raiz;
    }
    
    
}
