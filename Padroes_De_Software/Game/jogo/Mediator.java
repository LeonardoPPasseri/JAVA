package Padroes_De_Software.Game.jogo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Padroes_De_Software.Game.Inimigos.Esqueleto;
import Padroes_De_Software.Game.Personagem.Personagem;

public class Mediator {
	private Personagem heroi;
	
	//Coleção de inimigos
	protected List<Personagem> inimigos = new ArrayList<Personagem>();
	protected ArrayList<Personagem> lutadores = new ArrayList<Personagem>();

    public void iniciarJogo(Personagem heroi) {// Método que inicia o jogo
        this.heroi = heroi;
        PrepararBatalha PrepararBatalha = new PrepararBatalha();
        inimigos = PrepararBatalha.gerarInimigos(this);
        lutadores = PrepararBatalha.gerarLutadores(heroi);
    }

	public void gerarRodada() {
    int rodada = 1;
    int alvo = 0; // Inicializa alvo aqui
    Personagem inimigo = null; // Inicializa inimigo aqui
    ArrayList<Personagem> inimigosMortos = new ArrayList<>(); // Cria uma lista para auxiliar a remoção

    while (heroi.getVida() > 0 && !inimigos.isEmpty()) {
        System.out.println("\n----- Rodada " + rodada + " -----");
        imprimeStatus();

        // Usamos um iterador para evitar problemas ao remover elementos
        Iterator<Personagem> iterator = lutadores.iterator();

        while (iterator.hasNext()) {
            
            Personagem atacante = iterator.next();

            // Se o atacante morreu, ele é removido da lista de lutadores
            if (atacante.getVida() <= 0) {
                System.out.println(atacante.getNome() + " foi removido da batalha!");
                inimigosMortos.add(atacante);//aqui o inimigo morto é adicionado a lista
                continue;
            }

            // Se o herói morreu, encerramos o jogo
            if (heroi.getVida() <= 0) {
                System.out.println("O herói morreu! Fim de jogo!");
                return;
            }

            // Caso o atacante seja um inimigo
            if (atacante != heroi) {
                atacante.atacar(heroi);

                if (heroi.getVida() <= 0) {
                    System.out.println("O herói morreu! Fim de jogo!");
                    return;
                }

            } else { // Caso o atacante seja o herói
                if (inimigos.isEmpty()) break;

                // InputHandler para ler o alvo
                System.out.println("Escolha o inimigo para atacar [1 - " + inimigos.size() + "]:");
                alvo = InputHandler.readInt(inimigos.size()) - 1;
            
                inimigo = inimigos.get(alvo);

                if (inimigo.getVida() <= 0) {
                    System.out.println("O inimigo " + inimigo.getNome() + " já está morto! Escolha outro alvo.");
                    continue;
                }

                ((Heroi) atacante).atacar(inimigo);

                // Se o inimigo morreu após o ataque, remove ele da lista de inimigos e lutadores
                if (inimigo.getVida() <= 0) {
                    System.out.println(inimigo.getNome() + " foi derrotado!");
                    inimigos.remove(inimigo);
                    inimigosMortos.add(inimigo); // Adiciona o inimigo morto à lista auxiliar
                }
            }
        }
        lutadores.removeAll(inimigosMortos); // Remove todos os inimigos mortos da lista de lutadores
        inimigosMortos.clear(); // Limpa a lista auxiliar para a próxima rodada
        rodada++;
    }

    if (heroi.getVida() > 0) {
        System.out.println("Todos os inimigos foram derrotados! Vitória!");
    } else {
        System.out.println("O herói morreu! Fim de jogo!");
    }
}

	
	public void atacar(Personagem p, Personagem inimigo, int valor) {
		inimigo.defender(valor);
	}

	public void defender(Personagem p, int danoReal) {
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
