package entities;

public class Banco {
	private int accountNumber = 0;
	private String accountHolder;
	private double initialValue;

	public Banco(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	
	public Banco(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public void deposito(double value) {
		this.initialValue += value;
	}
	
	public void saques(double value) {
		this.initialValue -= value;
		this.initialValue -= 5.00;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getInitialValue() {
		return initialValue;
	}

	public void deposit(double amount) {
		initialValue += amount;
	}
	
	public void withdraw(double amount) {
		initialValue -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ accountHolder
				+ ", Balance: $ "
				+ String.format("%.2f", initialValue);
	}
	
}