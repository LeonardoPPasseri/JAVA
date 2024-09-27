package poo_Udemy.Seção_13_Herança_Polimorfismo.Resumos_Aulas.Classes_Metodos_Abstratas.Metodos_abstratos;

public abstract class Forma {
    private Cor cor;

    public Forma(){
    }
    public Forma(Cor cor){
        this.cor = cor;
    }

    public abstract double area();//METODOS ABSTRATOS NAO POSSUEM CORPO

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    public Cor getCor() {
        return cor;
    }
}
