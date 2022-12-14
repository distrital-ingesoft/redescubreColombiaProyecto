package redescubrecolombia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined;
import redescubrecolombia.modelo.Amigo;
import redescubrecolombia.modelo.User;

import redescubrecolombia.repository.AmigoRepository;
import redescubrecolombia.repository.UserRepository;

@Component
public class AmigoService {
    @Autowired
    private  AmigoRepository redescubrecolombiaRepository;

    @Autowired
    private UserRepository userRepository;

    public Amigo crearAmigo(Amigo amigo, Long idUsuario) throws Exception{

        if(amigo.getEmail() == null) {
            throw new Exception("no existe ese amigo");
        }

            Optional<User> u = userRepository.findById(idUsuario);
            if(u.isEmpty()){
                throw new Exception("usuario no existe");
            }

            amigo.setUsuario(u.get());

        return redescubrecolombiaRepository.save(amigo);
    }
}
