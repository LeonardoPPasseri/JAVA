package poo_Faculdade.Provas.P1.P1_2022_1.Questão1;

public class Planta  {
    private String id;
    private String nome;
    private double tamanho;

    Planta(String id){
        setId(id);
    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public String toString(){
        return id+nome+tamanho;
    }
}
