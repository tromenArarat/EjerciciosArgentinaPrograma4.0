/*
Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. 
 */
package Entidades;

public class Camping extends Extrahotelero {
    
    private int capMaxCarpas;
    private int banios;
    private boolean restaurante;

    public Camping(int capMaxCarpas, int banios, boolean restaurante, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, encargado);
        this.capMaxCarpas = capMaxCarpas;
        this.banios = banios;
        this.restaurante = restaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRestaurante() {
        return restaurante;
    }
    
    
}
