/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. 

Por cada Alojamiento Extrahotelero se indica: 
- si es privado o no, 
- la cantidad de metros cuadrados que ocupa. 

 */
package Entidades;

public class Extrahotelero extends Alojamiento{
    
    protected boolean privado;
    protected int metrosCuadrados;

    public Extrahotelero(boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }
    
    
}
