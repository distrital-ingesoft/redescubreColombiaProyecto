package redescubrecolombia.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.Viaje;
import redescubrecolombia.repository.ViajeRepository;
@RestController
@RequestMapping("/viaje")
public class ViajeController {
    
    private final ViajeRepository redescubrecolombiaRepository;

    public ViajeController(ViajeRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("/viaje")
    @ResponseStatus(HttpStatus.CREATED)
    public Viaje crearEjemplo(@RequestBody Viaje todo) {
        return redescubrecolombiaRepository.save(todo);
    }

    @GetMapping("/viaje")
    public Iterable<Viaje> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }
}