package poo_Udemy.Seção_13_Enumeração.Questão1;
import java.time.LocalDate;
public class ContratoHora {
    private LocalDate data;
    private Double valorHora;
    private Integer horas;

    public ContratoHora(LocalDate data,Double valorHora,int horas){
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }
    public double valorTotal(){
        return valorHora * horas;
    }


    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public Double getValorHora() {
        return valorHora;
    }
    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
