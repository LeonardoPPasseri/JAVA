package poo_Faculdade.Aula3_Aula4.Modificadores_Encapsulamento;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("João");
        pessoa.setIdade(20);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}