package redescubrecolombia.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.Bicicleta;
import redescubrecolombia.repository.BicicletaRepository;
@RestController
@RequestMapping("/bicicleta")
public class BicicletaController {
    
    private final BicicletaRepository redescubrecolombiaRepository;

    public BicicletaController(BicicletaRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("/bicicleta")
    @ResponseStatus(HttpStatus.CREATED)
    public Bicicleta crearEjemplo(@RequestBody Bicicleta todo) {
        return redescubrecolombiaRepository.save(todo);
    }

    @GetMapping("/bicicleta")
    public Iterable<Bicicleta> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }
    
}