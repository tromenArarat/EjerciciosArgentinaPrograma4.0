package Entidad;

import java.util.Scanner;

public class Menu {
    //Atributos
    Scanner entrada = new Scanner(System.in);
    Empleado empleado = new Empleado();
    private int opcion;
    
    //Constructores
    public Menu(){  
    }
    
    //Método
    public void mostrarMenu(){
        System.out.println("Bienvenido, elegí la opción");
        System.out.println("1)- Crear empleado");
        System.out.println("2)- Mostrar empleado");
        System.out.println("3)- Calcular aumento");
        System.out.println("0)- Salir");
        this.opcion = entrada.nextInt();
    }
    
    public void opcionMenu(){
        switch(this.opcion){
            case 1:{
                empleado.crear_empleado();
                mostrarMenu();
                opcionMenu();
                break;
            }
            case 2:{
                if (empleado.getNombre()!=null){
                    empleado.toString();
                }else{
                    System.out.println("Cree un empleado antes de pedir que se muestre.");
                }
               mostrarMenu();
               opcionMenu();
                break;
                
            }
            case 3:{
                if (empleado.getNombre()!=null){
                System.out.println("Tu salario es: ");
                System.out.println(empleado.calcular_aumento());
                }else{
                    System.out.println("Cree un empleado antes de pedir que se muestre el aumento.");
                    
            }
                mostrarMenu();
                opcionMenu();
                break;
            }
            case 0:{
                
            System.out.println("¿Está seguro que desea salir?");
            System.out.println("1)- Si");
            System.out.println("2)- No");
            opcion = entrada.nextInt();
            if(this.opcion == 2){
                mostrarMenu();
                opcionMenu();
            }
            break;
                }
                
            default: {
                System.out.println("Debe ingresar una opción correcta");
                mostrarMenu();
                opcionMenu();
                break;
            }
        }
                
            
                
        }
    }
