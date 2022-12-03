package redescubrecolombia.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.DatoDesplazamiento;
import redescubrecolombia.repository.DatoDesplazamientoRepository;
@RestController
@RequestMapping("/datodesplazamiento")
public class DatoDesplazamientoController {
    
    private final DatoDesplazamientoRepository redescubrecolombiaRepository;

    public DatoDesplazamientoController(DatoDesplazamientoRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("/datodesplazamiento")
    @ResponseStatus(HttpStatus.CREATED)
    public DatoDesplazamiento crearEjemplo(@RequestBody DatoDesplazamiento todo) {
        return redescubrecolombiaRepository.save(todo);
    }

    @GetMapping("/datodesplazamiento")
    public Iterable<DatoDesplazamiento> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }
}