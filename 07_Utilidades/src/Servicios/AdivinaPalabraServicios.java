package Servicios;

import Entidades.AdivinaPalabra;
import java.util.Arrays;
import java.util.Scanner;

public class AdivinaPalabraServicios {
    
    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de
    jugadas máxima. Con la palabra del usuario, pone la longitud de la
    palabra, como la longitud del vector. Después ingresa la palabra en el
    vector, letra por letra, quedando cada letra de la palabra en un índice
    del vector. Y también, guarda la cantidad de jugadas máximas y el
    valor que ingresó el usuario.
    */
    
    private Scanner sc = new Scanner(System.in);
    
    public void crearJuego(AdivinaPalabra juego){
        System.out.println("Palabra a adivinar:");
        String palabraOculta = sc.next();
        
        System.out.println("Límite de intentos:");
        int limite = sc.nextInt();
        
        juego.setLimiteIntentos(limite);
        
        String[] palabra = new String[palabraOculta.length()];
        // Arrays.fill(arreglo, int desde, int hasta, variable)
        
        for (int i = 0; i < palabra.length; i++) {
            Arrays.fill(palabra, 0, palabra.length-1, palabraOculta.substring(i, i+1));
//            while(i<palabra.length){
//                palabra[i]=palabraOculta.substring(i,(i+1));
//            }
        }
        
        juego.setPalabraOculta(palabra);
        
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
    También informará si la letra estaba o no
    */
    
    public String buscarLetra(AdivinaPalabra juego){
        String resultado = "";
        System.out.println("Ingrese una letra:");
        String letra = sc.next();
        
        System.out.print("Longitud de la palabra: ");
        longitud(juego);
        
        for (int i = 0; i < juego.palabraOculta.length; i++) {
            if(letra.equals(juego.palabraOculta[i])){
            resultado = "Mensaje: La letra pertenece a la palabra";
            }else{
         resultado = "Mensaje: La letra no se encuentra en la palabra";
        }
        }
        return resultado;
    }
    
    /*
    Método encontradas(letra): que reciba una letra ingresada por el
    usuario y muestre cuantas letras han sido encontradas y cuántas le
    faltan. Este método además deberá devolver true si la letra estaba y
    false si la letra no estaba, ya que, cada vez que se busque una letra
    que no esté, se le restará uno a sus oportunidades.
    */
    
    public void encontradas(AdivinaPalabra juego){
        int faltantes = juego.palabraOculta.length;
        if(buscarLetra(juego).equals("Mensaje: La letra pertenece a la palabra")){
            faltantes--;
            juego.setLetrasEncontradas(+1);
        }else{
            juego.setLimiteIntentos(-1);
        }
        
        System.out.println("Número de letras (encontradas, faltantes):"+"("+juego.getLetrasEncontradas()+", "+faltantes);
        
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
    
    public void juego(){
        
        AdivinaPalabra juego = new AdivinaPalabra();
        do{
        crearJuego(juego);    
        buscarLetra(juego);
        encontradas(juego);
        intentos(juego);
        if(juego.letrasEncontradas==juego.palabraOculta.length){
            System.out.print("Muy bien! Adivinaste todas las letras de la palabra: ");
            for (int i = 0; i < juego.palabraOculta.length; i++) {
                    System.out.print(juego.palabraOculta[i]);
            }
        }
        }while(juego.getLimiteIntentos()!=0);
        System.out.println("Mensaje: Lo sentimos, no hay más oportunidades.");
        
        
        
    }
    
}
