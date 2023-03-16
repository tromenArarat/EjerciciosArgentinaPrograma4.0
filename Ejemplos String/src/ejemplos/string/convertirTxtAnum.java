package ejemplos.string;

public class convertirTxtAnum {
    
    public static void main(String[] args) {
        String numCadena = "1";
        int numEntero = Integer.parseInt(numCadena);
        System.out.println(numEntero+5);
        
        int numEntero2 = (int) Integer.parseInt(numCadena);
        System.out.println(numEntero+6);
    }
    
}
