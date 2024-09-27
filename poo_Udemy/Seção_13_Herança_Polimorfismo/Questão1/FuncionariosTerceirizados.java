package poo_Udemy.Seção_13_Herança_Polimorfismo.Questão1;

public class FuncionariosTerceirizados extends Funcionarios {
    private Double despesaAdicional;

    FuncionariosTerceirizados(){
        super();
    }
    FuncionariosTerceirizados(String nome,Integer horas,Double valorPorHora,Double despesaAdicional){
        super(nome,horas,valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public Double pagamento(){
        return super.pagamento() + (despesaAdicional*1.1);
    }
}
