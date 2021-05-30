package entities;

public final class SavingsAccountHeranca extends AccountHeranca {
	// A PALAVRA FINAL DIZ QUE MINHA CLASSE N PODE GERAR UMA SUBCLASSE
	private Double interestRate;
	
	public SavingsAccountHeranca() {
		super();
	}

	public SavingsAccountHeranca(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override // INFORMA AO COMPILADOR QUE ESTÁ OCORRENDO UMA SOBREPOSIÇÃO
	// PASSO O METODO WITHDRAW ESPECIFICO PARA ESSA CLASSE
	public final void withdraw(double amount) { // A PALAVRA FINAL DIZ QUE MEU METODO N PODE SER SOBREPOSTO
		balance -= amount;
	}
}
