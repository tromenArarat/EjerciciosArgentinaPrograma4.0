
/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
*/

package Entidades;


public class Hotel extends Alojamiento{
    
    protected int cantHabitaciones;
    protected int cantCamas;
    protected int pisos;
    protected int precioHab = calcularPrecio();

    public Hotel(int cantHabitaciones, int cantCamas, int pisos, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.pisos = pisos;
    }
    
    /*
    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
    agregado por gimnasio) + (valor agregado por limosinas).
    */
    public int calcularPrecio(){
        int precioBase = 50;
        int precioCapacidad = cantCamas;
        return precioBase+precioCapacidad;
    }
    
}
