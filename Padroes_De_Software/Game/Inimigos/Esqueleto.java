package Padroes_De_Software.Game.Inimigos;

import Padroes_De_Software.Game.Personagem.Personagem;
import Padroes_De_Software.Game.jogo.Mediator;

public class Esqueleto extends Personagem implements Inimigo{
	public String nome = "Esqueleto";

	public Esqueleto(String nome, Mediator m) {
        super(nome, 50 , 15, 5, m);
    }

}
