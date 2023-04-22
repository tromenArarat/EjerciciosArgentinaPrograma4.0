package Servicios;

import Entidades.AdivinaPalabra;
import java.util.Scanner;

public class AdivinaPalabraServicios {
    
     private Scanner sc = new Scanner(System.in);
    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de
    jugadas máxima. Con la palabra del usuario, pone la longitud de la
    palabra, como la longitud del vector. Después ingresa la palabra en el
    vector, letra por letra, quedando cada letra de la palabra en un índice
    del vector. Y también, guarda la cantidad de jugadas máximas y el
    valor que ingresó el usuario.
    */
    
    public void crearJuego(AdivinaPalabra juego){
        System.out.println("Palabra a adivinar:");
        String palabraAadivinar = sc.next();
        
        String[] palabra = new String[palabraAadivinar.length()];
        // Arrays.fill(arreglo, int desde, int hasta, variable)
        
        for (int i = 0; i < palabra.length; i++) {
//            Arrays.fill(palabra, 0, palabra.length-1, palabraOculta.substring(i, i+1));
            palabra[i]=palabraAadivinar.substring(i,(i+1));
        }
        juego.setPalabraOculta(palabra);
        
        System.out.println("Límite de intentos:");
        int limite = sc.nextInt();
        
        juego.setLimiteIntentos(limite);
        
    }
    
    /*
    Método longitud(): muestra la longitud de la palabra que se debe
    encontrar. Nota: buscar como se usa el vector.length.
    */
    
    public void longitud(AdivinaPalabra juego){
        System.out.println(juego.palabraOculta.length);
    }

    /*
    Método buscar(letra): este método recibe una letra dada por el
    usuario y busca si la letra ingresada es parte de la palabra o no.
    
    OJO QUE FALTA ESTE
    También informará si la letra estaba YA ADIVINADA o no
    */
    
    public void buscar(String letra, AdivinaPalabra juego){
        int contador = 0;
        int perdidas = 0;
        
        for (int i = 0; i < juego.getPalabraOculta().length; i++) {
            if(letra.equals(juego.getPalabraOculta()[i])){
              contador++;
              juego.setLetrasEncontradas(juego.getLetrasEncontradas()+1);
                }
            if(!letra.equals(juego.getPalabraOculta()[i])){
              perdidas++;    
            }
        }
        
        if(perdidas==juego.getPalabraOculta().length){
            System.out.println("Mensaje: La letra no se encuentra en la palabra");
        }else if(contador==1){
            System.out.println("Mensaje: La letra se encuentra en la palabra una vez");
        }else if(contador>1){
            System.out.println("Mensaje: La letra se encuentra en la palabra más de una vez");
        }    
    }
    /*
    Método encontradas(letra): que reciba una letra ingresada por el
    usuario y muestre cuántas letras han sido encontradas y cuántas le
    faltan. Este método además deberá devolver true si la letra estaba y
    false si la letra no estaba, ya que, cada vez que se busque una letra
    que no esté, se le restará uno a sus oportunidades.
    */
    
    public boolean encontradas(String letra,AdivinaPalabra juego){
        boolean resultado = false;
        int faltantes = juego.getPalabraOculta().length - juego.getLetrasEncontradas();
        
        for (int i = 0; i < juego.getPalabraOculta().length; i++) {
           if(letra.equals(juego.getPalabraOculta()[i])){
            faltantes = juego.palabraOculta.length-1;
            resultado = true;
               }else{
                juego.setLimiteIntentos(juego.getLimiteIntentos()-1);
                resultado = false;
        }
        }
        System.out.println("Número de letras (encontradas, faltantes):"+"("+juego.getLetrasEncontradas()+", "+faltantes+")");
        
        return resultado;
    }
    
    /*
    Método intentos(): para mostrar cuántas oportunidades le queda al
    jugador.
    */
    
    public void intentos(AdivinaPalabra juego){
        System.out.println("Número de oportunidades restantes: "+juego.getLimiteIntentos());
    }
    
    /*
    Método juego(): el método juego se encargará de llamar todos los
    métodos previamente mencionados e informará cuando el usuario
    descubra toda la palabra o se quede sin intentos. Este método se
    llamará en el main.
    */
    // JUEGO pide letra La pasa a encontradas(letra) que la pasa BUSCAR(letra,palabra[])
    public void juego(){
        AdivinaPalabra juego = new AdivinaPalabra();
        
        crearJuego(juego); 
        do{
            System.out.println("Ingrese una letra:");
            String letra = sc.next();
        
            System.out.print("Longitud de la palabra: ");
            longitud(juego);
            buscar(letra,juego);
            encontradas(letra,juego);
        }while(juego.getLimiteIntentos()>0 || juego.getLetrasEncontradas()==juego.getPalabraOculta().length);
            
        if(juego.letrasEncontradas==juego.palabraOculta.length){
            System.out.print("Muy bien! Adivinaste todas las letras de la palabra: ");
            for (int i = 0; i < juego.palabraOculta.length; i++) {
                    System.out.print(juego.palabraOculta[i]);
            }
        }else{
              System.out.println("Mensaje: Lo sentimos, no hay más oportunidades.");
            }
    }
    
}
