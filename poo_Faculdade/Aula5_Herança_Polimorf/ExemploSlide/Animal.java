package poo_Faculdade.Aula5_Herança_Polimorf.ExemploSlide;

public class Animal {
    private String nome;
    private String cor;
    private int idade;


    public void emitirSom(){
        System.out.println("animal");
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
}
