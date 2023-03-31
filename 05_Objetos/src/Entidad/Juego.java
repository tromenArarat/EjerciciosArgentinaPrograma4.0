
package Entidad;

import java.util.Scanner;

public class Juego {

    //  Atributos de la clase Juego
    private int num;
    private String primerJugador = "primer jugador";
    private String segundoJugador = "segundo jugador";
    private int puntajeJ1 = 0;
    private int puntajeJ2 = 0;
    
    
    // Constructores de la clase Juego
    
        // Constructor vacío °|° Alt+Insert - Enter
    public Juego() {
    }
        // Constructor cargado °|° Alt+Insert - Espacio - Enter
    public Juego(int num) {
        this.num = num;
    }
    
// Crear un método "iniciar_juego" que permita a dos jugadores 
// jugar un juego de adivinanza de números
   
    public void iniciar_juego(){
    //  El primer jugador elige un número y el segundo jugador intenta adivinarlo.
        String confirmacionDeSalida = "no";
        int contadorRonda = 2;
        int numA = 5;
        Scanner sc = new Scanner(System.in);
        do{
            if(contadorRonda%2==0){
                System.out.println("Eh, vos, "+primerJugador+", ingresá un número de dos dígitos:");
                num = sc.nextInt();
                System.out.println("Eh, vos, "+segundoJugador+", intentá adivinarlo:");
                numA = sc.nextInt();
            }else{
                System.out.println("Eh, vos, "+segundoJugador+", ingresá un número de dos dígitos:");
                num = sc.nextInt();
                System.out.println("Eh, vos, "+primerJugador+", intentá adivinarlo:");
                numA = sc.nextInt();
            }
            
            int intentos = 1;
            String ayuda = "";
            // El segundo jugador tiene un número limitado de intentos y recibe una pista
            // de "más alto" o "más bajo" después de cada intento.
                                    // El juego termina cuando el segundo jugador adivina el número 
                                    // o se queda sin intentos.
                while(numA!=num && intentos<5){
                    if(numA<num){
                        ayuda = "Más alto.";
                    }else{
                        ayuda = "Más bajo.";
                    }
                    
                    System.out.println(ayuda+" Te quedan "+(5-intentos)+" oportunidades");
                    numA = sc.nextInt();
                    intentos++;
                }
               
            // Registra el número de intentos necesarios para adivinar el número y el
            // número de veces que cada jugador ha ganado.
           if(intentos==5){
               System.out.println("No hubo caso."
               +'\n'+"Tuviste un total de "+intentos+" oportunidades."
               );
           }else if(numA==num && intentos==1){
               System.out.println("Acertaste en un solo intento. Hoy es tu día :D"
               );
           }else if(numA==num){
               System.out.println("Acertaste."
               +'\n'+"Tuviste un total de "+intentos+" oportunidades ;)"
               );
           }
                
                
                    // y el número de veces que cada jugador ha ganado.
                    if(contadorRonda%2==0 && num==numA){
                        puntajeJ2++;
                    }else if(contadorRonda%2!=0 && num==numA){
                        puntajeJ1++;
                    }else if(contadorRonda%2==0 && num!=numA){
                        puntajeJ1++;
                    }else if(contadorRonda%2!=0 && num!=numA){
                        puntajeJ2++;
                    }
                    
                    System.out.println("Así las cosas:"
                    +'\n'+primerJugador+" = "+puntajeJ1
                    +'\n'+segundoJugador+" = "+puntajeJ2);
                
                    System.out.println("");
                
                contadorRonda++;
                
            System.out.println("¿Seguir jugando? (si/no)");
            String rta = sc.next();
            
            switch(rta){
                case "si":
                    continue;
                case "no":
                    System.out.println("Se perderá el puntaje acumulado"
                    +'\n'+"¿Está seguro de que desea salir? (si/no)");
                    confirmacionDeSalida = sc.next();
            }
        }while(confirmacionDeSalida.equals("no"));
    


    
        
    }
    
}
