package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class ExercicioBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;

		System.out.println("Enter account number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holderAccount = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char letter = sc.next().charAt(0);
		if (letter == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialVallue = sc.nextDouble();
			banco = new Banco(numberAccount, holderAccount, initialVallue);
		} else {
			banco = new Banco(numberAccount, holderAccount);
		}

		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(banco);

		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		banco.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(banco);

		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		banco.saques(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(banco);

		sc.close();
	}

}
