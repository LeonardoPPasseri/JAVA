package Inimigos;

import Personagem.Personagem;
import jogo.Mediator;

public class Esqueleto extends Personagem implements Inimigo{
	public String nome = "Esqueleto";

	public Esqueleto(String nome, Mediator m) {
        super(nome, 50 , 15, 5, m);
    }

}
