package redescubrecolombia.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
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
@Table(name = "users")
public class User {
	
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      
      @Column(nullable = false, unique = true, length = 45)
      private String email;
      
      @Column(nullable = false, length = 64)
      private String password;
      
      @Column(name = "first_name", nullable = false, length = 20)
      private String firstName;
      
      @Column(name = "last_name", nullable = false, length = 20)
      
      private String lastName;
   
      // @ManyToMany
      // private List<User> seguidores;

      public Long getId() {
         return id;
      }
   
      public void setId(Long id) {
         this.id = id;
      }
   
      public String getEmail() {
         return email;
      }
   
      public void setEmail(String email) {
         this.email = email;
      }
   
      public String getPassword() {
         return password;
      }
   
      public void setPassword(String password) {
         this.password = password;
      }
   
      public String getFirstName() {
         return firstName;
      }
   
      public void setFirstName(String firstName) {
         this.firstName = firstName;
      }
   
      public String getLastName() {
         return lastName;
      }
   
      public void setLastName(String lastName) {
         this.lastName = lastName;
      }
    
    //Set<Amigo> amigo;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    Set<Viaje> viajes = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    Set<Bicicleta> bicicletas = new HashSet<>();


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    Set<Amigo> amigos = new HashSet<>();


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