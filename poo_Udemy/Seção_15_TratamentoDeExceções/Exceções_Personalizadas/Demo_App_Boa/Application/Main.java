package poo_Udemy.Seção_15_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_Boa.Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import poo_Udemy.Seção_15_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_Boa.Entities.Reserva;
import poo_Udemy.Seção_15_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_Boa.Exception.DomainException;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       // Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Numero do Quarto: 8019");
            int numero = 8019;
            System.out.println("Data de entrada(dd/MM/yyyy): 23/09/2024");
            LocalDate entrada = LocalDate.parse("23/09/2024",fmt01);
            System.out.println("Data de saida(dd/MM/yyyy): 26/09/2024");
            LocalDate saida = LocalDate.parse("26/09/2024",fmt01);

            Reserva reserva = new Reserva(numero,entrada,saida);
            System.out.println(reserva);

            System.out.println("======================================");
            System.out.println("Entre com uma nova data para reserva:");
            System.out.println("Data de entrada(dd/MM/yyyy): 24/09/2024");
            entrada = LocalDate.parse("24/09/2024",fmt01);
            System.out.println("Data de saida(dd/MM/yyyy): 29/09/2024");
            saida = LocalDate.parse("29/09/2024",fmt01);

            reserva.atualização(entrada,saida);  
            System.out.println(reserva);
      
        }
        catch(DateTimeParseException e){
            System.out.println("Erro: Data invalida ===>" + e.getMessage());
        }
        catch(DomainException e){ //Exceção personalizada
            System.out.println("Erro na reserva: "+ e.getMessage());
        }
        catch(RuntimeException e){ //Exceção generica, usado para qualquer outra exceção que pode acontecer
            System.out.println("Erro inexperado");
        }
    }
}
