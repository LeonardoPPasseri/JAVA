package com.leonardo.aula_springboot_mongodb.domain;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user") // Define o nome da coleção no MongoDB onde os documentos do tipo User serão armazenados.
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    /*
     * Para garantir que a classe seja compatível com versões futuras,
     * é recomendado definir um serialVersionUID. Ele é usado durante o
     * processo de desserialização para verificar se a classe é
     * compatível com a versão do objeto serializado. Se as versões
     * forem incompatíveis, uma InvalidClassException será lançada.
     * 
     */
    
    @Id // Indica que o campo 'id' é o identificador único do documento no MongoDB.
    private String id;

    private String email;
    private String name;

    public User() {

    }

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // hashcode e equals do ID
    @Override
    public boolean equals(Object obj) {
        // Comparando os objetos
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        // Comparando os IDs dos objetos
        User other = (User) obj;
        if (this.id == null || other.id == null)
            return false;
        return (this.id).equals(other.id); // Usa o metodo .equals da classe String
    }

    /*
     * hashCode() é o número que o Java usa para organizar objetos em estruturas
     * rápidas, e ele precisa ser consistente com o equals(). Se dois objetos são
     * iguais de acordo com o equals(), eles devem ter o mesmo hashCode(). Se você
     * não sobrescrever hashCode(), pode ter problemas ao usar objetos em coleções
     * como HashSet ou HashMap, onde a eficiência depende de um hashCode()
     * consistente.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
