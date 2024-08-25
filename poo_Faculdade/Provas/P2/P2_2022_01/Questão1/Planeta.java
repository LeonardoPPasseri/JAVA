package poo_Faculdade.Provas.P2.P2_2022_01.Questão1;

public class Planeta extends CorpoCeleste{
    
    public Planeta(String id){
        super(id);
    }

    @Override
    public String toString(){
        return "[Estrela] " + super.toString() ;
    }
}
