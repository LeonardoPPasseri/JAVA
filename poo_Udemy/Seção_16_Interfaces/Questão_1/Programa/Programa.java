package poo_Udemy.Seção_16_Interfaces.Questão_1.Programa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import poo_Udemy.Seção_16_Interfaces.Questão_1.Entidade.AluguelCarro;
import poo_Udemy.Seção_16_Interfaces.Questão_1.Entidade.Carro;
import poo_Udemy.Seção_16_Interfaces.Questão_1.Serviço.AluguelService;
import poo_Udemy.Seção_16_Interfaces.Questão_1.Serviço.BrasilTaxaService;

public class Programa {
    public static void main(String[] args) {
        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do aluguel");
        Carro carro = new Carro("Civic");
        LocalDateTime entrada = LocalDateTime.parse("25/06/2018 10:30",ftm1);
        LocalDateTime saida = LocalDateTime.parse("25/06/2018 14:40",ftm1);

        AluguelCarro ac = new AluguelCarro(carro,entrada,saida);
        AluguelService aluguel = new AluguelService(new BrasilTaxaService());
        aluguel.processarFatura(ac);

        double valorBasico = ac.getFatura().getPagamentoBasico();
        double imposto = ac.getFatura().getTaxa();
        double valorTotal = ac.getFatura().getPagamentoTotal();

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + valorBasico);
        System.out.println("Imposto: " + imposto);
        System.out.println("Pagamento total: " + valorTotal);
    }
}
