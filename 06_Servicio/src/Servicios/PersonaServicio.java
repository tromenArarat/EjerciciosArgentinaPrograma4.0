/*
 En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
c) Método calcularIMCՄՅր calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2ՅՅ. Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un ՞1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    //Atributos
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    //Método esMayorDeEdad():
    public boolean esMayorDeEdad(Persona vago){
        if(vago.getEdad()<18){
            return false;
        }else return true;
    }
    //Metodo crearPersona()
    public Persona crearPersona(){
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("Edad:");
        int edad = sc.nextInt();
        System.out.println("Sexo:");
        String sexo = "";
        while(!sexo.equalsIgnoreCase("m")&&!sexo.equalsIgnoreCase("h")&&!sexo.equalsIgnoreCase("x")){
            System.out.println("Ingrese 'm' para mujer 'h' para hombre 'x' para reservado");
            sexo = sc.next();
        }
        
        System.out.println("Peso");
        double peso = sc.nextDouble();
        System.out.println("Altura:");
        double altura = sc.nextDouble();
        System.out.println("¿Es feliz? (0 falso / 1 verdadero)");
        boolean estadoEmocional = sc.nextBoolean();
        return new Persona(nombre,edad,sexo,peso,altura,estadoEmocional);
    }
    //Método calcular Índice de Masa Corporal
    public double indiceMasaCorporal(Persona vago){
        double imc = vago.getPeso()/(Math.pow(vago.getAltura(),2));
        return imc;
    }
}
