package poo_Udemy.Seção_13_Herança_Polimorfismo.Questão2;

public class ProdutoImportado extends Produto {
    private Double taxa;

    ProdutoImportado(){
        super();
    }
    public ProdutoImportado(String nome,Double preço,Double taxa){
        super(nome,preço);
        this.taxa = taxa;
    }
    public String etiqueta(){

        return nome + " $" +  preçoTotal() + " (Taxa de importação: $" + taxa + ")";
    }
    public Double preçoTotal(){
        return preço + taxa;
    }
    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    public Double getTaxa() {
        return taxa;
    }
}
