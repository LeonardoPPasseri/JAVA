package poo_Faculdade.Provas.P2.P2_2022_01.Questão1;


public class CorpoCeleste implements Comparable<CorpoCeleste> {
    private String id;
    private String nome;
    private double distancia; //anos-luz

    public CorpoCeleste(String id){
        this.id = id;
    }
    
    @Override
    public boolean equals(Object o){
        CorpoCeleste a = (CorpoCeleste)o;
        if(a.id == id){
            return true;
        }else{
            return false;
        }
    }
    
    @Override //Metodo do Comparable para dizer ao Collections.sort() como ele deve comparar e fazer a ordem
    public int compareTo(CorpoCeleste outroCorpoCeleste){
        if(this.distancia > outroCorpoCeleste.distancia){
            return -1;
        }if(this.distancia < outroCorpoCeleste.distancia){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " - Id: " + id + " - Distancia: " + distancia;
    }


    public double getDistancia() {
        return distancia;
    }public void setDistancia(double distancia) {
        this.distancia = distancia;
    }public String getId() {
        return id;
    }public void setId(String id) {
        this.id = id;
    }public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }

}
