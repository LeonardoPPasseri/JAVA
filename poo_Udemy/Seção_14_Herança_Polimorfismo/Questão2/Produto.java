package poo_Udemy.Seção_14_Herança_Polimorfismo.Questão2;

public class Produto {
    protected String nome;
    protected Double preço;

    Produto(){
    }
    public Produto(String nome,Double preço){
        this.nome = nome;
        this.preço = preço;
    }
    public String etiqueta(){
        return nome + " $" + preço;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPreço(Double preço) {
        this.preço = preço;
    }
    public Double getPreço() {
        return preço;
    }
}
