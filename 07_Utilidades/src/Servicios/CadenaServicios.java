/*
Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;


public class CadenaServicios {
    
    private Scanner sc = new Scanner(System.in);
    
    /*
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales
    que tiene la frase ingresada.
    */
    
    public int mostrarVocales(Cadena frase){
        int vocales = 0;
        for (int i = frase.longitud-1; i >= 0; i--) {
            if(frase.getFrase().substring(i,i+1).equals("a")
            || frase.getFrase().substring(i,i+1).equals("e")
            || frase.getFrase().substring(i,i+1).equals("i")  
            || frase.getFrase().substring(i,i+1).equals("o")
            || frase.getFrase().substring(i,i+1).equals("u")){
            vocales++;
                }
        }
        return vocales;
    }
    
    /*
    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
    por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
    asac"
    */
     public String invertirFrase(Cadena frase){
        String fraseInvertida = "";
        String letra = "a";
        for (int i = frase.longitud-1; i >= 0  ; i--) {
            letra = frase.getFrase().substring(i,i+1);
            fraseInvertida = fraseInvertida.concat(letra);      
           }
        return fraseInvertida;
    }
    
    /*
    Método vecesRepetido¿¿¿¿¿¿(String letra)?????, 
    recibirá un carácter ingresado por el usuario y 
    contabilizará cuántas veces se repite el carácter en la
    frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
    veces.
     */
     
     public int vecesRepetido(Cadena frase){
         
         int repeticiones = 0;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Ingrese una letra");
         String buscada = sc.next();
         
         String letra = "";
         
         for (int i = frase.longitud-1; i >= 0  ; i--) {
            letra = frase.getFrase().substring(i,i+1);
            if(letra.equals(buscada)){
                repeticiones++;
            }
           }
         return repeticiones;
           }
     
     /*
    Método compararLongitud(String frase), deberá comparar la longitud
    de la frase que compone la clase con otra nueva frase ingresada por
    el usuario.
     */
     
     public boolean compararLongitud(Cadena frase, String frase2){
         if(frase.longitud == frase2.length()){
             return true;
         }else{
             return false;
         }
     }
     /*
     Método unirFrases(String frase), deberá unir la frase contenida en la
    clase Cadena con una nueva frase ingresada por el usuario y mostrar
    la frase resultante.
     */
     
     public String unirFrases(Cadena frase, String nuevaFrase){
         return frase.getFrase().concat(nuevaFrase);
     }
     
     /*
     Método reemplazar(String letra), deberá reemplazar todas las letras
    “a” que se encuentren en la frase, por algún otro carácter
    seleccionado por el usuario y mostrar la frase resultante.
     */
     
     public String critoMensaje(Cadena frase, String caracter){
         String letra = "";
         String criptoMensaje="";
         for (int i = 0; i < frase.longitud  ; i++) {
            letra = frase.getFrase().substring(i,i+1);
            if(letra.equals("a")){
                criptoMensaje = criptoMensaje.concat(caracter);
            }else{
                criptoMensaje = criptoMensaje.concat(letra);
            }
           }
         return criptoMensaje;
           }
     
     /*
     Método contiene(String letra), deberá comprobar si la frase contiene
    una letra que ingresa el usuario y devuelve verdadero si la contiene y
    falso si no.
     */
     public boolean contiene(Cadena frase, String letra){
         if(frase.getFrase().contains(letra)){
             return true;
         }return false;
     }
    }
     
    

