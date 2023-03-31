/*
Para ejecutar JFugue en Java, necesitas seguir los siguientes pasos:

Descarga e instala la biblioteca JFugue en tu entorno de desarrollo Java. 
Puedes descargar la última versión de JFugue en el sitio web oficial de 
JFugue: https://www.jfugue.org/download.html.

Agrega la biblioteca JFugue a tu proyecto Java. 
Para hacerlo, abre tu proyecto Java en tu entorno de desarrollo Java y 
haz clic con el botón derecho del ratón en el nombre del proyecto en 
el panel del explorador de proyectos. A continuación, selecciona la 
opción "Propiedades" y luego la pestaña "Librerías". 
Ahora, haz clic en el botón "Agregar librería" y selecciona la 
biblioteca JFugue que acabas de descargar e instalar.
 */
package ejercicios;

import org.jfugue.player.Player;

public class Musiquita {

    public static void main(String[] args) {
        Player player = new Player();
        
        //  C E D C E D C
        //  E F G
        //  C E D C E D C
        //  D E C
        for (int i = 0; i < 5; i++) {
            player.play("C E D C");
            
        }
        
                
        System.out.println("Sonó balada del trasnochado");
        
    }
    
}
