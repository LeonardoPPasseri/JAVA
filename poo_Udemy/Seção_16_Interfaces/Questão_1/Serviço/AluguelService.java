package poo_Udemy.Seção_16_Interfaces.Questão_1.Serviço;

import java.time.Duration;

import poo_Udemy.Seção_16_Interfaces.Questão_1.Entidade.AluguelCarro;
import poo_Udemy.Seção_16_Interfaces.Questão_1.Entidade.Fatura;

public class AluguelService {
    final private double preçoHora = 10.0;
    final private double preçoDia = 130.0;
    
    private BrasilTaxaService brasilTaxa;

    public AluguelService(BrasilTaxaService brasilTaxa){
        this.brasilTaxa = brasilTaxa;
    }
    
    public void processarFatura(AluguelCarro ac){
        double minutos = Duration.between(ac.getEntrada(), ac.getSaida()).toMinutes();
        double horas = minutos /60;
        double pagamentoBasico;
        if(Math.ceil(horas) <= 12){
            pagamentoBasico = preçoHora * Math.ceil(horas);
        }else{
            pagamentoBasico = preçoDia * Math.ceil(horas/24);
        }
        double taxa = brasilTaxa.taxa(pagamentoBasico);

        ac.setFatura(new Fatura(pagamentoBasico,taxa));
    }

    public double getPreçoDia() {
        return preçoDia;
    }public double getPreçoHora() {
        return preçoHora;
    }
}
