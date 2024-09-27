package poo_Udemy.Seção_14_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_MtRuim.Entities;

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
    public void atualização(LocalDate entrada, LocalDate saida){
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
