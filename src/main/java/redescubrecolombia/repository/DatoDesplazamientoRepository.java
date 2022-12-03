package redescubrecolombia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import redescubrecolombia.modelo.DatoDesplazamiento;

@Repository
public interface DatoDesplazamientoRepository extends JpaRepository<DatoDesplazamiento, Long> {
    
}
