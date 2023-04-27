/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

public class Persona {

    // Atributos
    private String nombre;
    private int edad;
    private Scanner sc = new Scanner(System.in);

    // Constructor vacío
    public Persona() {
    }
    
    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Metodo para cargar persona
    public void cargarPersona(){
        System.out.println("Nombre:");
        this.nombre = sc.next();
        System.out.println("Edad:");
        this.edad = sc.nextInt();
         
     }
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
