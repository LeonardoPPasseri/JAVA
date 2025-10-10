package Rodadas;

class Rodada {
    int numero;
    String atacante;
    String defensor;
    int dano;
    Rodada proxima;

    public Rodada(int numero, String atacante, String defensor, int dano) {
        this.numero = numero;
        this.atacante = atacante;
        this.defensor = defensor;
        this.dano = dano;
        this.proxima = null;
    }
}
