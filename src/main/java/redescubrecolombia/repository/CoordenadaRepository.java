package redescubrecolombia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import redescubrecolombia.modelo.Coordenada;

@Repository
public interface CoordenadaRepository extends JpaRepository<Coordenada, Long> {
    
}







