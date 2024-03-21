package poo_Faculdade.Aula5_Herança_Polimorf.QuestõesHerança.Questão2;

public class Velho extends Imovel {
    
    public double getPreço(){
        return super.getPreço()*0.9;
    }
}
