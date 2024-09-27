package poo_Udemy.Seção_14_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_Ruim.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private Integer numero;
    private LocalDate entrada;
    private LocalDate saida;

    DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reserva(){
    }
    public Reserva(Integer numero,LocalDate entrada,LocalDate saida){
        this.entrada = entrada;
        this.numero = numero;
        this.saida = saida;
    }

    public Integer duração(){
        int duração =  saida.getDayOfYear() - entrada.getDayOfYear();
        return duração;
    }
    public String atualização(LocalDate entrada, LocalDate saida){
        LocalDate agora = LocalDate.parse("23/09/2024",fmt01);// LocalDate.now();
        if(entrada.isBefore(agora) || saida.isBefore(agora)){
            return ("Reservation dates for update must be future dates");
        }
        if(saida.isBefore(entrada)){
           return ("Check-out date must be after check-in date");
        }
        this.entrada = entrada;
        this.saida = saida;
        return null;
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
