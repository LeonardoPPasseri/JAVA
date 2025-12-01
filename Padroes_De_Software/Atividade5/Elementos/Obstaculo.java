package Padroes_De_Software.Atividade5.Elementos;

public class Obstaculo extends Elemento {
    private int altura;
    
    public Obstaculo(String nome, int x, int y, int altura) {
        super(nome, x, y);
        this.altura = altura;
    }
    
    public int getAltura() {
        return altura;
    }
    
    @Override
    public Obstaculo clone() {
        return new Obstaculo(this.nome, this.x, this.y, this.altura);
    }
    
    @Override
    public String toString() {
        return super.toString() + " [Altura: " + altura + "]";
    }
}
