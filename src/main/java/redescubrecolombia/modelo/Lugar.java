package redescubrecolombia.modelo;


public class Lugar {
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
    
    private Coordenada coordOrigen;
    
    public void setCoordOrigen(Coordenada value) {
       this.coordOrigen = value;
    }
    
    public Coordenada getCoordOrigen() {
       return this.coordOrigen;
    }
    
    private Coordenada coordDestino;
    
    public void setCoordDestino(Coordenada value) {
       this.coordDestino = value;
    }
    
    public Coordenada getCoordDestino() {
       return this.coordDestino;
    }
    
    /**
     * <pre>
     *           0..*     Salida     1..1
     * Lugar ------------------------- Viaje
     *           lugar        &lt;       viaje
     * </pre>
     */
    private Viaje viaje;
    
    public void setViaje(Viaje value) {
       this.viaje = value;
    }
    
    public Viaje getViaje() {
       return this.viaje;
    }
    
    /**
     * <pre>
     *           0..*     Llegada     1..1
     * Lugar ------------------------- Viaje
     *           lugar1        &lt;       viaje1
     * </pre>
     */
    private Viaje viaje1;
    
    public void setViaje1(Viaje value) {
       this.viaje1 = value;
    }
    
    public Viaje getViaje1() {
       return this.viaje1;
    }
    
    }
 
