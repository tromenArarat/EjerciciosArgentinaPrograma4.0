package ejemplos.string;

public class substring {

    public static void main(String[] args) {
        String socio = "N°:123";

        // Ejemplo 1: extraer una subcadena a partir del índice 2 y hasta el índice 7
        String sub2 = socio.substring(0, 2);
        System.out.println(sub2); // Salida: "N°"

        // Ejemplo 2: extraer una subcadena a partir del índice 3
        String sub1 = socio.substring(3);
        System.out.println(sub1); // Salida: "123"

    }
    
}
