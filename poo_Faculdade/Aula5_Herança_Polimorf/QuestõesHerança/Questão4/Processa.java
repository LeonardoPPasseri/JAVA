package poo_Faculdade.Aula5_Herança_Polimorf.QuestõesHerança.Questão4;

public class Processa {
    public static void main(String[] args) {
        Processa a = new Processa();         // ->Criação de um objeto

    System.out.println(a.calcula(2,3));      // ->Chamando o metodo com o obejeto
    }
    public double calcula(double a, double b) {
    return (a+b) * (a*0.1) + (b*0.9);
    }
    }
