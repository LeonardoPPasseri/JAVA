package poo_Faculdade.Provas.P1_2024_1.Questão_2;

public class Produto {
    protected String id;
    private String cor;
    private double preço;

    public Produto(String id){
        this.id = id;
    }

    public String toString(){
        return ("Produto: "+ id + " " + cor + " $" + preço);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }public String getCor() {
        return cor;
    }public void setId(String id) {
        this.id = id;
    }public String getId() {
        return id;
    }public void setPreço(double preço) {
        this.preço = preço;
    }public double getPreço() {
        return preço;
    }
}
