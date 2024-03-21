package poo_Faculdade.Aula5_Herança_Polimorf.QuestõesHerança.Questão5;

public class Processa {
    public static void main(String[] args) {
    System.out.println(new Processa().calcula(2,3)); 
    //Criação de um objeto generico para chamar o metodo
    }
    public double calcula(double a, double b) {
    return (a+b) * (a*0.1) + (b*0.9);
    }
    }
