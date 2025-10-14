package Padroes_De_Software.Game.Personagem;

import java.util.Random;

import Padroes_De_Software.Game.jogo.Mediator;

public abstract class Personagem {
	protected String nome;
    protected int vida;
	protected String status = "vivo";
    protected int danoBasico;
    //protected int rodadasParaAtacar;
    protected int defesaBasica;
    protected Mediator mediador;
    protected Random rand = new Random();
	
	public Personagem(String nome, int vida, int danoBasico, int defesaBasica, Mediator m) {
        this.nome = nome;
		this.vida = vida;
		this.danoBasico = danoBasico;
		this.defesaBasica = defesaBasica;
        this.nome = nome;
		this.mediador = m;
        rand.setSeed(System.currentTimeMillis());
    }

	public void perderVida(int valor){
		vida -= valor;
        if(vida <= 0){
            status = "morto";
			vida = 0;
        }
    }

	/*
	protected void ganhaVida(int valor) {
		vida += valor;
	}
	*/

	public void getStatus(){
        // Nome, dano basico, vida e rodadas que faltam para ele vai atacar 
        System.out.println("Nome: " + nome +"( "+ status +" )  | Vida: " + vida);
    }

    public String getNome(){
        return this.nome;
    }
	public int getVida(){
		return this.vida;
	}


	
    public int atacar() {
        int dano = (int) rand.nextDouble(danoBasico * 0.2, danoBasico * 1.2);
        return dano;
    }
    public int defender(int ataque){
		int defesa = (int) rand.nextDouble(defesaBasica*0.2 , defesaBasica*1.2);
		int danoReal;
		if(defesa >= ataque){
			danoReal = 0;
		}else{
			danoReal = ataque - defesa;
		}
		return danoReal;
    }
}
