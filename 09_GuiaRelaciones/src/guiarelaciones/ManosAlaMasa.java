
package guiarelaciones;

import Entidades.Dni;
import Entidades.Equipo;
import Entidades.Jugador;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ManosAlaMasa {

    public static void main(String[] args) {
        
        /*
        EJERCICIO PERSONA
        Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
        objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
        acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
        */
        
        char letra = 'a';
        int num = 31903453;
        Dni d = new Dni(letra,num);
        Persona uno = new Persona();
        uno.setDni(d);
    
        System.out.println((uno.getDni().getSerie())+""+(uno.getDni().getNum()));
        
        /*
        EJERCICIO JUGADOR
        Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
        y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
        esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
        */
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Equipo galacticos = new Equipo();
        
        ArrayList<Jugador> aveer = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre:");
            String nombre = sc.next();
            System.out.println("Apellido:");
            String apellido = sc.next();
            System.out.println("Posicion:");
            String posicion = sc.next();
            System.out.println("Casaca:");
            int casaca = sc.nextInt();
            
            aveer.add(new Jugador(nombre,apellido,posicion,casaca));
        }
            System.out.println("Equipo:");
            String eq = sc.next();
            galacticos.setNombre(eq);
            galacticos.setJugadores(aveer);
            System.out.println("El primer jugador de la lista:");
            System.out.println(galacticos.getJugadores().get(0).getApellido());
            System.out.println("El último jugador de la lista:");
            System.out.println(galacticos.getJugadores().get(4).getApellido());
       
        
        }
        }
