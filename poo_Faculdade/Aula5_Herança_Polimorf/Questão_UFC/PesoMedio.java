package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;

public class PesoMedio extends Lutador {
    public PesoMedio(String nome,int idade,double peso){
        super(nome,idade,peso);
    }
    @SuppressWarnings("unused")
    private final int ID = 3;

    public String categoriaLutador(){
        return "PesoMedio";
    }
  
 
}
