package poo_Faculdade.Provas.P1.P1_2023_01.Questão1;

public class Biscoito {
    private String id;
    private String cor;
    private int preço;

    Biscoito(String id){
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public int getPreço() {
        return preço;
    }
    public String toString(){
        return id+cor+preço;
    }
}
