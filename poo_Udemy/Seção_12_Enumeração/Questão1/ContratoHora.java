package poo_Udemy.Seção_12_Enumeração.Questão1;
import java.util.Date;
public class ContratoHora {
    private Date data;
    private Double valorHora;
    private Integer horas;

    public ContratoHora(Date data,Double valorHora,int horas){
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }
    public double valorTotal(){
        return valorHora * horas;
    }


    
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
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
