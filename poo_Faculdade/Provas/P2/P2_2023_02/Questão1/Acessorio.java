package poo_Faculdade.Provas.P2.P2_2023_02.Questão1;

public abstract class Acessorio {
    private String marca;
    private double preço;

    public Acessorio(String marca,double preço){
        this.marca = marca;
        this.preço = preço;
    }

    public abstract double calcularImposto();

    public String getMarca() {
        return marca;
    }public void setMarca(String marca) {
        this.marca = marca;
    }public Double getPreço() {
        return preço;
    }public void setPreço(Double preço) {
        this.preço = preço;
    }
}
