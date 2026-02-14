package com.leonardo.aula_springboot_mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.aula_springboot_mongodb.domain.User;
import com.leonardo.aula_springboot_mongodb.repository.UserRepository;

@Service //Essa classe é um componente de serviço e deve ser gerenciada pelo Spring
public class UserService {

    @Autowired //Isso é Injeção de Dependência. Você não cria com new UserRepository().O Spring cria e gerencia pra você.
    private UserRepository repo;

    public List<User> findAll() {
        //Controller → Service → Repository → Banco
        return repo.findAll();
    }
}
