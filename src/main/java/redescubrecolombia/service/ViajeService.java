package redescubrecolombia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redescubrecolombia.modelo.Amigo;
import redescubrecolombia.modelo.User;
import redescubrecolombia.modelo.Viaje;
import redescubrecolombia.repository.AmigoRepository;
import redescubrecolombia.repository.UserRepository;
import redescubrecolombia.repository.ViajeRepository;

@Component
public class ViajeService {

    @Autowired
    private ViajeRepository redescubrecolombiaRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AmigoRepository amigoRepository;

    public Viaje crearViaje(Viaje viaje, Long idUsuario) throws Exception {

        if (viaje.getTipoRuta() < 0 || viaje.getTipoRuta() > 5) {
            throw new Exception("El tipo de ruta no es valido");
        }

        if (viaje.getCoordOrigen() == null) {
            throw new Exception("No existe coordenada de origen");
        }

        if (viaje.getCoordDestino() == null) {
            throw new Exception("No existe coordenada de destino");
        }

        if (viaje.getFechaHoraInicio() == null) {
            throw new Exception("El viaje nunca se inicio");
        }

        Optional<User> u = userRepository.findById(idUsuario);
        if (u.isEmpty()) {
            throw new Exception("usuario no existe");
        }

        viaje.setUsuario(u.get());

        return redescubrecolombiaRepository.save(viaje);
    }

    public Viaje crearViajeAmigos(Viaje viaje, Long idUsuario, Long idAmigo) throws Exception{

        if(viaje.getTipoRuta() < 0 || viaje.getTipoRuta() > 5) {
            throw new Exception("El tipo de ruta no es valido");
        }
      
        
        if(viaje.getTipoRuta() < 0 || viaje.getTipoRuta() > 5) {
            throw new Exception("El tipo de ruta no es valido");
        }

        if(viaje.getCoordOrigen() == null){
            throw new Exception("No existe coordenada de origen");
        }

        if(viaje.getCoordDestino() == null){
            throw  new Exception("No existe coordenada de destino");
        }
        
        if(viaje.getFechaHoraInicio() == null){
            throw new Exception("El viaje nunca se inicio");
        }
        

        Optional<User> u = userRepository.findById(idUsuario);
        if(u.isEmpty()){
            throw new Exception("usuario no existe");
        }

        viaje.setUsuario(u.get());

        Optional<Amigo> a = amigoRepository.findById(idAmigo);


        return redescubrecolombiaRepository.save(viaje);
    }

}
