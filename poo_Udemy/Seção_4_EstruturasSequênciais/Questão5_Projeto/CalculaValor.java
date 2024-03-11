package poo_Udemy.Seção_4_EstruturasSequênciais.Questão5_Projeto;

public class CalculaValor {
    int codigo;
    int qtd;
    double valorPorPeça;
    double total;
    public void calculaValor(){
        System.out.println("Valor da venda de codigo " + "(" + codigo + ")" + " é " + qtd*valorPorPeça);
        total = qtd*valorPorPeça;
    }
}
