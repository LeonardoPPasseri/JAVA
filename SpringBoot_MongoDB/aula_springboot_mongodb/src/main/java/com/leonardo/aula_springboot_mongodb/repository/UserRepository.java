package com.leonardo.aula_springboot_mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leonardo.aula_springboot_mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // MongoRepository é uma interface do Spring Data MongoDB que fornece métodos para realizar operações de CRUD (Create, Read, Update, Delete) em documentos do MongoDB.
}
