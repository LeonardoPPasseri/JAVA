package Questão1;

public class LivroDeLivraria extends Livro {
    private boolean vendido;

    public LivroDeLivraria(int ano, boolean vendido){
        super(ano);
        //É necessario chamar a classe mãe sempre que for criar um construtor na classe filha
        this.vendido = vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }public boolean getVendido(){
        return vendido;
    }
}
