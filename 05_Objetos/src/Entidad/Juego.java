package Entidad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    //  Atributos de la clase Juego
    private int num;
    private String primerJugador = "jugador humano aleatorio";
    private String segundoJugador = "ordenador desordenado";
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
   
    public void iniciar_juego()throws InputMismatchException{
    //  El primer jugador elige un número y el segundo jugador intenta adivinarlo.
        String confirmacionDeSalida = "no";
        int contadorRonda = 2;
        int numA = 5;
        Scanner sc = new Scanner(System.in);
        int min = 10;
        int max = 99;
        do{
            if(contadorRonda%2==0){
                System.out.println("Turno: "+primerJugador+", ingresá un número de dos dígitos:");
                num = sc.nextInt();
                System.out.println("Turno: "+segundoJugador+", intentá adivinarlo:");
                numA = min + (int)(Math.random() * ((max - min) + 1));
                System.out.println("La máquina dijo "+numA);
            }else{
                System.out.println("Hola, "+primerJugador+" , a ver si adivinás este:");
                num = min + (int)(Math.random() * ((max - min) + 1));
                System.out.println("Turno: "+primerJugador+", intentá adivinarlo:");
                
                // Acá empieza el ejercio 3 de la Guía Excepciones
                try{
                    numA = sc.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("No es un número");
                }
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
                        System.out.println(numA);
                    }else{
                        ayuda = "Más bajo.";
                        System.out.println(numA);
                    }
                    
                    System.out.println(ayuda+" Te quedan "+(5-intentos)+" oportunidades");
                    
                    //Sumar a la máquina como jugador
                    //
                    if(ayuda.equals("Más bajo.") && contadorRonda%2==0){
                        max=numA;
                        numA = min + (int)(Math.random() * ((max - min) + 1));
                    }else{
                        min=numA;
                        numA = min + (int)(Math.random() * ((max - min) + 1));
                    }
                    
                    // Si juega el humano
                    if (contadorRonda % 2 != 0) {
                        
                        // Acá sigue el ejercio 3 de la Guía Excepciones
                        try {
                            numA = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println("No es un número");
                            numA = sc.nextInt();
                        }
                    }

                    intentos++;
                }
               
            // Registra el número de intentos necesarios para adivinar el número y el
            // número de veces que cada jugador ha ganado.
           if(intentos==5){
               System.out.println("No hubo caso."
               +'\n'+"Ningún acierto en "+intentos+" oportunidades."
               );
           }else if(numA==num && intentos==1){
               System.out.println("¡Acierto en uno!"
               );
           }else if(numA==num){
               System.out.println("Intuición a pleno."
               +'\n'+"Dio en el blanco después de "+intentos+" oportunidades ;)"
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