package poo_Udemy.Seção_14_Herança_Polimorfismo.Resumos_Aulas.Classes_Metodos_Abstratas.Classes_Abstratas;

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
}