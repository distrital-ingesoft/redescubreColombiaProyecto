package redescubrecolombia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import redescubrecolombia.modelo.Lugar;

@Repository
public interface LugarRepository extends JpaRepository<Lugar, Long> {
    
}







