package poo_Udemy.Seção_13_Enumeração.Questão3;

public class Produto {
    //nome preço    
    private String nome;
    private Double preço;

    Produto(){
    }
    Produto(String nome,Double preço){
        this.nome = nome;
        this.preço = preço;
    }

  //  Produto ovo = new Produto("OVO",3.0);
  //  Produto leite = new Produto("LEITE",5.99);

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    public double getPreço() {
        return preço;
    }
}
