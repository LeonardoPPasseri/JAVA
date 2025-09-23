package Padroes_De_Software.Atividade1.Subsistemas_Facade;

public class VerifDisponVoo {
    private boolean disponibilidade = true;
    private String origem;
    private String destino;

    protected boolean isDisponivel(String origem, String destino) {
        if(disponibilidade){
            this.destino = destino;
            this.origem = origem;
            return true; 
        }else{ 
            System.out.println("Voos indisponiveis");
            return false;
        }
    }

    protected void reservarVoo() {
        System.out.println("Voo com origem ["+origem+"] com destino a ["+destino+"] reservado com sucesso!");
    }
}
