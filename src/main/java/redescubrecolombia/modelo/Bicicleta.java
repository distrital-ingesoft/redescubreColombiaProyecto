package redescubrecolombia.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;



@Entity
@Data 
public class Bicicleta {

   @Id @GeneratedValue
   Long id;

   
   public Integer tipoBicicleta;

   // private void setTipoBicicleta(int value) {
   //    this.tipoBicicleta = value;
   // }

   // private Integer getTipoBicicleta() {
   //    return this.tipoBicicleta;
   // }

   /**
    * <pre>
    *           0..*     1..1
    * Bicicleta ------------------------- Usuario
    *           bicicleta        &lt;       usuario
    * </pre>
    */
    
   @ManyToOne(fetch = FetchType.EAGER)
   private User usuario;





}