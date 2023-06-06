/*
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles del más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package Servicios;

import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel4Estrellas;
import Entidades.Hotel5Estrellas;
import Entidades.Residencias;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class HotelesServicios {
    
    private ArrayList<Hotel4Estrellas> hotel = new ArrayList();
    private ArrayList<Hotel5Estrellas> hotelLujo = new ArrayList();
    private ArrayList<Camping> camping = new ArrayList();
    private ArrayList<Residencias> residencia = new ArrayList();
    
    
    public void crearHoteles(){
        hotel.add(new Hotel4Estrellas('A',"El lechón ciego",15,4,8,1,"Hotel Avenida","Los Olmos y Lamadrid","Chos Malal","Montoto"));
        hotel.add(new Hotel4Estrellas('A',"El ciervo congelado",14,6,5,3,"Hotel El Cruce de los Andes","Los Olmos 45","Tricao Malal","Mariano"));
    }
    
    public void crearHotelesLujo(){
        hotelLujo.add(new Hotel5Estrellas(4,5,6,'B',"La papa loca",50,80,3,256,"Hotel Los Tres Chiflados","Lamadrid 240","Belice","Mr. Jones"));
        hotelLujo.add(new Hotel5Estrellas(4,3,2,'A',"La comida de tu vieja",60,70,5,255,"Hotel A la Chucha","Lamadrid 238","Belice","Mr. Smith"));
    }
    
    public void crearCampings(){
        camping.add(new Camping(50,4,true,false,300,"Camping Municipal","Al fondo de la cuadra","Chos Malal","Colelo"));
        camping.add(new Camping(30,2,false,true,300,"Al sobre","Segurola y Habana","Miraflores","Don Diego"));
    }
    
    public void crearResidencias(){
        residencia.add(new Residencias(50, true, true, true, 400, "Residencial Celedonio", "Onésimo Leguizamón 503", "Neuquén", "Celedonio"));
        residencia.add(new Residencias(50, false, false, true, 500, "Residencial Colón de Génova", "s/n", "Neuquén", "Evaristo"));
    }
    
public void mostrarTodos(){
    System.out.println("Hoteles 4 estrellas:");
    for (Hotel4Estrellas e : hotel) {
        System.out.println(e.getNombre());
    }
    System.out.println("Hoteles 5 estrellas:");
    for (Hotel5Estrellas d : hotelLujo) {
        System.out.println(d.getNombre());
    }
    System.out.println("Campings:");
    for (Camping f : camping) {
        System.out.println(f.getNombre());
    }
    System.out.println("Residencias:");
    for (Residencias g : residencia) {
        System.out.println(g.getNombre());
    }
}     

public void mostrarHoteles(){
    Collections.sort(hotelLujo,Hotel5Estrellas.porPrecio);
    for (Hotel5Estrellas d : hotelLujo) {
        System.out.println(d.getNombre());
        System.out.println("Precio habitación: " +d.getPrecioHab());
    }
    Collections.sort(hotel,Hotel4Estrellas.porPrecio);
    for (Hotel4Estrellas e : hotel) {
        System.out.println(e.getNombre());
        System.out.println("Precio habitación: " +e.getPrecioHab());
    }
    }

public void mostrarCampingConPapeo(){
    int contador = 0;
    for (Camping a : camping) {
        if(a.isRestaurante()){
            System.out.println(a.getNombre());
        }else{
            contador++;
        }
    }
    if(contador==camping.size()){
        System.out.println("No se encontraron campings con papeo incluido.");
    }
}

public void mostrarResidenciasConDesc(){
    int contador = 0;
    for (Residencias b : residencia) {
        if(b.isDescGrem()){
            System.out.println(b.getNombre());
        }else{
            contador++;
        }
    }
    if(contador==residencia.size()){
        System.out.println("No se encontraron residencias con descuento gremial.");
    }
}

}
   

