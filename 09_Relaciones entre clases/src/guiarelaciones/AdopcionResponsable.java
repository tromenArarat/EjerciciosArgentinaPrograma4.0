/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar CON dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guiarelaciones;

/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. 

- Dos personas no pueden adoptar al mismo perro
- Si la persona eligió un perro que ya estaba adoptado, se le debe informar a la persona.

Una vez que la Persona elige, el Perro se le asigna. 

Al final deberemos mostrar todas las personas con sus respectivos perros.
*/

import Entidades.Cuidadorx;
import Entidades.Perro;
import Entidades.Raza;
import java.util.ArrayList;
import java.util.Scanner;

public class AdopcionResponsable {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<Cuidadorx> c = new ArrayList();
        
        Perro perro1 = new Perro("PotitoCagado",Raza.valueOf("del Cerro"),5,15);
        Perro perro2 = new Perro("Purrán",Raza.valueOf("de la cuadra"),7,19);
        ArrayList<Perro> ropes = new ArrayList();
        ropes.add(perro1);
        ropes.add(perro2);
       
            String confirmacionSalida = "no";
            do{
                System.out.println("-----------------------------------------------");
                System.out.println("Bienvenido al mercado virtual de mascotas (MVM)");
                System.out.println("-----------------------------------------------");
                System.out.println("VER PERROS DISPONIBLES   ------->  Presione |1|");
                System.out.println("INGRESAR DATOS           ------->  Presione |2|");
                System.out.println("ADOPTAR                  ------->  Presione |3|");
                System.out.println("SALIR                    ------->  Presione |4|");
            
            int rta = sc.nextInt();
                switch(rta){
                    case 1:
                        for (Perro rope : ropes) {
                            System.out.println(rope.getNombre()+" "+rope.getRaza()+" "+rope.getKg()+" kg. "+rope.getEdad()+" años.");
                        }
                        break;
                    case 2:
                        System.out.println("¿Cómo te llamás?");
                        String nombre = sc.next();
                        System.out.println("¿Y tu apellido?");
                        String apellido = sc.next();
                        System.out.println("¿Cuántos años tenés?");
                        int edad = sc.nextInt();
                        System.out.println("Permitime tu DNI");
                        int dni = sc.nextInt();
                        c.add(new Cuidadorx(nombre,apellido,edad,dni)); 
                        break;
                    case 3:
                        System.out.println("A ver, escribime las iniciales de tu nombre y de tu apellido todo junto, sin espacios");
                        String ini = sc.next();
                        for (int i = 0; i < c.size(); i++) {
                            if(ini.equals(c.get(i).getNombre().substring(0, 1)+""+c.get(i).getApellido().substring(0, 1))){
                                System.out.println("¿Qué perro querés?");
                                for (int j = 0; j < ropes.size(); j++) {
                                   System.out.println(ropes.get(j).getNombre()+" presione |"+(j+1)+"|");
                                } 
                                int opcion = sc.nextInt();
                                c.get(i).setRope(ropes.get(opcion-1));
                                ropes.remove(opcion-1);
                                System.out.println(c.get(i).getApellido()+" más vale que te hagas cargo de "+c.get(i).getRope().getNombre());
                                }
                            };
                        break;
                    case 4:
                        System.out.println("¿Seguro de que desea salir? si/no");
                        confirmacionSalida = sc.next();
                        break;
                }
            }while(confirmacionSalida.equalsIgnoreCase("no"));        
    }
}
