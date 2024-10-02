package poo_Udemy.Seção_16_Interfaces.Questão_1;

import java.time.Duration;
import java.time.LocalDateTime;

public class Carro implements Automovel{
    private String modelo;
    private LocalDateTime entrada = LocalDateTime.now();
    private LocalDateTime saida;
    final private double valorHora = 5.0;
    final private double valorDia = 45.0;

    public Carro(String modelo, LocalDateTime saida){
        this.saida = saida;
        this.modelo = modelo;
    }

    public double valorBasico(){
        Duration duração = Duration.between(entrada,saida);
        double valorBasico = 0.0;
        if(duração.toHours() <= 12){
            valorBasico = valorHora * duração.toHours();
        }else{
            if(duração.toDays() == 0){
                valorBasico = valorDia;
            }else{
                valorBasico = valorDia * duração.toDays();
            }
        }
        System.out.println(duração.toHours());
        System.out.println(duração.toDays());
        return valorBasico;
    }

    public double imposto(double valorBasico){
        if(valorBasico <= 100){
            return valorBasico * 0.2;    
        }else{
            return valorBasico * 0.15;
        }
    }

    public double valorTotal(double valorBasico, double imposto){
        return valorBasico + imposto;
    }

    public String getModelo() {
        return modelo;
    }public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}