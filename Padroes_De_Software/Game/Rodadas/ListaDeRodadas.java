package Rodadas;

import Personagem.Personagem;
import jogo.Mediator;

public class ListaDeRodadas {
    private Rodada primeira;
    public Mediator mediador;

    public ListaDeRodadas(Mediator m) {
        this.primeira = null;
        this.mediador = new Mediator();
    }

    // Adiciona uma nova rodada no final da lista
    public void adicionarRodada(int numero, String atacante, String defensor, int dano) {
        Rodada nova = new Rodada(numero, atacante, defensor, dano);

        if (primeira == null) {
            primeira = nova;
        } else {
            Rodada atual = primeira;
            while (atual.proxima != null) {
                atual = atual.proxima;
            }
            atual.proxima = nova;
        }
    }

    // Mostra todas as rodadas
    public void exibirRodadas() {
        Rodada atual = primeira;
        while (atual != null) {
            System.out.println("Rodada " + atual.numero + ": " + atual.atacante + 
                               " atacou " + atual.defensor + 
                               " causando " + atual.dano + " de dano.");
            atual = atual.proxima;
        }
    }

    // Soma total de dano
    public int calcularDanoTotal() {
        int total = 0;
        Rodada atual = primeira;
        while (atual != null) {
            total += atual.dano;
            atual = atual.proxima;
        }
        return total;
    }

    // Remove uma rodada pelo número
    public void removerRodada(int numero) {
        if (primeira == null) return;

        if (primeira.numero == numero) {
            primeira = primeira.proxima;
            return;
        }

        Rodada atual = primeira;
        while (atual.proxima != null && atual.proxima.numero != numero) {
            atual = atual.proxima;
        }

        if (atual.proxima != null) {
            atual.proxima = atual.proxima.proxima;
        }
    }
}
