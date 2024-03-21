package poo_Faculdade.Aula5_Herança_Polimorf.QuestõesHerança.Questão3;

/*
public class Processa {
    public static void main(String[] args) {
    System.out.println(calcula(2,3)); <---- ERRO, chamou um metodo não-Static de forma Static
    }
    public double calcula(double a, double b) {
    return (a+b) * (a*0.1) + (b*0.9);
    }
    }
*/
    /*
    O codigo está incorreto pois o METODO não é STATIC, por tanto para chamar ele seria necessario um objeto ou transforma-lo em Static.
    */

    /*
    Solucionar(1) esse erro: 
    
    public class Processa {
    public static void main(String[] args) {
        Processa a = new Processa();          ->Criação de um objeto

    System.out.println(a.calcula(2,3));       ->Chamando o metodo com o obejeto
    }
    public double calcula(double a, double b) {
    return (a+b) * (a*0.1) + (b*0.9);
    }
    }
    */

    /*
     Solucionar(2) esse erro: 
    
    public class Processa {
    public static void main(String[] args) {

    System.out.println(calcula(2,3));
    }
    public static double calcula(double a, double b) {  // ->Mudando o metodo para static
    return (a+b) * (a*0.1) + (b*0.9);
    }
    }
    */

