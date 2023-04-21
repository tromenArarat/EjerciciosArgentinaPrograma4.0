/*
Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Ejercicios;

import Entidades.MesSecreto;
import Servicios.MeServicio;
import java.util.Scanner;


public class Ex1_MesSecreto {


    public static void main(String[] args) {
        
       

        MeServicio fletero = new MeServicio();
        MesSecreto juego = new MesSecreto();
        fletero.rellenarMeses(juego);
        fletero.setMesSecreto(juego);
        
        System.out.println(juego.getMesSecreto());
        
        String confirmacionSalida = "si";
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Jugar");
            System.out.println("2 - Salir");
            int rta = sc.nextInt();
            switch(rta){
                case 1:
                    System.out.println("¿Cuál es el mes secreto?");
                    if(juego.getMesSecreto().equals(sc.next())){
                        System.out.println("Acertaste");
                    }else{
                        System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                    }
                    break;
                case 2:
                    System.out.println("¿Está seguro de que desea salir?");
                    confirmacionSalida = sc.next();
            }
        }while(confirmacionSalida.equals("si"));
    }
    
}
