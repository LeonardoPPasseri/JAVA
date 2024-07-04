package poo_Udemy.Seção_13_Enumeração.Questão1;
import java.util.ArrayList;
import java.util.Calendar;
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
        Calendar cal = Calendar.getInstance();
       
        for (ContratoHora cont : contratos) {
            cal.setTime(cont.getData());
            int cont_ano = cal.get(Calendar.YEAR);
            int cont_mes = 1 + cal.get(Calendar.MONTH);
            if(cont_ano == ano && cont_mes == mes){
                soma += getSalario();
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
