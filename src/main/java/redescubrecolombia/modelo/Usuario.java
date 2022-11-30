package redescubrecolombia.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

    @OneToMany(mappedBy = "usuario")
    Set<Bicicleta> bicicletas = new HashSet<>();

    private void setTelefono(Integer value) {
        this.telefono = value;
     }

    

     
}    