package redescubrecolombia.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Bicicleta {

   @Id @GeneratedValue
   Long id;

   private String tipoBicicleta;

   private void setTipoBicicleta(String value) {
      this.tipoBicicleta = value;
   }

   private String getTipoBicicleta() {
      return this.tipoBicicleta;
   }

   /**
    * <pre>
    *           0..*     1..1
    * Bicicleta ------------------------- Usuario
    *           bicicleta        &lt;       usuario
    * </pre>
    */
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