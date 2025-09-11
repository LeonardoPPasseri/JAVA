package Padroes_De_Software.Atividade1;

public class VerifDisponVoo {
    private boolean disponibilidade = true;
    private String origem;
    private String destino;

    public boolean isDisponivel(String origem, String destino) {
        if(disponibilidade){
            this.destino = destino;
            this.origem = origem;
            return true; 
        }else{ 
            System.out.println("Voos indisponiveis");
            return false;
        }
    }

    public void reservarVoo() {
        System.out.println("Voo com origem ["+origem+"] com destino a ["+destino+"] reservado com sucesso!");
    }
}
