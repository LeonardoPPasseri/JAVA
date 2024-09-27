package poo_Udemy.Seção_13_Herança_Polimorfismo.Resumos_Aulas.Sobreposição_Super_Overwide;

public class Resumo {
    

    /*
     * //Sobreposição
     * 
     * Account{  
     *  public void withdraw(double amout){
     *      balance -= amount + 5.0;
     *  }
     * }
     * 
     * SavingsAccount extends Account{
     *  @Override
     *  public void withdraw(double amount){
     *      balance -= amount;
     *  }
     * }
     * 
     * Perceba que são metodos com caras iguais mas conteudos diferentes.
     * Quando o objeto é do tipo SavingsAccount ele vai usar o proprio withdraw
     * 
     * 
     * //SUPER
     * @Override
     *  public void withdraw(double amount){
     *      super.withdraw(double amount);
     *      balance -= 2.0;
     *  }
     * 
     * 
     */
}
