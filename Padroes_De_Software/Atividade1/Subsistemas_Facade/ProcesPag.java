package Padroes_De_Software.Atividade1.Subsistemas_Facade;

public class ProcesPag {
    private double valor;

    protected boolean verificarPagamento(double valor) {
        if(valor>0){
            this.valor = valor;
            return true;
        }else {
            return false;
        }
    }

    protected void realizarPagamento() {
       System.out.println("Pagamento de R$"+ valor +" realizado com sucesso!");
    }
}
