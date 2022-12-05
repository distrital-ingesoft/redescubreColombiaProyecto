package redescubrecolombia.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode


public class Amigo {
    @Id @GeneratedValue
    Long id;
 
    
    @NonNull
    String Nombre;
    String Apellido;
 
    @Column(unique = true)
    String Email;
    
       /**
     * <pre>
     *           0..*     1..1
     * DatoSalud ------------------------- Viaje
     *           datoSalud        &lt;       viaje
     * </pre>
     */
 
     @ManyToOne(fetch = FetchType.EAGER)
    private User usuario;

    
     
}
