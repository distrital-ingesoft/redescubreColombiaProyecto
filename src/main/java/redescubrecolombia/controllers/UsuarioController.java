package redescubrecolombia.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.Usuario;
import redescubrecolombia.repository.UsuarioRepository;
@RestController
@RequestMapping("/")
public class UsuarioController {
    
    private final UsuarioRepository redescubrecolombiaRepository;

    public UsuarioController(UsuarioRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario crearEjemplo(@RequestBody Usuario todo) {
        return redescubrecolombiaRepository.save(todo);
    }

    @GetMapping("/")
    public Iterable<Usuario> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }
}