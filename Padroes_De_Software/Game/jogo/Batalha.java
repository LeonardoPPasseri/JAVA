package Padroes_De_Software.Game.jogo;


public class Batalha {
    protected StatusBatalha statusBatalha = StatusBatalha.INICIO;
    private Mediator med;
    private int rodada;

    protected Batalha(Mediator med) {
        //Contrutor para receber os dados do mediator
        this.med = med;
    }

    private void iniciarRodada(){
        System.out.println("\n----- Rodada " + rodada + " -----");
        med.imprimeStatus();
    }

    protected void gerarBatalha() {
        rodada = 1;
        System.out.println("===============================");
        System.out.println("A batalha começou!");
        System.out.println("===============================");
        System.out.println();
        while (statusBatalha == StatusBatalha.EM_ANDAMENTO || statusBatalha == StatusBatalha.INICIO) {
            iniciarRodada();
            gerarRodada();
            med.verificarFimBatalha();
        }
        if(statusBatalha == StatusBatalha.FIM_DA_BATALHA){
            System.out.println("===============================");
            System.out.println("A batalha terminou!");
            System.out.println("===============================");
            med.imprimeStatus();
        }
    }

    public void gerarRodada() {
        while(statusBatalha == StatusBatalha.EM_ANDAMENTO || statusBatalha == StatusBatalha.INICIO){
            med.heroiAtaca();
            med.inimigoAtaca();
            statusBatalha = StatusBatalha.FIM_DA_RODADA;
        }
        rodada++;
        statusBatalha = StatusBatalha.EM_ANDAMENTO;
    }

}
        