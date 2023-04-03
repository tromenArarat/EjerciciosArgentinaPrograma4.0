/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package ejercicios;

import Entidad.Rectang;
import Servicios.RectangServicios;

public class Ex7_Rectangulo {

    public static void main(String[] args) {
       RectangServicios service = new RectangServicios();
       Rectang rectangulo1 = service.crear_rectangulo();
       
       
        System.out.println("Área: "+service.crearArea(rectangulo1.getLado1(), rectangulo1.getLado2()));
       
    }
    
}
