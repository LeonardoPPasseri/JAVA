package poo_Udemy.Seção_13_Herança_Polimorfismo.Resumos_Aulas.Polimorfismo;
import poo_Udemy.Seção_13_Herança_Polimorfismo.Demostração.Account;
import poo_Udemy.Seção_13_Herança_Polimorfismo.Demostração.BusinessAccount;

public class Resumo {
    public static void main(String[] args) {
        //Polimorfismo é quando variaveis de tipo generico apontam para objetos de tipos especificos e
        //podem ter comportamento diferentes conforme cada tipo

        Account acc = new Account(1001, "Alex", 1000.0);
		Account bacc = new BusinessAccount(1002, "Maria", 1000.0, 500.0);

        acc.withdraw(200);
        bacc.withdraw(200);
        System.out.println(acc.getBalance());
        System.out.println(bacc.getBalance());

    }
}
