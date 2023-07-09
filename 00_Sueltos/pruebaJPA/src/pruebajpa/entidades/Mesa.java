
package pruebajpa.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private String id;
    private int cantSillas;

    public Mesa() {
    }

    public Mesa(String id, int cantSillas) {
        this.id = id;
        this.cantSillas = cantSillas;
    }

    public Mesa(int cantSillas) {
        this.cantSillas = cantSillas;
    }
    
    
    

    public int getCantSillas() {
        return cantSillas;
    }

    public void setCantSillas(int cantSillas) {
        this.cantSillas = cantSillas;
    }
        

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "pruebajpa.entidades.Mesa[ id=" + id + " ]";
    }
    
}
