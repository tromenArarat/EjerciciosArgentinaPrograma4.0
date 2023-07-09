/*
Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package Entidades;

import java.util.Comparator;

public class Hotel5Estrellas extends Hotel4Estrellas {
    
    private int salonesConferencia;
    private int suites;
    private int limosinas;
    private Integer precioHab = calcularPrecio();

    public Hotel5Estrellas(int salonesConferencia, int suites, int limosinas, char gimnasio, String restaurante, int sillas, int cantHabitaciones, int cantCamas, int pisos, String nombre, String direccion, String localidad, String encargado) {
        super(gimnasio, restaurante, sillas, cantHabitaciones, cantCamas, pisos, nombre, direccion, localidad, encargado);
        this.salonesConferencia = salonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Integer getPrecioHab() {
        return precioHab;
    }
    
    

    /*
    Valor agregado por las limosinas:
        • $15 por la cantidad de limosinas del hotel
    */

    @Override
    public int calcularPrecio() {
        int suma = super.calcularPrecio();
        int valorLimusina = 15 * limosinas;
        suma += valorLimusina;
        return suma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
       public static Comparator<Hotel5Estrellas> porPrecio = new Comparator<Hotel5Estrellas>(){
       @Override
       public int  compare(Hotel5Estrellas uno, Hotel5Estrellas otro){
           return otro.getPrecioHab().compareTo(uno.getPrecioHab());
       }
   };
    
}
