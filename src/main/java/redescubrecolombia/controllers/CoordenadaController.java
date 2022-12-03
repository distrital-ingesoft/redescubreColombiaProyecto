package redescubrecolombia.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.Coordenada;
import redescubrecolombia.repository.CoordenadaRepository;
@RestController
@RequestMapping("coordenada")
public class CoordenadaController {
    
    private final CoordenadaRepository redescubrecolombiaRepository;

    public CoordenadaController(CoordenadaRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("coordenada")
    @ResponseStatus(HttpStatus.CREATED)
    public Coordenada crearEjemplo(@RequestBody Coordenada todo) {
        return redescubrecolombiaRepository.save(todo);
    }

    @GetMapping("coordenada")
    public Iterable<Coordenada> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }
}