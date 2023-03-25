/*
 Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: 

tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDEՅ, y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. 

Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals()
 */
package Estructurasdecontrol;

import java.util.Scanner;

public class Ej7_RS232 {

    public static void main(String[] args) {
        
        
        
        Scanner sc;
        sc = new Scanner(System.in).useDelimiter("\n");
        
        int correctos=0;
        int incorrectos=0;
        
        String secuencia = "";
        
        do{
        
            System.out.println("Ingrese secuencia:");
            secuencia = sc.next();
//            System.out.println("Longitud cadena:" + secuencia.length() + '\n' + "Primer caracter: " + secuencia.substring(0,1) + '\n' + "Último caracter: " + secuencia.substring(4,5));
        
        if(secuencia.length()==5 && "X".equals(secuencia.substring(0,1))&& "O".equals(secuencia.substring(4,5))){
            correctos++;
           }else{
            incorrectos++;
                   }
//            System.out.println("Correctas:"+correctos);
//            System.out.println("Incorrectas:"+incorrectos);
                
        }while(!"&&&&&".equals(secuencia));
        
        System.out.println("Cantidad de lecturas correctas: "+correctos);
        System.out.println("Cantidad de lecturas incorrectas: "+incorrectos);
        
    }
    
}
