/*
Retorna la cadena en minúscula.
 */
package ejemplos.string;

public class toLowerCase {

    public static void main(String[] args) {
        String grito = "DALE, APURATE";
        String sosiego;
        sosiego = grito.toLowerCase();
        System.out.println(sosiego);
        
        String palabra = "acÚstico";
        String sinErrores;
        sinErrores = palabra.toLowerCase();
        System.out.println(sinErrores);
        
       }
    
}
