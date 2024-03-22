package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;

public class PesoPesado extends Lutador {
    
    public PesoPesado(String nome,int idade,double peso){
        super(nome,idade,peso);
    }
    static int id = 1;
    
    public String categoriaLutador(){
        return "PesoPesado";
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
}
