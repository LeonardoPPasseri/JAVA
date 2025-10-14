package Padroes_De_Software.Game.jogo;

import Padroes_De_Software.Game.Personagem.Personagem;

public class Heroi extends Personagem {

    public Heroi(String nome, Mediator m) {
        super(nome, 300 , 30, 10, m);
    }
    
}
