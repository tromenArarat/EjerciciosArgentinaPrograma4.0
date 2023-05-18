package Entidades;

    public class Persona {
    
        private String nombre;
        private String apellido;
        private Dni documento;

    public Persona() {
    }
        
    public Dni getDni(){
        return documento;
    }

    public void setDni(Dni d) {
        this.documento = d;
    }
    
    
    
}

