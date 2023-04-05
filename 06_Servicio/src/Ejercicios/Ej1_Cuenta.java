/*
CUESTIONES A REVISAR

- Los métodos de retiro y retiro rápido no frenan en 0.

 */
package Ejercicios;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Ej1_Cuenta {

    public static void main(String[] args) {
        
// Instancio la clase CuentaBancariaServicio. Le asigo el nombre "fontanero".
        
        CuentaBancariaServicio fontanero = new CuentaBancariaServicio();
        
        // Creo un Menú 
        
        Scanner sc = new Scanner(System.in);
        
        
        //  Con el método crearCuenta() de la clase fontanero instancio la clase CuentaBancaria. 
        //  Le asigno el nombre "libretaDeVerdulero".
        CuentaBancaria libretaDeVerdulero = fontanero.crearCuenta();
        
        String confirmacionSalida = "no";
        
        do{
            System.out.println("OPCIONES");
            System.out.println("1- Ingresar depósito");
            System.out.println("2- Retirar billete");
            System.out.println("3- Retirar ya");
            System.out.println("4- Consultar saldo");
            System.out.println("5- Datos cuenta");
            System.out.println("6- Salir");
        
        int rta = sc.nextInt();
            switch(rta){
            case 1:
                //  Llamo el método ingresar() de la clase fontanero 
                fontanero.ingresar(libretaDeVerdulero);
                break;
            case 2:
                //  Llamo el método retirar() 
                fontanero.retirar(libretaDeVerdulero);
                break;
            case 3:
               fontanero.extraccionRapida(libretaDeVerdulero);
               break;
            case 4:
                fontanero.consultarSaldo(libretaDeVerdulero);
                break;
            case 5:
                System.out.println(fontanero.consultarDatos(libretaDeVerdulero));
                break;
            case 6:
                System.out.println("¿Seguro de que desea salir? (si/no)");
                confirmacionSalida = sc.next();
                break;
        }
        }while(confirmacionSalida.equals("no"));
        


        /*
        -----------------------------PRUEBA 1----COMPLETADA------------------------------
        // Instancio la clase CuentaBancariaServicio. Le asigo el nombre "fontanero".
        
        CuentaBancariaServicio fontanero = new CuentaBancariaServicio();
        
        //  Con el método crearCuenta() de la clase fontanero instancio la clase CuentaBancaria. 
        //  Le asigno el nombre "libretaDeVerdulero".
        
        CuentaBancaria libretaDeVerdulero = fontanero.crearCuenta();
                
                // Duplico la creación de objetos para chequear que estén funcionando ambos de manera
                // autónoma.
                
                CuentaBancaria libretaDeVerdulero2 = fontanero.crearCuenta();
        
        //  Llamo el método ingresar() de la clase fontanero y le paso como argumento(?) el objeto
        //  libretaDeVerdulero
        
        fontanero.ingresar(libretaDeVerdulero);
                
                fontanero.ingresar(libretaDeVerdulero2);
        
        
        //  Imprimo para chequear que la función ingresar() haya actualizado el valor del atributo
        //  saldoActual de la clase CuentaBancaria en los dos casos.
        
        System.out.println(libretaDeVerdulero.getSaldoActual());
        
                System.out.println(libretaDeVerdulero2.getSaldoActual());
        */
    }
    
}
