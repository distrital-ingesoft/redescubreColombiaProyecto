package redescubrecolombia.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.Amigo;
import redescubrecolombia.repository.AmigoRepository;
@RestController
@RequestMapping("/amigo")


public class AmigoController {
    private final AmigoRepository redescubrecolombiaRepository;

    public AmigoController(AmigoRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("/amigo")
    @ResponseStatus(HttpStatus.CREATED)
    public Amigo crearEjemplo(@RequestBody Amigo todo) {
        return redescubrecolombiaRepository.save(todo);
    }

    @GetMapping("/amigo")
    public Iterable<Amigo> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }

}
