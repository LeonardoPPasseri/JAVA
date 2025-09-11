package Padroes_De_Software.Atividade1;

public class ProcesPag {
    private double valor;

    public boolean verificarPagamento(double valor) {
        if(valor>0){
            this.valor = valor;
            return true;
        }else {
            return false;
        }
    }

    public void realizarPagamento() {
       System.out.println("Pagamento de R$"+ valor +" realizado com sucesso!");
    }
}
