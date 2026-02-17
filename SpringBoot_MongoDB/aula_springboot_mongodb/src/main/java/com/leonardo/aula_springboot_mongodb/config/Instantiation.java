package com.leonardo.aula_springboot_mongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.leonardo.aula_springboot_mongodb.domain.Post;
import com.leonardo.aula_springboot_mongodb.domain.User;
import com.leonardo.aula_springboot_mongodb.dto.AuthorDTO;
import com.leonardo.aula_springboot_mongodb.repository.PostRepository;
import com.leonardo.aula_springboot_mongodb.repository.UserRepository;

@Configuration // Essa classe é de configuração e deve ser gerenciada pelo Spring
public class Instantiation implements CommandLineRunner {
    // CommandLineRunner é uma interface do Spring Boot que indica que a classe deve
    // executar o método run() quando a aplicação for iniciada. Isso é útil para
    // realizar tarefas de inicialização, como popular o banco de dados com dados de
    // teste.

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll(); // Limpa a coleção de usuários no MongoDB antes de inserir os novos dados

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");
        userRepository.saveAll(Arrays.asList(maria, alex, bob)); // Salva os usuários no MongoDB usando o método
                                                                 // saveAll() do repositório

        postRepository.deleteAll();
        
        Post post1 = new Post(null, format.parse("21/03/2018"), "Partiu viagem!",
                "Vou viajar para São Paulo. Abraços!", new AuthorDTO(maria));

        Post post2 = new Post(null, format.parse("15/06/2019"), "Bom dia!",
                "Acordei cedo hoje e fui correr no parque.", new AuthorDTO(maria));

        Post post3 = new Post(null, format.parse("02/01/2020"), "Novo ano",
                "Que 2020 venha com muitas conquistas e saúde!", new AuthorDTO(alex));

        Post post4 = new Post(null, format.parse("10/12/2021"), "Formatura",
                "Finalmente me formei! Obrigado a todos que me apoiaram.", new AuthorDTO(alex));

        Post post5 = new Post(null, format.parse("05/07/2022"), "Trabalho novo",
                "Comecei hoje em um novo emprego. Muito animado!", new AuthorDTO(bob));
                
        Post post6 = new Post(null, format.parse("18/11/2023"), "Fim de semana",
                "Nada melhor que descansar e assistir uma boa série.", new AuthorDTO(bob));

        postRepository.saveAll(Arrays.asList(post1, post2, post3, post4, post5, post6));

        maria.setPosts(Arrays.asList(post1, post2));
        alex.setPosts(Arrays.asList(post3, post4));
        bob.setPosts(Arrays.asList(post5, post6));

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }

}
