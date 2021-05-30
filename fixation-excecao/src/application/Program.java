package application;

import java.util.Locale;
import java.util.Scanner;

import model.application.Account;
import model.exceptions.WithDrawException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
			Locale.setDefault(Locale.US);
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			double limitWithdraw = sc.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, limitWithdraw);
			
			System.out.println();
			System.out.println("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			
		try {
			account.withdraw(withdraw);
			System.out.print("New Balance: " + account.getBalance());
		}
		catch(WithDrawException excecao) {
			System.out.print("Withdraw error: " + excecao.getMessage());
		}
		
		sc.close();
	}

}
