package Padroes_De_Software.Atividade5.Elementos;

public class Construcao extends Elemento {
    private int capacidade;
    
    public Construcao(String nome, int x, int y, int capacidade) {
        super(nome, x, y);
        this.capacidade = capacidade;
    }
    
    public int getCapacidade() {
        return capacidade;
    }
    
    @Override
    public Construcao clone() {
        return new Construcao(this.nome, this.x, this.y, this.capacidade);
    }
    
    @Override
    public String toString() {
        return super.toString() + " [Capacidade: " + capacidade + "]";
    }
}
