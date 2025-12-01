package Padroes_De_Software.Atividade5.Elementos;

public class Unidade extends Elemento {
    private int pontosDeVida;
    
    public Unidade(String nome, int x, int y, int pontosDeVida) {
        super(nome, x, y);
        this.pontosDeVida = pontosDeVida;
    }
    
    public int getPontosDeVida() {
        return pontosDeVida;
    }
    
    @Override
    public Unidade clone() {
        return new Unidade(this.nome, this.x, this.y, this.pontosDeVida);
    }
    
    @Override
    public String toString() {
        return super.toString() + " [HP: " + pontosDeVida + "]";
    }
}
