package com.leonardo.aula_springboot_mongodb.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.aula_springboot_mongodb.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users") // Define o caminho para acessar os recursos de usuário
public class UserResourced {

    // @RequestMapping(method=RequestMethod.GET)
    @GetMapping() // Significa que esse metodo responde a requisições HTTP do tipo GET
    public ResponseEntity<List<User>> findAll() {
        User u1 = new User("1", "Maria", "maria@gmail.com");
        User u2 = new User("2", "João", "joão@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(u1, u2));

        return ResponseEntity.ok().body(list); // Retorna a resposta HTTP com o status 200 (OK) e o corpo contendo a lista de usuários
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

        
}
