
package Entidad;

import java.util.Scanner;

public class Empleado {

    // Atributos
    private String nombre;
    private double salario;
    private int edad;
    private String aumento;
    
    //Constructores

    public Empleado(String nombre, int salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }
    
    //Getter y Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Métodos
    
    public String calcular_aumento(){
        double aumentox;
        if(edad<30){
            this.aumento = "5%";
            aumentox = 0.05;
        }else{
            this.aumento = "10%";
            aumentox = 0.1;
        }
    return "El aumento es: "+aumento+", lo que equivale a "+"\n"+aumentox*salario+" en la moneda miserable con la que te pago";
}
    
    public void crear_empleado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre:");
        this.nombre = sc.next();
        System.out.println("Edad:");
        this.edad = sc.nextInt();
        System.out.println("Salario:");
        this.salario = sc.nextInt();
    
}

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + ", aumento=" + aumento + '}';
    }
    
   
    
}
