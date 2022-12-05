package redescubrecolombia.modelo;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;


@Entity
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
// En UMLLab
// propiedades:
//    + nombre:String
//
public class Viaje {
  
   @Id @GeneratedValue
   Long id;

   public Integer tipoRuta;

   public String nomViaje;

   private String origen;
   private String destino;

   @OneToOne
   private Coordenada coordOrigen;

   @OneToOne
   private Coordenada coordDestino;

   private Date fechaHoraInicio;
   private Date fechaHoraLlegada;


   
   /**
    * <pre>
    *           1..1     0..*
    * Viaje ------------------------- DatoSalud
    *           viaje        &gt;       datoSalud
    * </pre>
    */
   @OneToMany(mappedBy = "viaje")
   private Set<DatoSalud> datoSalud = new HashSet<DatoSalud>();
   
   /**
    * <pre>
    *           1..1     1..1
    * Viaje ------------------------> Usuario
    *           &lt;       usuario  
    * </pre>
    */
   @ManyToOne(fetch = FetchType.EAGER)
   private User usuario;
   


   /**
    * <pre>
    *           1..1     0..*
    * Viaje ------------------------- DatoDesplazamiento
    *           viaje        &gt;       datoDesaplazamiento
    * </pre>
    */
   @OneToMany(mappedBy = "viaje")
   private Set<DatoDesplazamiento> datoDesaplazamiento = new HashSet<DatoDesplazamiento>();
   

   @OneToMany(mappedBy = "viaje")
   private Set<Lugar> lugarOrigen = new HashSet<Lugar>();

 
   @OneToMany(mappedBy = "viaje")
   private Set<Lugar> lugarDestino = new HashSet<Lugar>();

   
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
   
   public Integer obtenerDistanciaRecorrida() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Integer obtenerTiempoRecorrido() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Integer obtenerDistanciaTotalRecorrida() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Integer obtenterTiempoTotalRecorrido() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public float distanciaRecorridaTipoBicicleta() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
