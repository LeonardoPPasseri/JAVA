package poo_Faculdade.Provas.P2.P2_2023_02.Questão1;

public class VidroEletrico extends Acessorio{
    
    public VidroEletrico(String marca,double preço){
        super(marca, preço);
    }

    public double calculaImposto(){
        return getPreço()*0.2;
    }

}
