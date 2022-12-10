package redescubrecolombia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.Bicicleta;
import redescubrecolombia.repository.BicicletaRepository;
import redescubrecolombia.service.BicicletaService;
@RestController
@RequestMapping("/bicicleta")
public class BicicletaController {
    
    private final BicicletaRepository redescubrecolombiaRepository;

    @Autowired
    private BicicletaService bicicletaService; 

    public BicicletaController(BicicletaRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("/usuario/{id}/bicicleta")
    @ResponseStatus(HttpStatus.CREATED)
    public Bicicleta crearEjemplo  (@RequestBody Bicicleta bicicleta, @PathVariable(name = "id") Long idUsuario) throws Exception{
        
        return bicicletaService.crearBicicleta(bicicleta, idUsuario);
        
    }

    @GetMapping("/bicicleta")
    public Iterable<Bicicleta> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }
    
    @GetMapping("usuario/{id}/bicicleta/")
    public Iterable<Bicicleta> getBicicletasPorIdUsuario(@PathVariable(name = "id") Long idUsuario) throws Exception {
        return redescubrecolombiaRepository.encontrarPorIdUsuario(idUsuario);
    }
    

}