package jogo;

import Personagem.Personagem;

public class Heroi extends Personagem {

    public Heroi(String nome, Mediator m) {
        super(nome, 300 , 30, 10, m);
    }

    public void atacar(int idInimigo) {
        Personagem ini = mediador.inimigos.get(idInimigo); // agora usa mediador da superclasse
        if (ini.getVida() == 0) {
            System.out.println("O inimigo " + ini.getNome() + " já está morto!");
        } else {
            int dano = (int) rand.nextDouble(danoBasico * 0.2, danoBasico * 1.2);
            mediador.atacar(this, ini, dano);
        }
    }
}
