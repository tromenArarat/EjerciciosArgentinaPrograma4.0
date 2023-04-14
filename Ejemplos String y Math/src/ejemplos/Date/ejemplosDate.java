/*
Date() Constructor que inicializa la fecha en el
milisegundo más cercano a la fecha del
sistema.

Date(int dia, int mes, int año) Constructor que inicializa la fecha
sumándole 1900 al año.

after(Date fecha2Յ Retorna verdadero si la fecha está después
de la fecha del parámetro

after(Date fecha2Յ Retorna verdadero si la fecha está después
de la fecha del parámetro

compareTo(Date fecha) Compara la fecha con la del parámetro.
Retorna 0 si son iguales, entero negativo si
el primer número es menor o entero positivo
si el primer número es mayor.

equals(Object obj) Compara el Date con el objeto del
parámetro. Devuelve true si son iguales y false si no.

getDay() Retorna el valor del día de la semana de la
fecha. Ejemplo: si es lunes devuelve 0,
martes 1, miércoles 2, jueves 3, viernes 4,
sábado 5 y domingo 6.

getDate() Retorna el número del día de la fecha.

getMonth() Retorna el mes de la fecha.

getYear() Retorna el año de la fecha.

getTime() Retorna la fecha en milisegundos a partir del
“epoch”.

setDate(int dia) Asigna un día a la fecha.

setMonth(int mes) Asigna un mes a la fecha.

setYear(int anio) Asigna un año a la fecha.

setTime(long time) Asigna la fecha en milisegundos a partir del
“epoch”.

toString() Retorna la fecha en una cadena de
caracteres.

 */
package ejemplos.Date;

import java.util.Date;


public class ejemplosDate {

    public static void main(String[] args) {
       
        System.out.println("Genera la fecha actual");
        Date fechaActual = new Date();

        System.out.println(fechaActual);

        System.out.println("------------------------------------------------------");
        System.out.println("Genera la fecha segun los valores en el constructor");
        Date fechaX = new Date(1990 - 1900, 10, 1); // Se le resta 1900 para que la fecha quede bien

        System.out.println(fechaX);

        System.out.println("------------------------------------------------------");
        System.out.println("After: ");
        // Comprueba si la fecha pasada es posterior a la actual
        System.out.println("¿ La fecha está despues de la fecha actual ? " + fechaActual.after(fechaX));

        System.out.println("------------------------------------------------------");
        System.out.println("Before: ");
        System.out.println("¿ La fecha está antes de la fecha actual ? " + fechaX.before(fechaActual));
/*
        Compara la fecha con la del parámetro. Retorna 0 si son iguales, entero negativo si
       el primer número es menor o entero positivo
      si el primer número es may
        */
     
        System.out.println("------------------------------------------------------");
        System.out.println("CompareTo: ");
        System.out.println("La fecha 1990-10-1 comparado con la fecha actual"
                + " para saber si son iguales dio un resultado de " + fechaX.compareTo(fechaActual));

        System.out.println("------------------------------------------------------");
        System.out.println("Equals: ");
        System.out.println("La fecha 1990-10-1 comparado con la fecha actual"
                + "/ Resultado: " + fechaX.equals(fechaActual));

        System.out.println("------------------------------------------------------");
        System.out.println("Getters: ");
        System.out.println("El dia de la fecha actual es: " + fechaActual.getDate()
                + "el mes de la fecha actual es: " + fechaActual.getMonth()
                + "el año de la fecha actual es: " + fechaActual.getYear());

        System.out.println("La fecha es: " + fechaActual.getTime());
        
        System.out.println("------------------------------------------------------");
        System.out.println("Setters: ");
        
        Date fechaNueva = new Date();
        
        fechaNueva.setDate(10); // Seteamos el dia
        fechaNueva.setMonth(5); // Seteamos el mes
        fechaNueva.setYear(2021); // Seteamos el anio
        
        System.out.println("------------------------------------------------------");
        System.out.println("ToString: ");
        
        String fechaCadena = fechaActual.toString();
        
        System.out.println("La fecha como cadena quedó: " + fechaCadena);
    }
    
}
