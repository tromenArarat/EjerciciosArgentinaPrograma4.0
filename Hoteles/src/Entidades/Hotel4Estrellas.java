/*
Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package Entidades;

import java.util.Comparator;

public class Hotel4Estrellas extends Hotel {
 
    private char gimnasio;
    private String restaurante;
    private int sillas;
    private Integer precioHab = calcularPrecio();

    public Hotel4Estrellas(char gimnasio, String restaurante, int sillas, int cantHabitaciones, int cantCamas, int pisos, String nombre, String direccion, String localidad, String encargado) {
        super(cantHabitaciones, cantCamas, pisos, nombre, direccion, localidad, encargado);
        this.gimnasio = gimnasio;
        this.restaurante = restaurante;
        this.sillas = sillas;
    }

    public Integer getPrecioHab() {
        return precioHab;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    
    /*
    Valor agregado por el restaurante:
        • $10 si la capacidad del restaurante es de menos de 30 personas.
        • $30 si está entre 30 y 50 personas.
        • $50 si es mayor de 50.
    
    Valor agregado por el gimnasio:
        • $50 si el tipo del gimnasio es A.
        • $30 si el tipo del gimnasio es B.
    */

    @Override
    public int calcularPrecio() {
        int suma;
        int precioBase = 50;
        int precioCapacidad = cantCamas;
        int valorRestaurante = 0;
        if(sillas<30){
            valorRestaurante=10;
        }else if(sillas>30&&sillas<50){
            valorRestaurante=30;
        }else if(sillas>50){
            valorRestaurante=50;
        }
        int gimnasiox = 0;
        if(gimnasio=='A'){
            gimnasiox = 30;
        }else if(gimnasio=='B'){
            gimnasiox = 50;
        }
        suma = precioBase+precioCapacidad+valorRestaurante+gimnasiox;
        return suma;
    }
    
   public static Comparator<Hotel4Estrellas> porPrecio = new Comparator<Hotel4Estrellas>(){
       @Override
       public int  compare(Hotel4Estrellas uno, Hotel4Estrellas otro){
           return otro.getPrecioHab().compareTo(uno.getPrecioHab());
       }
   };

}
