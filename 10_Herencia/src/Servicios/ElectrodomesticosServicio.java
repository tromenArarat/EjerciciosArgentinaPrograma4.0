package Servicios;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.Scanner;

public class ElectrodomesticosServicio {
    
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    /*
        Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta.
        Si no es correcta usará la letra F por defecto. Este método se debe invocar al crear el
        objeto y no será visible.
    */
    public char comprobarConsumoEnergetico(char letra){
        char result;
        if(letra == 'A'||letra == 'B'||letra == 'C'||letra == 'D'||letra == 'E'||letra == 'F'){
            result = letra;
        } else {
            result = 'F';
        }
        return result;
    }
  
    /*
        Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
        usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
        blanco, negro, rojo, azul y gris. 
    
        No importa si el nombre está en mayúsculas o en minúsculas. Este método se invocará al 
        crear el objeto y no será visible.
    */
    
    public String comprobarColor(String color){
        String result;
        if(color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris")){
            result = color;
        } else {
            result = "blanco";
        }
        return result;
    }
    
    /*
        Metodo crearElectrodomestico(): le pide la información al usuario y llena el
        electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
        precio se le da un valor base de $1000.
    */
    public Electrodomesticos crearElectrodomestico(){
       
        System.out.println("-- COLORES disponible --");
        System.out.println("--      BLANCO        --");
        System.out.println("--       NEGRO        --");
        System.out.println("--        ROJO        --");
        System.out.println("--        AZUL        --");
        System.out.println("--        GRIS        --");
        String opcion = sc.next();
        
        System.out.println(" ");
        
        System.out.println("-- CONSUMO ENERGÉTICO --");
        System.out.println("--          A         --");
        System.out.println("--          B         --");
        System.out.println("--          C         --");
        System.out.println("--          D         --");
        System.out.println("--          E         --");
        
        String opc = sc.next();
        
        System.out.println("");
        
        System.out.println("--        PESO        --");       
        int peso = sc.nextInt();
        
        return new Electrodomesticos(1000,comprobarColor(opcion),comprobarConsumoEnergetico(opc.charAt(0)),peso);
        
    }
    
    /*
    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.
    */
    
    public Lavadora crearLavadora(){
        Electrodomesticos electrolux = crearElectrodomestico();     
        System.out.println("--         CARGA      --");
        System.out.println("--      > 30 kg (1)   --");
        System.out.println("--      < 31 kg (2)   --");
        int opx = sc.nextInt();
        Lavadora electroluxLavadora = new Lavadora(electrolux.getPrecio(),electrolux.getColor(),electrolux.getConsumo(),electrolux.getPeso(),opx);
        return electroluxLavadora;
    }
    
    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor.
    */
    public Televisor crearTelevisor(){
        Electrodomesticos electrolux = crearElectrodomestico();
        System.out.println("--      RESOLUCION      --");
        System.out.println("--  > 40 pulgadas (1)   --");
        System.out.println("--  < 41 pulgadas (2)   --");
        int resol = sc.nextInt();
        System.out.println("--          TDT         --");
        System.out.println("--          Sí (true)   --");
        System.out.println("--          No (false)  --");
        boolean tdtx = sc.nextBoolean();
        Televisor philips = new Televisor(electrolux.getPrecio(),electrolux.getColor(),electrolux.getConsumo(),electrolux.getPeso(),resol,tdtx);
        return philips;
        
    }
    
   
   
}
