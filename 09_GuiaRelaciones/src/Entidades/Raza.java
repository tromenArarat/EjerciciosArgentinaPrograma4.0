
package Entidades;

public enum Raza {
    
        CALLEJERO(1,"del Cerro"), BEAGLE(1,"del Barrio"), LABRADOR(1,"de la cuadra");
        
        private Integer tipo;
        private String descripcion;

    private Raza(Integer tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public Integer getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
        
        
    
}
