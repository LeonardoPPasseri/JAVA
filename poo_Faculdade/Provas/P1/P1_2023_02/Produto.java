package poo_Faculdade.Provas.P1.P1_2023_02;

public class Produto {
    private String id;
    private String cor;
    private Double preço;

    Produto(String id){
        this.id = id;
    }

    public String toString(){
        return id+cor+preço;
    }
}
