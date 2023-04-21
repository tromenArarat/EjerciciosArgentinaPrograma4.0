/*
El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Servicios;

import Entidades.MesSecreto;
import java.util.Scanner;

public class MeServicio {
    
    private Scanner sc = new Scanner(System.in);

public void rellenarMeses(MesSecreto mes){
    
    String[] meses = new String[12];
    for (int i = 0; i < meses.length; i++) {
        System.out.println("Mes "+(i+1)+":");
        meses[i] = sc.next();
        mes.setMeses(meses);
    }
}

public void setMesSecreto(MesSecreto mes){
    mes.setMesSecreto(mes.getMeses()[9]);
}
    
}
