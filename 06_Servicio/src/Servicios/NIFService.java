/*
En NIFService se dispondrá de los siguientes métodos:
    
    b)  Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
        letra que le corresponderá. Una vez calculado, le asigna la letra que
        le corresponde según

    c)  Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
        guion y la letra en mayúscula; por ejemplo: 00395469՞FՅ.

La letra correspondiente al dígito verificador se calculará a traves de un
método que funciona de la siguiente manera: Para calcular la letra se
toma el resto de dividir el número de DNI por 23 (el resultado debe ser
un número entre 0 y 22). 

// MODIFIQUÉ ESTO EN LA SOLUCIÓN
El método debe buscar en un array (vector) de caracteres la posición que 
corresponda al resto de la división para obtener la letra correspondiente.


 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFService {
    
    private Scanner sc = new Scanner(System.in);
    
    public NIF crearNif(){
        System.out.println("DNI: ");
        int dni = sc.nextInt();
        int resto = dni % 23;
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        String letraNIF = letra.charAt(resto)+"";
        return new NIF(dni,letraNIF);
    }
    
    public void mostrar(NIF nif){
        System.out.println(nif.getDni()+"-"+nif.getLetra());
    }
    
    
}
