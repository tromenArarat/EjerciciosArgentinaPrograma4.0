/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.

Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
package guarderiabarcos;

import Entidades.Alquiler;
import Entidades.Amotor;
import Entidades.Barco;
import Entidades.Cliente;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.util.Scanner;

public class GuarderiaBarcos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        boolean out = true;
        LocalDate ya = LocalDate.now();
        LocalDate devolucion;
        
        do{
        System.out.println("Bienvenido, elegí la opción");
        System.out.println("1)- Alquilar");
        System.out.println("2)- Salir");
        
        int rta = sc.nextInt();
        
        if(rta==1){
            System.out.println("Nombre:");
            String nombre = sc.next();
            
            System.out.println("DNI:");
            int dni = sc.nextInt();
            Cliente senior = new Cliente(nombre,dni);
            
            System.out.println("Barco");
            System.out.println("1) común");
            System.out.println("2) yate");
            System.out.println("3) a motor");
            System.out.println("4) velero");
            int rtax = sc.nextInt();
            
            String rtaY;
            int rtaZ;
            int rtaQ;
            int rtaR;
            int rtaJ;
            
            switch(rtax){
                case 1:
                    System.out.println("Matricula");
                    rtaY = sc.next();
                    System.out.println("Eslora");
                    int rtaW = sc.nextInt();
                    System.out.println("Año de fabricación");
                    rtaZ = sc.nextInt();
                    Barco bote = new Barco(rtaY,rtaW,rtaZ);
                    
                    System.out.println("¿Por cuántos días lo vas a dejar?");
                    rtaZ = sc.nextInt();
                    
                    devolucion = ya.plusDays(rtaZ);
                   
                    //Random para posAmarre
                    
                    Alquiler rentada = new Alquiler(senior,ya,devolucion,4,bote,"G",rtaW,rtaZ);
                    
                    System.out.println("El alquiler te va a costar: "+ rentada.calcularAlquiler());
                    
                    
                    break;
                case 2:
                    System.out.println("Matricula");
                    rtaY = sc.next();
                    System.out.println("Eslora");
                    rtaZ = sc.nextInt();
                    System.out.println("Año de fabricación");
                    rtaQ = sc.nextInt();
                    Barco bote2 = new Barco(rtaY, rtaZ, rtaQ);
                    System.out.println("CV:");
                    rtaR = sc.nextInt();
                    System.out.println("Número de camarotes:");
                    rtaJ = sc.nextInt();
                    
                    System.out.println("¿Por cuántos días lo vas a dejar?");
                    rtaZ = sc.nextInt();
                    
                    devolucion = ya.plusDays(rtaZ);
                    
                    Yate botecin = new Yate(rtaR, rtaJ, senior, ya, devolucion, 3, bote2, rtaY, rtaZ, rtaQ);
                    
                    Alquiler rentada2 = new Alquiler(senior,ya,devolucion,3,bote2,rtaY,rtaZ,rtaQ);
                    
                    System.out.println("El alquiler te va a costar: "+ botecin.calcularAlquiler());
                                      
                                                          
                    break;
                case 3:
                    System.out.println("Matricula");
                    rtaY = sc.next();
                    System.out.println("Eslora");
                    rtaQ = sc.nextInt();
                    System.out.println("Eslora");
                    rtaZ = sc.nextInt();
                    System.out.println("CV:");
                    rtaJ = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Matricula");
                    rtaY = sc.next();
                    System.out.println("Eslora");
                    rtaZ = sc.nextInt();
                    System.out.println("Eslora");
                    rtaQ = sc.nextInt();
                    System.out.println("Número de mástiles:");
                    rtaJ = sc.nextInt();
                    
                    System.out.println("¿Por cuántos días lo vas a dejar?");
                    rtaZ = sc.nextInt();
                    
                    LocalDate devo = ya.plusDays(rtaZ);
                   
                    //Random para posAmarre
                    
                    break;
            }
        }
        
        }while(out);

    }
    
}
