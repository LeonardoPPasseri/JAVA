package poo_Udemy.Seção_14_Herança_Polimorfismo.Questão3;

public class PessoaFisica extends Contribuinte {
    private Double saude;

    PessoaFisica(){
        super();
    }
    PessoaFisica(String nome, Double rendaAnual, Double saude){
        super(nome, rendaAnual);
        this.saude = saude;
    }

    @Override
    public double imposto(){
        double imposto = 0.0;
        if(rendaAnual < 20000){
            imposto = (rendaAnual * 0.15) - (saude*0.5);
        }else{
            imposto = (rendaAnual * 0.25) - (saude*0.5);
        }
        if(imposto < 0.0){
            return 0.0;
        }else{
            return imposto;
        }
    }

    public void setSaude(Double saude) {
        this.saude = saude;
    }
    public Double getSaude() {
        return saude;
    }
}
