package poo_Udemy.Seção_13_Enumeração.Questão3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    //nome email aniversario
    private String nome;
    private String email;
    private LocalDate aniversario;

    Cliente(){
        this.nome = "Leo";
        this.email = "leoppasseri@gmail.com";
        this.aniversario = LocalDate.parse("1999-09-16");
    }
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public String toString(){
        return ("Nome: " + nome + "\nEmail: " + email + "\nData de Aniversario: " + aniversario.format(fmt2));
    }   

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }
    public LocalDate getAniversario() {
        return aniversario;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
