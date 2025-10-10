package main;

import jogo.Mediator;
import jogo.Heroi;
import Personagem.Personagem;
import Rodadas.ListaDeRodadas;


public class Cliente {

	public static void main(String[] args) {

		//Cria um objeto Mediator
		Mediator med = new Mediator();
		
		//Cria os personagens (heroi)
		Heroi heroi = new Heroi("Artur",med);

		//Preparação: cria os inimigos
		med.prepararBatalha(heroi, 0);
		
		//Cria a lista de rodadas
		ListaDeRodadas rodadas = new ListaDeRodadas(med);

		med.gerarRodada(rodadas);
		
		//Faz ataques

		
		//Mostra atributos dos personagens (inimigos)
		//para ver se mediador funcionou
		med.imprimeStatus();
		
		
		
		
		//Podemos também delegar ao Mediator a criação 
		//do(s) herói(s)?
		
		
		//Como poderíamos evoluir para os inimigos também
		//poderem atacar o Herói?
	}
}
