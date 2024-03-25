package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;

public class PesoMedio extends Lutador {
    public PesoMedio(String nome,int idade,double peso){
        super(nome,idade,peso);
    }
    private final int ID = 3;

    public String categoriaLutador(){
        return "PesoMedio";
    }
    
    public String getNome(){
        return super.getNome();
    }
    public int getIdade(){
        return super.getIdade();
    }
    public double getPeso(){
        return super.getPeso();
    }
    public String toString(){
        return (getNome() + "/" + getIdade() + "/" + getPeso());
    }
    public int getID() {
        return ID;
    }
}
