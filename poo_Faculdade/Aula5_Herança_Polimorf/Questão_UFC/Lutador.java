package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;

public class Lutador {
    private String nome;
    private int idade;
    private double peso;
    String lut = (getNome() + "/" + getIdade() + "/" + getPeso());
    public Lutador(String nome,int idade,double peso){
        
    }
    public void possiveisLutas(Lutador lutadores){

    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getPeso(){
        return peso;
    }
}
