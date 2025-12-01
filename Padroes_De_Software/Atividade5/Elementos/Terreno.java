package Padroes_De_Software.Atividade5.Elementos;

public class Terreno extends Elemento {
    private String tipo;
    
    public Terreno(String nome, int x, int y, String tipo) {
        super(nome, x, y);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    @Override
    public Terreno clone() {
        return new Terreno(this.nome, this.x, this.y, this.tipo);
    }
    
    @Override
    public String toString() {
        return super.toString() + " [Tipo: " + tipo + "]";
    }
}
