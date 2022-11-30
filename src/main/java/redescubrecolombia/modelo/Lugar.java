package redescubrecolombia.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Lugar {

    @Id @GeneratedValue
    Long id;
    



    private String origen;
    
    public void setOrigen(String value) {
       this.origen = value;
    }
    
    public String getOrigen() {
       return this.origen;
    }
    
    private String destino;
    
    public void setDestino(String value) {
       this.destino = value;
    }
    
    public String getDestino() {
       return this.destino;
    }
    
   @OneToOne 
   private Coordenada coordOrigen;

   @OneToOne 
   private Coordenada coordDestino;
    
    /**
     * <pre>
     *           0..*     Salida     1..1
     * Lugar ------------------------- Viaje
     *           lugar        &lt;       viaje
     * </pre>
     */
 

    @OneToOne
    private Viaje viaje;
    
    /**
     * <pre>
     *           0..*     Llegada     1..1
     * Lugar ------------------------- Viaje
     *           lugar1        &lt;       viaje1
     * </pre>
     */
    // private Viaje viaje1;
    
    // public void setViaje1(Viaje value) {
    //    this.viaje1 = value;
    // }
    
    // public Viaje getViaje1() {
    //    return this.viaje1;
    // }
    
    }
 
