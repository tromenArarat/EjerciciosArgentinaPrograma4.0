
package Entidades;

public enum Dia {
    LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;
    
    public Dia next() {
        // Get the ordinal value of the current enum constant
        int currentOrdinal = this.ordinal();
        
        // Calculate the next ordinal value
        int nextOrdinal = (currentOrdinal + 1) % values().length;
        
        // Retrieve the next enum constant using the next ordinal
        return values()[nextOrdinal];
    }
}
