package poo_Faculdade.Provas.P2.P2_2023_01_Final.Questão3;

public class Caneta extends Escreve{
    private String cor;
    private static int quantidade;

    public Caneta() {
        super();
        System.out.println("X");
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        Caneta.quantidade = quantidade;
    }
}