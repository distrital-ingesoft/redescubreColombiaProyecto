package redescubrecolombia.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class DatoDesplazamiento {

   @Id @GeneratedValue
   Long id;

   @Temporal(TemporalType.TIMESTAMP)
   private Date fechaHora;
   
   @OneToOne()
   Coordenada coordenada;
       
    /**
     * <pre>
     *           0..*     1..1
     * DatoSalud ------------------------- Viaje
     *           datoSalud        &lt;       viaje
     * </pre>
     */
   @ManyToOne
   private Viaje viaje;
    
}
