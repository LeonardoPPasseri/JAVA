package poo_Udemy.Seção_16_Interfaces.Questão_1.Serviço;

public class BrasilTaxaService implements TaxaService {
    
    public double taxa(double valor){
        if(valor <= 100){
            return valor*0.2;
        }else{
            return valor*0.15;
        }
    }
}
