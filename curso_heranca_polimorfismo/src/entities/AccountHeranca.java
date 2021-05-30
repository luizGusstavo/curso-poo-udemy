package entities;

public abstract class AccountHeranca {
	
	// CLASSE ABSTRATA N PODE SER INSTANCIADA
	private Integer number;
	private String holder;
	protected Double balance;
	
	public AccountHeranca() {
	}

	public AccountHeranca(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0; //operacao de saque
	}
	
	public void deposit(double amount) {
		balance += amount; // operacao de deposito
	}
	
}
