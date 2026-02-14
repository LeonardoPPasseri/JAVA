package com.leonardo.aula_springboot_mongodb.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.aula_springboot_mongodb.domain.User;
import com.leonardo.aula_springboot_mongodb.dto.UserDTO;
import com.leonardo.aula_springboot_mongodb.services.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users") // Define o caminho para acessar os recursos de usuário
public class UserResourced {

    @Autowired
    private UserService service;

    // @RequestMapping(method=RequestMethod.GET)
    @GetMapping() // Significa que esse metodo responde a requisições HTTP do tipo GET
    public ResponseEntity<List<UserDTO>> findAll() {

        List<User> list = service.findAll(); // Chama o método findAll() do serviço para obter a lista de usuários

        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList()); // Converte a lista
                                                                                                     // de User para uma
                                                                                                     // lista de UserDTO
                                                                                                     // usando Java
                                                                                                     // Streams. O
                                                                                                     // método map() é
                                                                                                     // usado para
                                                                                                     // transformar cada
                                                                                                     // User em um
                                                                                                     // UserDTO, e
                                                                                                     // collect(Collectors.toList())
                                                                                                     // coleta os
                                                                                                     // resultados em
                                                                                                     // uma nova lista.

        return ResponseEntity.ok().body(listDto); // Retorna a resposta HTTP com o status 200 (OK) e o corpo contendo a
                                                  // lista de usuários
    }
    /*
     * ResponseEntity representa toda a resposta HTTP, não só o corpo (body).
     * 
     * Ela permite controlar:
     * 
     * ✅ Corpo da resposta (JSON, por exemplo)
     * 
     * ✅ Código HTTP (200, 404, 400, etc.)
     * 
     * ✅ Headers (se quiser)
     */

    @GetMapping(value = "/{id}") // localhost:8080/users/1
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {

        User obj = service.findById(id); // Chama o método findById() do serviço para obter um usuário específico

        return ResponseEntity.ok().body(new UserDTO(obj)); // Retorna a resposta HTTP com o status 200 (OK) e o corpo
                                                           // contendo a representação do usuário encontrado, convertida
                                                           // para UserDTO.
    }

}
