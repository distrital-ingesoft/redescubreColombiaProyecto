package redescubrecolombia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import redescubrecolombia.modelo.Viaje;
import redescubrecolombia.repository.ViajeRepository;
import redescubrecolombia.service.ViajeService;
@RestController
@RequestMapping("/viaje")
public class ViajeController {
    
    private final ViajeRepository redescubrecolombiaRepository;


    @Autowired
    private ViajeService viajeService; 

    public ViajeController(ViajeRepository tareasRepository) {
        this.redescubrecolombiaRepository = tareasRepository;
    } 

    @PostMapping("/usuario/{id}/viaje")
    @ResponseStatus(HttpStatus.CREATED)
    public Viaje crearViajeIndividual  (@RequestBody Viaje viaje, @PathVariable(name = "id") Long idUsuario) throws Exception{
        
        return viajeService.crearViaje(viaje, idUsuario);
        
    }


    @GetMapping("/viaje")
    public Iterable<Viaje> getEjemplo() {
        return redescubrecolombiaRepository.findAll();
    }
    
    @GetMapping("usuario/{id}/viaje/")
    public Iterable<Viaje> getViajesPorIdUsuario(@PathVariable(name = "id") Long idUsuario) throws Exception {
        return redescubrecolombiaRepository.encontrarPorIdUsuarioViaje(idUsuario);
    }

    
}