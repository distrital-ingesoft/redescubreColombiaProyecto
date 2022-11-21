package redescubrecolombia.modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Amigo {

   @Id @GeneratedValue
   Long id;

   @Column(nullable = false)
   String nombreAmigo;
   String apellidoAmigo;

   private void setNombreAmigo(String value) {
      this.nombreAmigo = value;
   }

   private String getNombreAmigo() {
      return this.nombreAmigo;
   }

   

   private void setApellidoAmigo(String value) {
      this.apellidoAmigo = value;
   }

   private String getApellidoAmigo() {
      return this.apellidoAmigo;
   }


   @Column(unique = true)
   String emailAmigo;

   private void setEmailAmigo(String value) {
      this.emailAmigo = value;
   }

   private String getEmailAmigo() {
      return this.emailAmigo;
   }

   /**
    * <pre>
    *           0..*     1..1
    * Amigo ------------------------- Usuario
    *           amigo        &lt;       usuario
    * </pre>
    */
   
   @Column(unique = true)
   Usuario usuario;

   public void setUsuario(Usuario value) {
      this.usuario = value;
   }

   public Usuario getUsuario() {
      return this.usuario;
   }

   public String getEmailAmigo(String emailAmigo) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }

   public String getnomAm() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }

   public String getApAm() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }

}
