package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;

public class PesoPesado extends Lutador {
    
    public PesoPesado(String nome,int idade,double peso){
        super(nome,idade,peso);
    }
    @SuppressWarnings("unused")
    private final int ID = 1;
    
    public String categoriaLutador(){
        return "PesoPesado";
    }
   

}
