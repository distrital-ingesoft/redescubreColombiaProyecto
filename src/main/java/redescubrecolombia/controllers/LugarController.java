package redescubrecolombia.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.Lugar;
import redescubrecolombia.repository.LugarRepository;
@RestController
@RequestMapping("/lugar")
public class LugarController {
    
    private final LugarRepository redescubrecolombiaRepository;

    public LugarController(LugarRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("/lugar")
    @ResponseStatus(HttpStatus.CREATED)
    public Lugar crearEjemplo(@RequestBody Lugar todo) {
        return redescubrecolombiaRepository.save(todo);
    }

    @GetMapping("/viaje/{id}/lugar")
    public Iterable<Lugar> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }
}