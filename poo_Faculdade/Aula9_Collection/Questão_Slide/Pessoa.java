package poo_Faculdade.Aula9_Collection.Questão_Slide;

import java.util.Map;

class Pessoa {
    String nome;
    int idade;
    String endereco;
    String cpf;

    public Pessoa(String nome, int idade, String endereco, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public static Object procuraMap(Map map,String cpf){
        return map.get(cpf);
    }
    public String toString(){
        return nome+" "+idade+" "+endereco+" - "+cpf;
    }
}