/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:

 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicios {
    // Método getDiscriminante(): devuelve el valor del discriminante (double). 
    // El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    
    private Scanner sc = new Scanner(System.in);

    public double getDiscriminante(Raices raiz){
        double discriminante = (Math.pow(raiz.getB(), 2))-(4*raiz.getA()*raiz.getC());
        return discriminante;
    }
    
    // Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
    // para que esto ocurra, el discriminante debe ser mayor que 0. 
    // Hice una corrección respecto al original que decía "mayor o igual que 0"
     public boolean tieneRaices(Raices raiz){
         boolean buleano;
         if(getDiscriminante(raiz)> 0){
            buleano = true;
         }else{
            buleano = false;
         }
         return buleano;
                 
     }
     
     // Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
     // para que esto ocurra, el discriminante debe ser igual que 0.
     
    public boolean tieneRaiz(Raices raiz){
        boolean buleano;
         if(getDiscriminante(raiz)==0){
            buleano = true;
         }else{
            buleano = false;
         }
         return buleano;
    }
    
     //Método obtenerRaices(): llama a tieneRaices() y si devolvió true, imprime las 2 posibles soluciones
    
    public void obtenerRaices(Raices raiz){
        double x1;
        double x2;
        double acX4;
        double bAlcubo;
        if(tieneRaices(raiz)==true){
            bAlcubo = Math.pow(raiz.getB(),2);
            acX4 = 4 * (raiz.getA()) * (raiz.getC());
            x1 = (-1*(raiz.getB()) + (Math.sqrt(bAlcubo-acX4)))/2;
            x2 = (-1*(raiz.getB()) - (Math.sqrt(bAlcubo-acX4)))/2;
            System.out.println("x1 ="+ x1);
            System.out.println("x2 ="+ x2);
        }
        
    }
    
    // Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
    // Es en el caso en que se tenga una única solución posible.

    public void obtenerRaiz(Raices raiz){ 
        double x1;
        double acX4;
        double bAlcubo;
        if(tieneRaiz(raiz)==true){
            bAlcubo = Math.pow(raiz.getB(),2);
            acX4 = 4 * (raiz.getA()) * (raiz.getC());
            x1 = (-1*(raiz.getB()) + (Math.sqrt(bAlcubo-acX4)))/2;
            System.out.println("x1 ="+ x1);
        }
    }
    // Método calcular(): este método llamara tieneRaices() y a tieneRaiz(), y mostrara por pantalla 
    // las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
    // según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrara un mensaje.

    public void calcular(Raices raiz){
        
        if(tieneRaices(raiz)==true){
            System.out.println("La ecuación tiene dos soluciones posibles");
            obtenerRaices(raiz);
        }else if(tieneRaiz(raiz)==true){
            System.out.println("La ecuación tiene una solución posible");
            obtenerRaiz(raiz);
        }else{
            System.out.println("No tiene solución");
        }
    }
    
    // Método para crear ecuación
    
    public Raices crearEcuacion(){
        System.out.println("Valor de a:");
        int a = sc.nextInt();
        System.out.println("Valor de b:");
        int b = sc.nextInt();
        System.out.println("Valor de c:");
        int c = sc.nextInt();
        return new Raices(a,b,c);
    }

    
    }

