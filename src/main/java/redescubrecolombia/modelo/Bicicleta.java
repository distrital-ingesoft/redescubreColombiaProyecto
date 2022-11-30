package redescubrecolombia.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
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
   private Usuario usuario;


   public void setUsuario(Usuario value) {
      this.usuario = value;
   }
   
   public Usuario getUsuario() {
      return this.usuario;
   }

   public String getBicicleta() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }

   public String setBicicleta() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }

}