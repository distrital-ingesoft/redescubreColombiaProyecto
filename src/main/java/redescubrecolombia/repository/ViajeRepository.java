package redescubrecolombia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import redescubrecolombia.modelo.Viaje;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Long> {
    
}







