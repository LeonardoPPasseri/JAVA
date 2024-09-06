package poo_Faculdade.Provas.P2.P2_2023_01_Final.Questão1;

public class LivroDeBiblioteca extends Livro{
    private boolean alugado;

    public LivroDeBiblioteca(int ano, boolean alugado){
        super(ano);
        this.alugado = alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }public boolean getAlugado(){
        return alugado;
    }
}
