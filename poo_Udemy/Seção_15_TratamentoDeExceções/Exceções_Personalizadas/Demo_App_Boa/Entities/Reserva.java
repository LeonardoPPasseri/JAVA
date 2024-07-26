package poo_Udemy.Seção_15_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_Boa.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import poo_Udemy.Seção_15_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_Boa.Exception.DomainException;

public class Reserva {
    private Integer numero;
    private LocalDate entrada;
    private LocalDate saida;

    DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reserva(){
    }
    public Reserva(Integer numero,LocalDate entrada,LocalDate saida) throws DomainException{
        if(saida.isBefore(entrada)){
            throw new DomainException("Data de saida deve ser depois da data de entrada");
            //Exceção personalizada
         }
        this.entrada = entrada;
        this.numero = numero;
        this.saida = saida;
    }

    public Integer duração(){
        int duração =  saida.getDayOfYear() - entrada.getDayOfYear();
        return duração;
    }
    public void atualização(LocalDate entrada, LocalDate saida) throws DomainException{
        //O throws DomainException é usado para propagar essa exceção(Portanto não iremos tratar a exceção)
        LocalDate agora = LocalDate.parse("23/09/2024",fmt01);// LocalDate.now();
        if(entrada.isBefore(agora) || saida.isBefore(agora)){
            throw new DomainException("Data de reserva devem ser em datas futuras"); 
            //throw new IllegalArgumentException("Reservation dates for update must be future dates");
            //throw new IllegalArgumentException("MENSAGEM") é usado quando a condição não é atendida
        }
        if(saida.isBefore(entrada)){
           //throw new IllegalArgumentException("Check-out date must be after check-in date");
            throw new DomainException("Data de saida deve ser depois da data de entrada");
        }
        this.entrada = entrada;
        this.saida = saida;
    }
    @Override
    public String toString(){
        return ("Reservation: Room " + numero+", check-in: "+entrada.format(fmt01)+", check-out: "+saida.format(fmt01)+", " + duração() + " nights");
    }

    public LocalDate getEntrada() {
        return entrada;
    }public void setNumero(Integer numero) {
        this.numero = numero;
    }public Integer getNumero() {
        return numero;
    }public LocalDate getSaida() {
        return saida;
    }
}
