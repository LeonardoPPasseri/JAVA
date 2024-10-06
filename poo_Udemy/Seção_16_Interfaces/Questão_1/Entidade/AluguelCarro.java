package poo_Udemy.Seção_16_Interfaces.Questão_1.Entidade;

import java.time.LocalDateTime;

public class AluguelCarro {
    private LocalDateTime entrada;
    private LocalDateTime saida;

    private Carro carro;
    private Fatura fatura;

    public AluguelCarro(Carro carro, LocalDateTime entrada, LocalDateTime saida){
        this.carro = carro;
        this.entrada = entrada;
        this.saida = saida;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }public Carro getCarro() {
        return carro;
    }public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }public LocalDateTime getEntrada() {
        return entrada;
    }public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }public Fatura getFatura() {
        return fatura;
    }public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }public LocalDateTime getSaida() {
        return saida;
    }
}
