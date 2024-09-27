package poo_Udemy.Seção_14_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_MtRuim.Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import poo_Udemy.Seção_14_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_MtRuim.Entities.Reserva;

public class Main {
    /*
     * Room number: 8021
     * Check-in date (dd/MM/yyyy): 23/09/2019
     * Check-out date (dd/MM/yyyy): 26/09/2019
     * Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights
     * Enter data to update the reservation:
     * Check-in date (dd/MM/yyyy): 24/09/2019
     * Check-out date (dd/MM/yyyy): 29/09/2019
     */
    public static void main(String[] args) {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       // Scanner sc = new Scanner(System.in);
        System.out.println("Numero do Quarto: 8019");
        int numero = 8019;
        System.out.println("Data de entrada(dd/MM/yyyy): 23/09/2024");
        LocalDate entrada = LocalDate.parse("23/09/2024",fmt01);
        System.out.println("Data de saida(dd/MM/yyyy): 26/09/2024");
        LocalDate saida = LocalDate.parse("26/09/2024",fmt01);
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
            LocalDate agora = LocalDate.parse("23/09/2024",fmt01);// LocalDate.now();
            if(entrada.isBefore(agora) || saida.isBefore(agora)){
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }else if(saida.isBefore(entrada)){
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }else{
                reserva.atualização(entrada,saida);
                System.out.println(reserva);   
            }
        }
    }
}
