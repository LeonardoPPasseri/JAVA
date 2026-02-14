package com.leonardo.aula_springboot_mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.aula_springboot_mongodb.domain.User;
import com.leonardo.aula_springboot_mongodb.dto.UserDTO;
import com.leonardo.aula_springboot_mongodb.repository.UserRepository;
import com.leonardo.aula_springboot_mongodb.services.exception.ObjectNotFoundException;

@Service // Essa classe é um componente de serviço e deve ser gerenciada pelo Spring
public class UserService {
    
    @Autowired // Isso é Injeção de Dependência. Você não cria com new UserRepository().O
               // Spring cria e gerencia pra você.
    private UserRepository repo;

    //GET
    public List<User> findAll() {
        // Controller → Service → Repository → Banco
        // Banco -> Repository → Service → Controller
        return repo.findAll();
    }

    //GET
    public User findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    //POST
    public User insert(User obj) {
        return repo.insert(obj);
    }
    public User fromDTO(UserDTO objDto) { //Caminho inverso, UserDTO para User
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
