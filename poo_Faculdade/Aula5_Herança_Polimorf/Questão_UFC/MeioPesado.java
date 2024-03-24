package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;

public class MeioPesado extends Lutador{
    public MeioPesado(String nome,int idade,double peso){
        super(nome,idade,peso);
    }
    static int id = 2;

    public String categoriaLutador(){
        return "MeioPesado";
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
    public static int getId() {
        return id;
    }

    public String toString(){
        return (getNome() + "/" + getIdade() + "/" + getPeso());
    }
}
