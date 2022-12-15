package redescubrecolombia.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import redescubrecolombia.modelo.Viaje;


public interface ViajeRepository extends JpaRepository<Viaje, Long> {
    @Query("select A from Viaje A where A.usuario.id = ?1")
    List<Viaje> encontrarPorIdUsuarioViaje(Long idViaje);
}




