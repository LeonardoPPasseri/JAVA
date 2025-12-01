package Padroes_De_Software.Atividade5.Elementos;

public abstract class Elemento implements Cloneable {
    protected String nome;
    protected int x;
    protected int y;
    
    public Elemento(String nome, int x, int y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    @Override
    public abstract Elemento clone();
    
    @Override
    public String toString() {
        return String.format("%s '%s' na posição (%d, %d)", 
            this.getClass().getSimpleName(), nome, x, y);
    }
}
