package poo_Faculdade.Aula5_Herança_Polimorf.QuestõesHerança.Questão6;

public class Processa {
    public static void main(String[] args) {
    Processa s = new Processa();
    System.out.println(s.calcula(2,3)); 
    //Criação de um objeto "s" para chamar o metodo
    }
    public double calcula(double a, double b) {
    return (a+b) * (a*0.1) + (b*0.9);
    }
    }