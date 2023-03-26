
package Entidad;

import java.util.Scanner;

public class Operacion {

    // Atributos
    private int num1,num2;
    // Constructores
    public Operacion(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public Operacion(){   
    }
    // Métodos Get y Set
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    // Método para crearOperacion()
    public void crearOperacion(){
        System.out.println("Número 1:");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        num1 = sc.nextInt();
        System.out.println("Número 2:");
        num2 = sc.nextInt();
    }
    // Método para sumar
    public int sumar(int num1, int num2){
        int suma = num1+num2;
        return suma;
    }
    // Método para restar
    public int restar(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }
    // Método multiplicar(): 
    public int multiplicar(int num1,int num2){
        
        // Chequea que no se esté multimplicando por cero
        if(num1==0 || num2==0){
            System.out.println("Estás intentando multiplicar por cero. El resultado es 0 (cero)");
            return 0;
        }else{
        int multiplicacion = num1*num2;
        return multiplicacion;
    }   
    }
    
    // Método dividir():
    public int dividir(int num1,int num2){
        
        // Chequea que no se esté dividiendo por cero
        if(num1==0 || num2==0){
            System.out.println("Error. Estás intentando dividir por cero.");
            return 0;
        }else{
        int division = num1/num2;
        return division;
    }   
    }
}

    

