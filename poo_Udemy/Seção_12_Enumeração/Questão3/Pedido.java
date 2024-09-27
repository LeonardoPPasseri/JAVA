package poo_Udemy.Seção_12_Enumeração.Questão3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDateTime momento;
    private OrdemPedido status;
    private List<ItemPedidos> lista = new ArrayList<>();

    Pedido(){
        this.momento = LocalDateTime.now();
        this.status = OrdemPedido.valueOf("PAGAMENTO_PENDENTE");
    }
    Pedido(LocalDateTime momento, OrdemPedido status){
        this.momento = momento;
        this.status = status;
    }

    public void addPedido(ItemPedidos produto){
        lista.add(produto);
    }
    public void removerPedido(ItemPedidos produto){
        lista.remove(produto);
    }

    public Double total(){
        Double total = 0.0;
        for (ItemPedidos p : lista) {
            total += p.subTotal() ;
        }
        return total;
    }



    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }
    public LocalDateTime getMomento() {
        return momento;
    }
    public void setStatus(OrdemPedido status) {
        this.status = status;
    }
    public OrdemPedido getStatus() {
        return status;
    }
    public List<ItemPedidos> getLista() {
        return lista;
    }
}
