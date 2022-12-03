package redescubrecolombia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import redescubrecolombia.modelo.DatoSalud;

@Repository
public interface DatoSaludRepository extends JpaRepository<DatoSalud, Long> {
    
}
