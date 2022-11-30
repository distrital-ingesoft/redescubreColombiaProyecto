package redescubrecolombia.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Usuario {

    @Id @GeneratedValue
    Long id;

    @Column(unique = true)
    String correo;


    @NonNull
    String username;

    @NonNull
    Integer telefono;

    @Column(nullable = false)
    String nombre;
    String apellido;

    
    //Set<Amigo> amigo;

    @Temporal(TemporalType.DATE)
    Date fechaNacimiento;

    String contrasena;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    Set<Viaje> viajes = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    Set<Bicicleta> bicicletas = new HashSet<>();



     @ManyToMany
     private Set<Usuario> amigo;
    
   private void setTelefono(Integer value) {
      this.telefono = value;
   }

     public Boolean crearViaje(Integer idViaje) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Boolean eliminarViaje(Integer idViaje) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Boolean actualizarViaje(Integer idViaje) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void registrar() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Boolean agregarAmigoViaje(String nombre, String apellido) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Boolean agregarAmigoLista(String nombreAmigo, String apellidoAmigo, String emailAmigo) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Boolean borrarAmigoLista(String emailAmigo) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Boolean actualizarAmigoLista(String nombreAmigo, String apellidoAmigo, String emailAmigo) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public String consultarAmigoLista(String email) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Integer numeroViajesRealizados() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
     
}    