package poo_Faculdade.Provas.P1.P1_2022_1.Questão1;

public class Briofitas extends Planta {
    
    Briofitas(String id){
        super(id);
    }

    public String toString(){
        return "[Briofitas]"+super.getId()+super.getNome()+super.getTamanho();
    }
}
