package poo_Faculdade.Provas.P2.P2_2022_01.Questão1;

public class Estrela extends CorpoCeleste{
    public Estrela(String id){
        super(id);
    }

    @Override
    public String toString(){
        return "[Planeta] " + super.toString() ;
    }
}
