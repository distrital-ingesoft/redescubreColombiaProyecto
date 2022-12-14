package redescubrecolombia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.Amigo;
import redescubrecolombia.repository.AmigoRepository;
import redescubrecolombia.service.AmigoService;
@RestController
@RequestMapping("/amigo")


public class AmigoController {
    private final AmigoRepository redescubrecolombiaRepository;

    @Autowired
    private AmigoService amigoService; 

    public AmigoController(AmigoRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("/usuario/{id}/amigo")
    @ResponseStatus(HttpStatus.CREATED)
    public Amigo crearEjemplo  (@RequestBody Amigo amigo, @PathVariable(name = "id") Long idUsuario) throws Exception{
        
        return amigoService.crearAmigo(amigo, idUsuario);
        
    }

    @GetMapping("/amigo")
    public Iterable<Amigo> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }
    
    @GetMapping("usuario/{id}/amigo/")
    public Iterable<Amigo> getBicicletasPorIdUsuario(@PathVariable(name = "id") Long idUsuario) throws Exception {
        return redescubrecolombiaRepository.encontrarPorIdUsuario(idUsuario);
    }

}
