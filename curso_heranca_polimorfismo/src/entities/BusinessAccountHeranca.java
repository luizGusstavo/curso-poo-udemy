package entities;

public class BusinessAccountHeranca extends AccountHeranca {
	private Double loanLimit;

	public BusinessAccountHeranca() {
		super();
	}

	public BusinessAccountHeranca(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit)
			balance += amount - 10.0;
	}
	
	public void withdraw(double amount) {
		super.withdraw(amount); // CHAMA A CLASSE WITHDRAW DA SUPERCLASSE (UTILIZANDO AS REGRAS QUE A CLASSE WITHDRAW TEM NA SUPERCLASSE )
		balance -= 2.0;
	}
}