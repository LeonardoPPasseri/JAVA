package poo_Udemy.Seção_13_Herança_Polimorfismo.Resumos_Aulas.Classes_Metodos_Abstratas.Metodos_abstratos;

public class Circulo extends Forma {
    private Double raio;

    public Circulo(){
        super();
    }
    public Circulo(Cor cor, Double raio){
        super(cor);
        this.raio = raio;
    }
    
    public double area(){
        return 3.16*raio*raio;
    } 

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    public Double getRaio() {
        return raio;
    }
}
