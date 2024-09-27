package poo_Udemy.Seção_12_Enumeração.Questão3;

public class ItemPedidos {
    private Integer quantidade;
    private Produto produto;

    ItemPedidos(){
    }
    ItemPedidos(Integer quantidade,Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Double subTotal(){
        return quantidade * produto.getPreço();
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
