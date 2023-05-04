/*
clase Ficha (de dominó) con su constructor y sus getters, con un toString() (que imprima el “seis-zero” como
 * “6:0|” y con un método llamado “Ficha girarFicha()” que gire la ficha (el “6:0|” pasaría a ser “0:6|”)Implementa también
 * el método “boolean esUnDoble()”. A) Ahora implementa con ArrayLists una clase que genere todas las fichas desde el doble 0
 * al doble MAX_NUM. Después, el programa, actuando como si fuera un robot jugando al solitario, empezará por tirar el doble
 * más grande e irá tirando fichas (las jugadas tienen que ser legales) hasta que haya tirado todas sus fichas (de su “mano”
 * a la “mesa) o ya no pueda tirar ninguna ficha más. Tu ejecución puede ser diferente de las de los ejemplos dependiendo de
 * cómo lo implementes.
 */
package Servicios;

import Entidades.Ficha;
import Entidades.UsuarioDomino;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ServiciosDomino {
    
    private ArrayList<Ficha> bolsa = new ArrayList();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    
    public void crearFichas(){
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                ArrayList<String> ficha = new ArrayList();
                ficha.add(i+":"+j);
                bolsa.add(new Ficha(ficha));
            }
        }
    }
    
    public UsuarioDomino crearUsuario(){
        System.out.println("¿Cómo es su nombre?");
        String nombre = sc.next();
        return new UsuarioDomino(nombre);
    }
     public UsuarioDomino crearMaquina(){
        String nombre = "CPU";
        return new UsuarioDomino(nombre);
    }
    
    public void mostrarFichas(){
        bolsa.forEach((fichine) -> System.out.println(fichine.getFicha().toString()));
    }
    
    public void desordenarFichas(){
        Collections.shuffle(bolsa);
    }
    
    public void iniciarJuego(){
        String confirmacionDeSalida = "no";
        int contadorRonda = 2;
        crearFichas();
        UsuarioDomino jugador1 = crearUsuario();
        UsuarioDomino CPU = crearMaquina();
        int rta = 0;
        System.out.println("---------- MENU ----------");
        System.out.println("1.Jugar");
        System.out.println("2.Salir");
        rta = sc.nextInt();
        if (rta == 1) {
            do {
                
                if (contadorRonda % 2 == 0) {
                    desordenarFichas();
                    tomarSiete(jugador1);
                    System.out.println(jugador1);
                    if (tieneDobleSeis(jugador1.getAtril())) {
                        for (int i = 0; i < jugador1.getAtril().size(); i++) {
                            if (jugador1.getAtril().equals("6:6")) {
                                jugador1.getAtril().remove();
                            }
                        }
                    } else {
                        System.out.println("Fin de turno: " + jugador1);
                        contadorRonda++;
                    }
                } else {
                    desordenarFichas();
                    tomarSiete(CPU);
                    if (tieneDobleSeis(CPU.getAtril())) {
                        for (int i = 0; i < CPU.getAtril().size(); i++) {
                            if (CPU.getAtril().equals("6:6")) {
                                CPU.getAtril().remove();
                            }
                        }
                    } else {
                        System.out.println("Fin de turno: " + CPU);
                        contadorRonda++;
                    }
                }
            } while (confirmacionDeSalida.equalsIgnoreCase("si") || confirmacionDeSalida.equalsIgnoreCase("sí"));

        } else if (rta == 2) {

            System.out.println("¿Seguro de que desea salir?");
            confirmacionDeSalida = sc.next();

        
    }
    }
    
    public boolean tieneDobleSeis(LinkedList atril){
        boolean dale = false;
        for (Object pieza : atril) {
            if(pieza.equals("6:6")){
                dale = true;
            }else 
                dale = false;
        }
        return dale;
    }
    
    public void tomarSiete(UsuarioDomino fidel){
    if(bolsa.size()>=7){
        System.out.println("Sus fichas son:");
        for (int i = 0; i < 7; i++) {
//            System.out.print(bolsa.get(i).toString()+ "|");
            fidel.getAtril().add(bolsa.get(i));
            bolsa.remove(i);
            System.out.print(fidel.getAtril().toString()+"");
        }
    }else{
        System.out.println("No hay más que "+bolsa.size()+" piezas disponibles.");   
    } 
    }
    
}
