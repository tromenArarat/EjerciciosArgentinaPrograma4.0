/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
*/
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    
    //  Atributos
    
    public Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    //  a) Método para crear cuenta pidiéndole los datos al usuario.
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Número de cuenta:");
        int num = sc.nextInt();
        System.out.println("DNI del titular:");
        long dni = sc.nextLong();
        System.out.println("¿Cuál es el saldo de la cuenta?");
        double saldo = sc.nextDouble();
        return new CuentaBancaria(num,dni,saldo);
    };

    /*
        b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
        se le sumará al saldo actual.
    */
    
    public void ingresar(CuentaBancaria libreta){
        System.out.println("Monto a ingresar:");
        double monto = sc.nextDouble();
        libreta.setSaldoActual(libreta.getSaldoActual() + monto);
    }
     /*
        c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
        restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
        retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    */
    
    public void retirar(CuentaBancaria libreta){
        System.out.println("Monto a retirar:");
        double monto = sc.nextDouble();
        if(libreta.getSaldoActual()<monto){
            System.out.println("Su cuenta tenía un saldo de "+libreta.getSaldoActual()+ 
                    "\n"+"El retiro habilitado es de "+ libreta.getSaldoActual());
            libreta.setSaldoActual(0);
        }else{
            libreta.setSaldoActual(libreta.getSaldoActual() - monto);
        }
    }

    /*
        d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
        restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
        retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    */
        
    public void extraccionRapida(CuentaBancaria libreta){
        System.out.println("Monto a retirar:");
        double monto = sc.nextDouble();
        if(libreta.getSaldoActual()*0.2<monto){
            System.out.println("El monto ingresado supera el límite de la extracción rápida"+
                    "\n"+"El retiro habilitado es de "+libreta.getSaldoActual()*0.2);
            libreta.setSaldoActual(libreta.getSaldoActual()*0.8);
        }else{
            libreta.setSaldoActual(libreta.getSaldoActual()-monto);
        }
    }
    
    /*
        e) Método consultarSaldo: permitirá consultar el saldo disponible en la
        cuenta.
    */
    
    public void consultarSaldo(CuentaBancaria libreta){
        System.out.println("El saldo disponible es de "+libreta.getSaldoActual());
        
    }
   
    /*
        f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    */
    
    public CuentaBancaria consultarDatos(CuentaBancaria libreta){
        return libreta;
    }
  
    
}
// Explicación dudosa:
    // LAS CLASES pueden ser PARÁMETROS de los métodos, de esa manera puedo acceder 
    // a sus valores y modificarlos instanciando la clase Servicio desde el main.