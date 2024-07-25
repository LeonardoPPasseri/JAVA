package poo_Udemy.Seção_14_Herança_Polimorfismo.Questão1;

public class Funcionarios {
    private String nome;
    private Integer horas;
    private Double valorPorHora;

    Funcionarios(){   
    }
    Funcionarios(String nome,Integer horas,Double valorPorHora){
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }
    public Double pagamento(){
        return valorPorHora * horas;
    }
    public String toString(){
        return (getNome() +  " - " + pagamento());
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public Integer getHoras() {
        return horas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    public Double getValorPorHora() {
        return valorPorHora;
    }
}
