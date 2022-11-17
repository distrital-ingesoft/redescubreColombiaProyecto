package redescubrecolombia.modelo;


import java.util.Set;
import java.util.HashSet;

public class Viaje {
   private String origen;
   
   private void setOrigen(String value) {
      this.origen = value;
   }
   
   private String getOrigen() {
      return this.origen;
   }
   
   private String destino;
   
   private void setDestino(String value) {
      this.destino = value;
   }
   
   private String getDestino() {
      return this.destino;
   }

   private Coordenada coordOrigen;
   
   private void setCoordOrigen(Coordenada value) {
      this.coordOrigen = value;
   }
   
   private Coordenada getCoordOrigen() {
      return this.coordOrigen;
   }
   
   private Coordenada coordDestino;
   
   private void setCoordDestino(Coordenada value) {
      this.coordDestino = value;
   }
   
   private Coordenada getCoordDestino() {
      return this.coordDestino;
   }
   
   private String fechaHoraInicio;
   
   private void setFechaHoraInicio(String value) {
      this.fechaHoraInicio = value;
   }
   
   private String getFechaHoraInicio() {
      return this.fechaHoraInicio;
   }
   
   private String fechaHoraLlegada;
   
   private void setFechaHoraLlegada(String value) {
      this.fechaHoraLlegada = value;
   }
   
   private String getFechaHoraLlegada() {
      return this.fechaHoraLlegada;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * Viaje ------------------------- DatoSalud
    *           viaje        &gt;       datoSalud
    * </pre>
    */
   private Set<DatoSalud> datoSalud;
   
   public Set<DatoSalud> getDatoSalud() {
      if (this.datoSalud == null) {
         this.datoSalud = new HashSet<DatoSalud>();
      }
      return this.datoSalud;
   }
   
   /**
    * <pre>
    *           1..1     1..1
    * Viaje ------------------------> Usuario
    *           &lt;       usuario
    * </pre>
    */
   private Usuario usuario;
   
   public void setUsuario(Usuario value) {
      this.usuario = value;
   }
   
   public Usuario getUsuario() {
      return this.usuario;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * Viaje ------------------------- DatoDesplazamiento
    *           viaje        &gt;       datoDesaplazamiento
    * </pre>
    */
   private Set<DatoDesplazamiento> datoDesaplazamiento;
   
   public Set<DatoDesplazamiento> getDatoDesplazamiento() {
      if (this.datoDesaplazamiento == null) {
         this.datoDesaplazamiento = new HashSet<DatoDesplazamiento>();
      }
      return this.datoDesaplazamiento;
   }
   
   public Integer obtenerPulsoPromedio() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Integer obtenerPulsoMinimo() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Integer obtenerPulsoMaximo() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
