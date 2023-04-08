/*
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b

 */
package Ejercicios;

import Servicios.RaicesServicios;

public class Ex1_Ecuacion2doGrado {

    public static void main(String[] args) {
        RaicesServicios carpintero = new RaicesServicios();
        
        carpintero.calcular(carpintero.crearEcuacion());
        
    }
    
}
