package poo_Udemy.Seção_14_Herança_Polimorfismo.Questão3;

public class PessoaJuridica extends Contribuinte {
    private Integer funcionarios;

    PessoaJuridica(){
        super();
    }
    PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios){
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }
    
    @Override
    public double imposto(){
        if(funcionarios > 10){
            return rendaAnual * 0.14;
        }else{
            return rendaAnual * 0.16;
        }
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    }
    public Integer getFuncionarios() {
        return funcionarios;
    }
}
