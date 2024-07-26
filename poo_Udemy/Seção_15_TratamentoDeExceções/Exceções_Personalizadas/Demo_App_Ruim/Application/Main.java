package poo_Udemy.Seção_15_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_Ruim.Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import poo_Udemy.Seção_15_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_Ruim.Entities.Reserva;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       // Scanner sc = new Scanner(System.in);
        System.out.println("Numero do Quarto: 8019");
        int numero = 8019;
        System.out.println("Data de entrada(dd/MM/yyyy): 23/09/2024");
        LocalDate entrada = LocalDate.parse("23/09/2024",fmt01);
        System.out.println("Data de saida(dd/MM/yyyy): 26/09/2024");
        LocalDate saida = LocalDate.parse("26/09/2024",fmt01);

        //Não sera possivel alterar essa validação como feito no update pois precisaria passar 
        //a validação para o construtor, e o construtor não poderia retornar string
        if(saida.getDayOfYear() < entrada.getDayOfYear()){ 
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }else{
            Reserva reserva = new Reserva(numero,entrada,saida);
            System.out.println(reserva);

            System.out.println("======================================");
            System.out.println("Entre com uma nova data para reserva:");
            System.out.println("Data de entrada(dd/MM/yyyy): 24/09/2024");
            entrada = LocalDate.parse("24/09/2024",fmt01);
            System.out.println("Data de saida(dd/MM/yyyy): 29/09/2024");
            saida = LocalDate.parse("29/09/2024",fmt01);
            String erro = reserva.atualização(entrada,saida);
            //Validação feita no metodo atualização. Retorna uma string caso tenha uma exceção
            if(erro == null){
                System.out.println(reserva); 
            }else{
                System.out.println("Erro: " + erro);    
            }
        }
    }
}
