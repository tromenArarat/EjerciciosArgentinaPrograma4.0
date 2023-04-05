/*
 Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;


public class CafeteraServicios {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la
    //capacidad máxima.
    public void llenarCafetera(Cafetera maquina){
        maquina.setCantidadActual(maquina.getCapacidadMaxima());
        System.out.println("Cafetera llena. A servirse!");
    }
    /*
    Método servirTaza(int): se pide el tamaño de una taza vacía, el
    método recibe el tamaño de la taza y simula la acción de servir la
    taza con la capacidad indicada. Si la cantidad actual de café “no
    alcanza” para llenar la taza, se sirve lo que quede. El método le
    informará al usuario si se llenó o no la taza, y de no haberse llenado
    en cuanto quedó la taza.
    */
    public void servirTaza(Cafetera maquina){
        System.out.println("Tamaño taza:");
        int tamañoTaza = sc.nextInt();
        if(tamañoTaza>maquina.getCantidadActual()){
            System.out.println("Tomá este poquito de café, exactamente: "+maquina.getCantidadActual());
            maquina.setCantidadActual(0);
        }else{
            maquina.setCantidadActual(maquina.getCantidadActual()-tamañoTaza);
            System.out.println("Se llenó la taza exitosamente");
        }
    }
    
    /*
    Método vaciarCafetera(): pone la cantidad de café actual en cero.
    */
    public void vaciarCafetera(Cafetera maquina){
    maquina.setCantidadActual(0);
    }
    
    /*
    Método agregarCafe(int): se le pide al usuario una cantidad de café,
    el método lo recibe y se añade a la cafetera la cantidad de café
    indicada.
    */
    public void agregarCafe(Cafetera maquina){
        System.out.println("Cafe agregado:");
        int cafeAgregado = sc.nextInt();
        maquina.setCantidadActual(maquina.getCantidadActual()+cafeAgregado);
    }
    
}
