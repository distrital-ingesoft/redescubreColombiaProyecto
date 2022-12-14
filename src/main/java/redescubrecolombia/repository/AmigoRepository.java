package redescubrecolombia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import redescubrecolombia.modelo.Amigo;

@Repository

public interface AmigoRepository  extends JpaRepository<Amigo, Long> {
    @Query("select A from Amigo A where A.usuario.id = ?1")
    List<Amigo> encontrarPorIdUsuario(Long idUsuario);    
}
