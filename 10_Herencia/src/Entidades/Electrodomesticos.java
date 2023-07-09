/*

Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.

Los constructores que se deben implementar son los siguientes:

• Un constructor vacío.

• Un constructor con todos los atributos pasados por parámetro.

Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.

*/
package Entidades;

public class Electrodomesticos {
    
    protected double precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    /*
        Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
        precio. Esta es la lista de precios:
    
                    LETRA   PRECIO
                    A       $1000
                    B       $800
                    C       $600
                    D       $500
                    E       $300
                    F       $100
    
                    PESO                PRECIO
                Entre 1 y 19 kg     $100
                Entre 20 y 49 kg    $500
                Entre 50 y 79 kg    $800
                Mayor que 80 kg     $1000
    */
    
    public double precioFinal(){
        double result = 100;
        
        double pesoP;
        if(peso<20){
            pesoP = 100;
        }else if(peso>19&peso<50){
            pesoP = 500;
        }else if(peso>49&peso<80){
            pesoP = 800;
        }else{
            pesoP = 1000;
        }
        
        if(consumo=='A'){
            
        result = 1000+precio+pesoP;
            
        }else if(consumo=='B'){
            result = 800+precio+pesoP;
        }else if(consumo=='C'){
            result = 600+precio+pesoP;
        }else if(consumo=='D'){
            result = 500+precio+pesoP;
        }else if(consumo=='E'){
            result = 300+precio+pesoP;
        }else if(consumo=='F'){
            result = 100+precio+pesoP;
        }
        
        return result;
       
    }
    
    
    
}
