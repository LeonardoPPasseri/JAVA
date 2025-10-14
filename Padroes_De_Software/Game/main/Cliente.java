package Padroes_De_Software.Game.main;

import Padroes_De_Software.Game.jogo.Mediator;
import Padroes_De_Software.Game.jogo.Heroi;


public class Cliente {

	public static void main(String[] args) {

		//Cria um objeto Mediator
		Mediator med = new Mediator();
		
		//Cria os personagens (heroi)
		Heroi heroi = new Heroi("Artur",med);

		//Preparação: cria os inimigos
		med.iniciarJogo(heroi);

		med.gerarBatalha();
		//Faz ataques


		
		
		
		
		//Podemos também delegar ao Mediator a criação 
		//do(s) herói(s)?
		
		
		//Como poderíamos evoluir para os inimigos também
		//poderem atacar o Herói?
	}
}
