/*

 */
package Servicios;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;
import java.util.ArrayList;

public class CineServicios {
    
    private Asiento[][] butaca = new Asiento[8][6];
    private ArrayList<Espectador> publico = new ArrayList();
    private Cine pelicula = new Cine();
    
    public Cine crearCine(){
       String peli = "MenInWhite";
       pelicula = new Cine(300,peli,60,15,"Spilimbergo");
       return pelicula;
    }
    
     public void crearSala(){
         for (int i = 0; i < 8; i++) {
            char letra = 'A';
            for (int j = 0; j < 6; j++) {
                butaca[i][j] = new Asiento(false,letra,(8-i));
                letra ++;
            }
        }
    }
    
    public void mostrarSala(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(butaca[i][j].toString());
            }
            System.out.println("");
        }
    }
    
        public void crearEspectadores(){
        for (int i = 0; i < 8; i++) {
            char letra = 'a';
            char letra2 = 'h';
            char letra3 = 'r';
            for (int j = 0; j < 48; j++) {
                String nombre = letra+"ono"+letra2+"dulu"+letra3;
                int edad = (int)(Math.random()*95+6);
                int dinero = (int)(Math.random()*2000+100);
                publico.add(new Espectador(nombre,edad,dinero));
                letra ++;
                letra2 ++;
                letra3 ++;
            }
        }
    }
    
    public void mostrarEspectadores(){
        for (Espectador espectador : publico) {
            System.out.println(espectador.getNombre());
        }
    }
    
    public void ubicarEspectador(){
        int fila = (int) (Math.random()*8);
        int columna = (int)(Math.random()*6);
        for (Espectador espectador : publico) {
            if(espectador.getDinero()>=pelicula.getPrecioEntrada()&espectador.getEdad()>=pelicula.getEdadMinima()&butaca[fila][columna].isOcupada()==false){
                espectador.setButaca(butaca[fila][columna]);
                butaca[fila][columna].setOcupada(true);
                continue;
            }else if(espectador.getDinero()>=pelicula.getPrecioEntrada()&espectador.getEdad()>=pelicula.getEdadMinima()&butaca[fila][columna].isOcupada()==true){
                for (Asiento[] asiento : butaca) {
                    for (Asiento butaca : asiento) {
                        if(butaca.isOcupada()==false){
                            espectador.setButaca(butaca);
                            butaca.setOcupada(true);
                           
                        }
                         break;
                    }
                }
                continue;
            }
        }
    }
            
}
