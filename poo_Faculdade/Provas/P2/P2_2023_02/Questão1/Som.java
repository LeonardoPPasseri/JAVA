package poo_Faculdade.Provas.P2.P2_2023_02.Questão1;

public class Som extends Acessorio {
    
    public Som(String marca,double preço){
        super(marca,preço);
    }

    public double calcularImposto(){
        return this.getPreço() * 0.3;
    }
}

