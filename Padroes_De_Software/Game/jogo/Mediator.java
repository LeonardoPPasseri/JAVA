package Padroes_De_Software.Game.jogo;

import java.util.ArrayList;
import Padroes_De_Software.Game.Personagem.Personagem;

public class Mediator {
	private Personagem heroi;
	protected ArrayList<Personagem> lutadores;
    private Batalha batalha;
    private int qtdInimigos;
    private int alvo; //Não é necessario criar o alvo sempre que for atacar

    public void iniciarJogo(Personagem heroi) {// Método que inicia o jogo
        this.heroi = heroi;
        PrepararBatalha PrepararBatalha = new PrepararBatalha();
        this.lutadores = PrepararBatalha.gerarLutadores(this,heroi);
    }

    public void gerarBatalha() {
        this.batalha = new Batalha(this);
        batalha.gerarBatalha();
    }

    public void heroiAtaca() {
        qtdInimigos = lutadores.size() - 1;
        System.out.print("\nEscolha um inimigo para atacar [1 - 3]:");
        alvo = InputHandler.readInt(qtdInimigos); // Não precisa ajustar pois o heroi é o lutador [0]. 
        Personagem inimigo = lutadores.get(alvo);

        while(inimigo.getVida() <= 0){
            System.out.println("O inimigo " + inimigo.getNome() + " já está morto! Escolha outro alvo.");
            System.out.print("\nEscolha um inimigo para atacar [1 - 3]:");
            alvo = InputHandler.readInt(qtdInimigos);
            inimigo = lutadores.get(alvo);
        }

        int dano = heroi.atacar();
        int danoReal = inimigo.defender(dano);
        inimigo.perderVida(danoReal);
        StatusAtaque(heroi, inimigo, danoReal);

        if(inimigo.getVida() <= 0){
            System.out.println("O inimigo " + inimigo.getNome() + " foi derrotado!");
        }
    }

    public void inimigoAtaca() {
        qtdInimigos = lutadores.size() - 1;
        // Cada inimigo vivo ataca o herói
        for (int i = 1; i <= qtdInimigos; i++) {
            Personagem inimigo = lutadores.get(i);
            if(inimigo.getVida() > 0) {int dano = inimigo.atacar();
                int danoReal = heroi.defender(dano);
                heroi.perderVida(danoReal);
                StatusAtaque(inimigo, heroi, danoReal); 
                if (heroi.getVida() <= 0) {
                    System.out.println("O herói " + heroi.getNome() + " foi derrotado!");
                    batalha.statusBatalha = StatusBatalha.FIM_DA_RODADA;
                    break; // Sai do loop se o herói morrer
                }
            }
        }
    }


    public void verificarFimBatalha(){
        int inimigosVivos = 0;
        for (Personagem p : lutadores) {
            if(p.getVida() > 0 && p != heroi){
                inimigosVivos++;
            }
        }
        if(inimigosVivos == 0){
            batalha.statusBatalha = StatusBatalha.FIM_DA_BATALHA;
        }
    }

    public void StatusAtaque(Personagem atacante, Personagem defensor, int danoReal) {
        System.out.println("" + atacante.getNome() + " atacou " + defensor.getNome() + " e causou " + danoReal + " de dano.");
    }


	public void atacar(Personagem inimigo, int valor) {
		inimigo.defender(valor);
	}

	public void defender(Personagem p, int danoReal) {
		System.out.println(p.getNome() + " defendeu e recebeu " + danoReal + " de dano");
		p.perderVida(danoReal);
	}

	//Método para imprimir os dados da coleção de lutadores
	public void imprimeStatus() {
		for (Personagem p : lutadores) {
			p.getStatus();
		}
	}
}
