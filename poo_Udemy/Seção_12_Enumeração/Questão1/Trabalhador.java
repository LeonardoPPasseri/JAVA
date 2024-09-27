package poo_Udemy.Seção_12_Enumeração.Questão1;
import java.util.ArrayList;
import java.util.List;
public class Trabalhador {
    private String nome;
    private Nivel nivelTrabalhador;
    private Double salario;

    //associações
    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador(String nome,Double salario,Nivel nivelTrabalhador,Departamento departamento){
        this.nome = nome;
        this.salario = salario;
        this.nivelTrabalhador = nivelTrabalhador;
        this.departamento = departamento;
    }

    public void adicionarContrato(ContratoHora contrato){
        contratos.add(contrato);
    }
    public void removerContrato(ContratoHora contrato){
        contratos.remove(contrato);
    }

    public Double renda(int ano,int mes){
        double soma = salario;
        for (ContratoHora cont : contratos) {
            int cont_ano = cont.getData().getYear(); //Pega a data do contrato e extrai o ano dela (yyyy)
            int cont_mes = cont.getData().getMonthValue();
            System.out.println(cont_ano);
            System.out.println(cont_mes);
            if(cont_ano == ano && cont_mes == mes){
                soma += cont.valorTotal();
            }
        }
        return soma;
    }

// ================ set e get 

    public Nivel getNivelTrabalhador() {
        return nivelTrabalhador;
    }
    public void setNivelTrabalhador(Nivel nivelTrabalhador) {
        this.nivelTrabalhador = nivelTrabalhador;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public List<ContratoHora> getContratos() {
        return contratos;
    }

}
