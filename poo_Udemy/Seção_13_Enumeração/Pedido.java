package poo_Udemy.Seção_13_Enumeração;
import java.util.Date;
//import java.util.Scanner;

public class Pedido {
    private Integer id;
    private Date momento;
    private OrdemDeStatus status;

    public Pedido(){
    }
    public Pedido(int id,Date momento,OrdemDeStatus status){
        this.id = id;
        this.momento = momento;
        this.status = status;
    }
    
    public Integer getId() {
        return id;
    }
    public Date getMomento() {
        return momento;
    }
    public OrdemDeStatus getStatus() {
        return status;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setMomento(Date momento) {
        this.momento = momento;
    }
    public void setStatus(OrdemDeStatus status) {
        this.status = status;
    }
    /* 
    @Override 
    Usado para avisar que em caso de alteração na sobrescrição ira avisar 
    que não existe na superClasse um metodo que seria sobreescrita por essa 
    */
    public String toString(){ //Usado para retornar uma string quando for pedido para printar um objeto
        return "ID: " + id + ", DATA: " + momento + ", Status: " + status;
        }
    }
