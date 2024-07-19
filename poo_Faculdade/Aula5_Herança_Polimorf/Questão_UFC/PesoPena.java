package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;

public class PesoPena extends Lutador{
    public PesoPena(String nome,int idade,double peso){
        super(nome,idade,peso);
    }
    @SuppressWarnings("unused")
    private final int ID = 4;

    public String categoriaLutador(){
        return "PesoPena";
    }
    

}

