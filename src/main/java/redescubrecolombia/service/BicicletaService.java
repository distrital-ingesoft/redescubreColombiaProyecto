package redescubrecolombia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redescubrecolombia.modelo.Bicicleta;
import redescubrecolombia.modelo.User;
import redescubrecolombia.repository.BicicletaRepository;
import redescubrecolombia.repository.UserRepository;

@Component
public class BicicletaService  {

    @Autowired
    private  BicicletaRepository redescubrecolombiaRepository;

        @Autowired
        private UserRepository userRepository;

    public Bicicleta crearBicicleta(Bicicleta bicicleta, Long idUsuario) throws Exception{

        if(bicicleta.getTipoBicicleta() < 0 || bicicleta.getTipoBicicleta() > 5) {
            throw new Exception("no existe ese tipo de bicicleta");
        }

            Optional<User> u = userRepository.findById(idUsuario);
            if(u.isEmpty()){
                throw new Exception("usuario no existe");
            }

            bicicleta.setUsuario(u.get());

        return redescubrecolombiaRepository.save(bicicleta);
    }
    
}
