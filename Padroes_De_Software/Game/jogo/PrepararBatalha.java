package Padroes_De_Software.Game.jogo;

import java.util.ArrayList;

import Padroes_De_Software.Game.Inimigos.Esqueleto;
import Padroes_De_Software.Game.Personagem.Personagem;

public class PrepararBatalha { // Classe que prepara o inicio do jogo
    private int quant;
	private ArrayList<Personagem> lutadores = new ArrayList<Personagem>();

    public ArrayList<Personagem> gerarLutadores(Mediator m, Personagem heroi) {
        //Gerar inimigos e adicionar na lista
        quant = 3; // Quantidade fixa de inimigos por enquanto
        lutadores.add(heroi); // Adiciona o herói na lista de lutadores
		for (int i = 1; i <= quant; i++) {
			lutadores.add(new Esqueleto("Esqueleto"+ i,m));
		}
        return lutadores;
	}
}
