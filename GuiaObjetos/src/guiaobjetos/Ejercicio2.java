/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia ՄArea=〖
π*radio〗^2Յ.
e) Método perimetro(): para calcular el perímetro
ՄPerimetro=2*π*radio)
 */
package guiaobjetos;

import Entidad.Circunferencia;
import java.util.Scanner;

public class Ejercicio2 {

      public static void main(String[] args) {

    
    // Instancio el objeto Circunferencia
    Circunferencia circulito = new Circunferencia(0); 
    
    // Aplico los 3 métodos e imprimo área y perímetro
          circulito.crearCircunferencia();
          System.out.println("Área: "+ circulito.area());
          System.out.println("Perímetro: "+circulito.perimetro());
    }

}
