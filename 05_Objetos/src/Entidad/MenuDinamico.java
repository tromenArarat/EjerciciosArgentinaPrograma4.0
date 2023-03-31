
package Entidad;

public class MenuDinamico {
    
    // Atributos
    private int opciones;
    
    // Constructores

    public MenuDinamico() {
    }

    public MenuDinamico(int opciones) {
        this.opciones = opciones;
    }


    public String imprimirMenu() {
        String opcion = "";
        for (int i = 0; i < opciones; i++) {
            opcion = "Opcion "+i+"\n";
        }
        return opcion;
    }


    
          
     
}
