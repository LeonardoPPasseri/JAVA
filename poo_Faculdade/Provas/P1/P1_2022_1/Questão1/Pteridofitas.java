package poo_Faculdade.Provas.P1.P1_2022_1.Questão1;

public class Pteridofitas extends Planta{
    
    Pteridofitas(String id){
        super(id);
    }

    public String toString(){
        return "[Pteridofitas]"+super.getId()+super.getNome()+super.getTamanho();
    }
}
