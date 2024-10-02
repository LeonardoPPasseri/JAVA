package poo_Udemy.Seção_16_Interfaces.Questão_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programa {
    public static void main(String[] args) {
        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Entre com os dados do aluguel");
        String modelo = "Civic";
        LocalDateTime saida = LocalDateTime.parse("01/10/2024 23:34:15",ftm1);
        Carro c1 = new Carro(modelo, saida);
        double valorBasico = c1.valorBasico();
        double imposto = c1.imposto(valorBasico);
        double valorTotal = c1.valorTotal(valorBasico, imposto);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + valorBasico);
        System.out.println("Imposto: " + imposto);
        System.out.println("Pagamento total: " + valorTotal);
    }
}
