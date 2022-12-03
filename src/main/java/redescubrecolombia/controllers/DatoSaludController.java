package redescubrecolombia.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.DatoSalud;
import redescubrecolombia.repository.DatoSaludRepository;
@RestController
@RequestMapping("/datosalud")
public class DatoSaludController {
    
    private final DatoSaludRepository redescubrecolombiaRepository;

    public DatoSaludController(DatoSaludRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("/datosalud")
    @ResponseStatus(HttpStatus.CREATED)
    public DatoSalud crearEjemplo(@RequestBody DatoSalud todo) {
        return redescubrecolombiaRepository.save(todo);
    }

    @GetMapping("/datosalud")
    public Iterable<DatoSalud> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }
}