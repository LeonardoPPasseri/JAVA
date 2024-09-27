package poo_Udemy.Seção_13_Herança_Polimorfismo.Questão3;

public abstract class Contribuinte {
    protected String nome;
    protected Double rendaAnual;

    Contribuinte(){
    }
    Contribuinte(String nome, Double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public abstract double imposto();

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    public Double getRendaAnual() {
        return rendaAnual;
    }
}
