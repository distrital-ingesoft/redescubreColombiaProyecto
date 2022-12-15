package redescubrecolombia.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import redescubrecolombia.modelo.Bicicleta;



public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {
    @Query("select B from Bicicleta B where B.usuario.id = ?1")
    List<Bicicleta> encontrarPorIdUsuarioBicicleta(Long idUsuario);    
}








