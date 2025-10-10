package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Inimigos.Esqueleto;
import Personagem.Personagem;
import Rodadas.ListaDeRodadas;

public class Mediator {
	private Personagem heroi;
	private int danoReal;
	Scanner sc = new Scanner(System.in);
	
	//Coleção de inimigos
	protected List<Personagem> inimigos = new ArrayList<Personagem>();
	ArrayList<Personagem> lutadores = new ArrayList<Personagem>();
	
	//Deve haver uma forma de adicionar inimigos na coleção
	//ou já inicia com uma quantidade pré-definida
	public void prepararBatalha(Personagem heroi, int quant) {
		this.heroi = heroi;
		quant = 3;
		for (int i = 1; i <= quant; i++) {
			inimigos.add(new Esqueleto("Esqueleto"+ i,this));
		}
		
		lutadores.add(heroi);
		for (Personagem p: inimigos) {
			lutadores.add(p);
		}//Lista de lutadores para rodada
		

	}

	public void gerarRodada(ListaDeRodadas lista) {
	
		int alvo = 0;
		int rodada = 1;
		do{
			for (Personagem atacante : lutadores) {
				if(heroi.getVida() == 0) {
					System.out.println("O herói morreu! Fim de jogo!");
					return;
				}
				if(atacante != heroi) {
					atacante.atacar(heroi);
					lista.adicionarRodada(rodada, atacante.getNome(), heroi.getNome(), danoReal);
				}else{
					System.out.println("Digite o alvo que deseja atacar:[1 - " + inimigos.size() + "]");
					alvo = sc.nextInt() - 1;
					if (alvo >= 0 && alvo < inimigos.size()) {
						Personagem inimigo = inimigos.get(alvo);
						if(inimigo.getVida() == 0) {
							inimigos.remove(alvo);
							System.out.println("O inimigo " + inimigo.getNome() + " ja esta morto! Escolha outro alvo.");
							continue;
						}
					} else {
						System.out.println("Alvo inválido! Tente novamente.");
						continue;
					}
					((Heroi) atacante).atacar(alvo);
					lista.adicionarRodada(rodada, atacante.getNome(), heroi.getNome(), danoReal);
				}
			}
			rodada++;
		}while(heroi.getVida() > 0 && inimigos.size() > 0);
		//Enquanto o herói estiver vivo e houver inimigos
	}
	
	public void atacar(Personagem p, Personagem inimigo, int valor) {
		inimigo.defender(valor);
	}

	public void defender(Personagem p, int danoReal) {
		this.danoReal = danoReal;
		System.out.println(p.getNome() + " defendeu e recebeu " + danoReal + " de dano");
		p.perderVida(danoReal);
	}

	//Opcional
	//Método para imprimir os dados da coleção de inimigos
	public void imprimeStatus() {
		heroi.getStatus();
		for (Personagem p : inimigos) {
			p.getStatus();
		}
	}
}
