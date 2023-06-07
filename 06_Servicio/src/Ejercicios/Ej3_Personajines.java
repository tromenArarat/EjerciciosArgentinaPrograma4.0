/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */
package Ejercicios;

import Entidades.Persona;
import Servicios.PersonaServicio;

/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.
*/

public class Ej3_Personajines {

    public static void main(String[] args) {
        PersonaServicio mecanico = new PersonaServicio();
        
        try{
        Persona p1 = null;
//        Persona p2 = mecanico.crearPersona();
//        Persona p3 = mecanico.crearPersona();
//        Persona p4 = mecanico.crearPersona();
        
        
        boolean[] esMayor = new boolean[4];
        esMayor[0] = mecanico.esMayorDeEdad(p1);
        
        
//        esMayor[1] = mecanico.esMayorDeEdad(p2);
//        esMayor[2] = mecanico.esMayorDeEdad(p3);
//        esMayor[3] = mecanico.esMayorDeEdad(p4);
        
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            if(esMayor[i]==true){
                contador++;
            }        
        }
        int promedioMayores = (100/4)*contador;
        int promedioMenores =  (100/4)*(4-contador);
        System.out.println("El promedio de mayores de edad es "+ promedioMayores);
        System.out.println("El promedio de menores de edad es "+ promedioMenores);
                
        double[] imc = new double[4];
        imc[0] = mecanico.indiceMasaCorporal(p1);
//        imc[1] = mecanico.indiceMasaCorporal(p2);
//        imc[2] = mecanico.indiceMasaCorporal(p3);
//        imc[3] = mecanico.indiceMasaCorporal(p4);
        
        int contador2 = 0;
        int contador3 = 0;
        for (int i = 0; i < 4; i++) {
            if(imc[i]==0){
                contador2++;
            }else if(imc[i]==-1){
                contador3++;
        }    
        }
        int promedioSobrepeso = (100/4)*(4-(contador2+contador3));
        int promedioSaludable = (100/4)*contador2;
        int promedioFlaquitos = (100/4)*contador3;
        
        System.out.println("El promedio de pesados es "+promedioSobrepeso);
        System.out.println("El promedio de normis es "+promedioSaludable);
        System.out.println("El promedio de flaquitos es "+promedioFlaquitos);
        
        }catch(Exception e){
            System.out.println("Estás creando una persona como nula");
        }
        
        
            
        }
        
        
    }
    
