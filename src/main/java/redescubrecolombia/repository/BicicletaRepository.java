package redescubrecolombia.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import redescubrecolombia.modelo.Bicicleta;

@Repository

public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {
    @Query("select A from Bicicleta B where B.usuario.id = ?1")
    List<Bicicleta> encontrarPorIdUsuarioBicicleta(Long idUsuario);    
}







