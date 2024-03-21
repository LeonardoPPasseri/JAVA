package poo_Faculdade.Aula5_Herança_Polimorf.QuestõesHerança.Questão2;

public class Novo extends Imovel {
    
    public double getPreço(){
        return super.getPreço()*1.1; //É necessario o uso do "super." para avisar que esse getPreço() é da superclasse
    }
}
