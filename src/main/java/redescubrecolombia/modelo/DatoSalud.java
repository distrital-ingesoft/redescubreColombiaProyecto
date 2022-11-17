package redescubrecolombia.modelo;


public class DatoSalud {
   private String fechaHora;
   
   private void setFechaHora(String value) {
      this.fechaHora = value;
   }
   
   private String getFechaHora() {
      return this.fechaHora;
   }
   
   private Integer pulso;
   
   private void setPulso(Integer value) {
      this.pulso = value;
   }
   
   private Integer getPulso() {
      return this.pulso;
   }
   
   private Integer cantOxigeno;
   
   private void setCantOxigeno(Integer value) {
      this.cantOxigeno = value;
   }
   
   private Integer getCantOxigeno() {
      return this.cantOxigeno;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * DatoSalud ------------------------- Viaje
    *           datoSalud        &lt;       viaje
    * </pre>
    */
   private Viaje viaje;
   
   public void setViaje(Viaje value) {
      this.viaje = value;
   }
   
   public Viaje getViaje() {
      return this.viaje;
   }
   
   }
