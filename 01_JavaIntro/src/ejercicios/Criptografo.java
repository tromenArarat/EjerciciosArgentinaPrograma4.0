package ejercicios;

import java.util.Scanner;

public class Criptografo {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese texto");
        String texto=leer.nextLine();
        
       
        System.out.println(cambiar(texto));
    }   
    
    public static String cambiar(String texto) {    
        
        int longitud=texto.length();
        String cambio="";
        for(int i=0;i<longitud;i++){
            
            String letra;
            letra=texto.substring(i, i+1);
            
            
            if(!letra.equals(".")){
            
                switch(letra){
                    case "a":
                        String a="@";
                        cambio=cambio.concat(a);
                        break;
                    case "e":
                        String e="#";
                        cambio=cambio.concat(e);
                        break;
                    case "i":
                        String ii="$";
                        cambio=cambio.concat(ii);
                        break;
                    case "o":
                        String o="%";
                        cambio=cambio.concat(o);
                        break;
                    case "u":
                        String u="*";
                        cambio=cambio.concat(u);
                        break;
                    default:
                        String l=letra;
                        cambio=cambio.concat(letra);
                        break;
                }
            }
            
        }
        return cambio;
    }    
}
