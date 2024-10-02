package poo_Udemy.Seção_16_Interfaces.Questão_1;

public interface Automovel {
    public double valorBasico();
    public double imposto(double valorBasico);
    public double valorTotal(double valorBasico, double imposto);
}
