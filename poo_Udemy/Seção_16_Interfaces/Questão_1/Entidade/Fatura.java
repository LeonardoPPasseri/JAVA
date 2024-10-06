package poo_Udemy.Seção_16_Interfaces.Questão_1.Entidade;

public class Fatura {
    private double pagamentoBasico;
    private double taxa;
    
    public Fatura(double pagamentoBasico, double taxa){
        this.taxa = taxa;
        this.pagamentoBasico = pagamentoBasico;
    }

    public double getPagamentoTotal(){
        return pagamentoBasico + taxa;
    }

    public void setPagamentoBasico(double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }public double getPagamentoBasico() {
        return pagamentoBasico;
    }public void setTaxa(double taxa) {
        this.taxa = taxa;
    }public double getTaxa() {
        return taxa;
    }
}
