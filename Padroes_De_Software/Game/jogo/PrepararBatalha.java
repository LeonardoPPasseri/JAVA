package Padroes_De_Software.Game.jogo;

import java.util.ArrayList;
import java.util.List;

import Padroes_De_Software.Game.Inimigos.Esqueleto;
import Padroes_De_Software.Game.Personagem.Personagem;

public class PrepararBatalha { // Classe que prepara o inicio do jogo
    private int quant;
    private List<Personagem> inimigos = new ArrayList<Personagem>();
	private ArrayList<Personagem> lutadores = new ArrayList<Personagem>();

    public List<Personagem> gerarInimigos(Mediator m) {
        //Gerar inimigos e adicionar na lista
        quant = 3; // Quantidade fixa de inimigos por enquanto
		for (int i = 1; i <= quant; i++) {
			inimigos.add(new Esqueleto("Esqueleto"+ i,m));
		}
        return inimigos;
	}

    public ArrayList<Personagem> gerarLutadores(Personagem heroi) {
        //Adicionar herói e inimigos na lista de lutadores
        lutadores.add(heroi);
		for (Personagem p: inimigos) {
			lutadores.add(p);
		}
        return lutadores;
    }
}
