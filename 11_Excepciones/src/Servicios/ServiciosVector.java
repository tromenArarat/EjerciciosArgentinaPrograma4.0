
package Servicios;

import java.util.Scanner;

public class ServiciosVector {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public String[] crearVector(){
        String[] supl = new String[7];
        for (int i = 0; i < 9; i++) {
           supl[i]= sc.next();
            }
        return supl;
    }
    
    
}
