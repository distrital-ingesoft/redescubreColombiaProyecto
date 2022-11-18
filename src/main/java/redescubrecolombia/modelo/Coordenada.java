package redescubrecolombia.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class Coordenada {

   @Id @GeneratedValue
   Long id;

   private Integer longitud;
   private Integer latitud;

}
