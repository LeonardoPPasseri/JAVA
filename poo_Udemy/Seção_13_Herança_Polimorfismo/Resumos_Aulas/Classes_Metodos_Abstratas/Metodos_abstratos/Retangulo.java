package poo_Udemy.Seção_13_Herança_Polimorfismo.Resumos_Aulas.Classes_Metodos_Abstratas.Metodos_abstratos;

public class Retangulo extends Forma{
    private Double altura;
    private Double base;

    public Retangulo(){
        super();
    }
    public Retangulo(Cor cor, Double altura, Double base){
        super(cor);
        this.altura = altura;
        this.base = base;
    }

    public double area(){
        return altura * base;
    }
    
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getAltura() {
        return altura;
    }
    public void setBase(Double base) {
        this.base = base;
    }
    public Double getBase() {
        return base;
    }
}
