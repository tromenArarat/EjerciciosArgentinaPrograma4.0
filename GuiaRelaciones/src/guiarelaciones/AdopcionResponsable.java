/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guiarelaciones;

import Entidades.Cuidadorx;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class AdopcionResponsable {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Cuidadorx x = new Cuidadorx();
        
        Perro perro1 = new Perro("PotitoCagado","delCerro",5,15);
        Perro perro2 = new Perro("Purrán","delBarrio",7,19);
        ArrayList<Perro> ropes = new ArrayList();
        ropes.add(perro1);
        ropes.add(perro2);
       
            
            
            String confirmacionSalida = "no";
            do{
                System.out.println("-----------------------------------------------");
                System.out.println("Bienvenido al mercado virtual de mascotas (MVM)");
                System.out.println("-----------------------------------------------");
                System.out.println("VER PERROS DISPONIBLES   ------->  Presione |1|");
                System.out.println("ADOPTAR ALGUNO           ------->  Presione |2|");
                System.out.println("SALIR                    ------->  Presione |3|");
            
            int rta = sc.nextInt();
                switch(rta){
                    case 1:
                        for (Perro rope : ropes) {
                            System.out.println(rope.getNombre()+" "+rope.getRaza()+" "+rope.getKg()+" kg. "+rope.getEdad()+" años.");
                        }
                        break;
                    case 2:
                        System.out.println("Disculpame, pero ¿cómo te llamás?");
                        String nombre = sc.next();
                        System.out.println("Sí, claro, ¿y tu apellido?");
                        String apellido = sc.next();
                        System.out.println("¿Cuántos años tenés?");
                        int edad = sc.nextInt();
                        System.out.println("Permitime tu DNI");
                        int dni = sc.nextInt();
                        System.out.println("¿Qué perro querés?");
                        System.out.println(ropes.get(0).getNombre()+" presione |1|");
                        System.out.println(ropes.get(1).getNombre()+" presione |2|");
                        int opcion = sc.nextInt();
                        if(opcion == 1){
                            x = new Cuidadorx(nombre,apellido,edad,dni,ropes.get(0));
                        }else{
                            x = new Cuidadorx(nombre,apellido,edad,dni,ropes.get(1));
                        }
                        System.out.println(x.getApellido()+" más vale que te hagas cargo de "+x.getRope().getNombre());
                        break;
                    case 3:
                        System.out.println("¿Seguro de que desea salir? si/no");
                        String confirmacion = sc.next();
                        break;
                }
            }while(confirmacionSalida.equalsIgnoreCase("no"));
                        
    }
    
}
