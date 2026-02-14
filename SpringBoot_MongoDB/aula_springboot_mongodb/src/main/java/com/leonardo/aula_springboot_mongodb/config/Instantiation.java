package com.leonardo.aula_springboot_mongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.leonardo.aula_springboot_mongodb.domain.User;
import com.leonardo.aula_springboot_mongodb.repository.UserRepository;

@Configuration //Essa classe é de configuração e deve ser gerenciada pelo Spring
public class Instantiation implements CommandLineRunner {
    // CommandLineRunner é uma interface do Spring Boot que indica que a classe deve executar o método run() quando a aplicação for iniciada. Isso é útil para realizar tarefas de inicialização, como popular o banco de dados com dados de teste.

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll(); // Limpa a coleção de usuários no MongoDB antes de inserir os novos dados

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,alex,bob)); // Salva os usuários no MongoDB usando o método saveAll() do repositório
        
    }

}
