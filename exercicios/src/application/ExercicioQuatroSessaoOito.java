package application;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class ExercicioQuatroSessaoOito {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many dollars will be bought? ");
		double value = sc.nextDouble();
		
		System.out.print("What is the dollar price? ");
		double valor = sc.nextDouble();
		
		double conta = CurrencyConverter.calcDollar(valor, value);
		
		System.out.printf("Vc precisa %.2%", CurrencyConverter.calcDollar(conta, value));
	
		sc.close();
	}

}
