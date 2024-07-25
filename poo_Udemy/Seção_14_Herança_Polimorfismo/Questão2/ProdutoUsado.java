package poo_Udemy.Seção_14_Herança_Polimorfismo.Questão2;

import java.time.LocalDate;

public class ProdutoUsado extends Produto{
    private LocalDate data;
    
    ProdutoUsado(){
        super();
    }
    public ProdutoUsado(String nome,Double preço,LocalDate data){
        super(nome,preço);
        this.data = data;
    }
    public String etiqueta(){
        return nome + " (usado) $" + preço + " (Data de fabricação: " + data + ")";
    }
}
