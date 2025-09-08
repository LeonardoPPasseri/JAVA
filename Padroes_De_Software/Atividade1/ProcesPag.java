package Padroes_De_Software.Atividade1;

public class ProcesPag {
    public boolean VerificacaoPag(float valor){
        if(valor > 0){
            System.out.println("Pagamento de R$"+ valor +" realizado com sucesso!");
            return true;
        }else{
            System.out.println("Erro: valor inválido para pagamento");
            return false;
        }
    }
}
