package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;

public class MeioPesado extends Lutador{
    public MeioPesado(String nome,int idade,double peso){
        super(nome,idade,peso);
    }
     private final int ID = 2;

    public String categoriaLutador(){
        return "MeioPesado";
    }
    
}
