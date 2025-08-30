package poo_Faculdade.Padroes_De_Software.Atividade1;

public class VerifDisponVoo {
    private boolean disponibilidade = true;

    public boolean dispVoo(String origem, String destino){
        if(!disponibilidade){
            System.out.println("Voos indisponiveis");
            return false;
        }else{ 
            disponibilidade = false;
            System.out.println("Voo com origem ["+origem+"] com destino a ["+destino+"] reservado com sucesso!");
            return true;
        }
    }
}
