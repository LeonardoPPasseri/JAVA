package poo_Udemy.Seção_13_Herança_Polimorfismo.Resumos_Aulas.Herança_Casting_Instanceof;

public class Resumo {
    
    /*
     * Herança é uma associação que permite que uma classe HERDE TODOS os dados e comportamentos de outra
     * REUSO e POLIMORFISMO
     * class A extends B{
     * } 
     * 
     * Protected  ==> Usado quando a subclasse precisa acessar um atributo que esta na superClasse
     * 
     * ==================================================================
     * superclasse Account
     * Subclasse BusinessAccount 
     * subclasse SavingAccount
     *  
        
        // UPCASTING
     * Quando uma variavel da superclasse APONTA para um objeto da subclasse
     * É possivel apartir disso, a variavel usar os metodos da subclasse
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
        Account acc1 = bacc;

    *******************
        // DOWNCASTING
     * Quando uma variavel da subclasse APONTA para um objeto da superclasse
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        BusinessAccount acc3 = (BusinessAccount)acc2;
     * É necessario colocar o casting(BusinessAccount) para que o programa saiba que a variavel da superclasse ja estava apontando para um objeto da subclasse BusinessAccount.
     
    ********************    
        //Perceba que não é possivel fazer downcasting de uma subclasse para outra subclasse
        Account acc4 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc5 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
        BusinessAccount acc6 = (BusinessAccount)acc5; -->ERRO
     * acc5 aponta para um objeto da subclasse SavingsAccount 
     * acc6 nao poderia receber esse objeto pois não possuem relação "é-um"
     * Elas não possuem relação
     
    ********************
        //INSTANCEOF
     * Serve como um "é igual a"
     * Ele analisa se o objeto da variavel acc3 é um BusinessAccount, e retorna um valor Boolean 
     * OBS: Ele analisa qual a classe do OBJETO
     
        if (acc3 instanceof BusinessAccount) {
        BusinessAccount acc5 = (BusinessAccount)acc3;
        acc5.loan(200.0);
        System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
        SavingsAccount acc5 = (SavingsAccount)acc3;
        acc5.updateBalance();
        System.out.println("Update!");
        }
    */
}
