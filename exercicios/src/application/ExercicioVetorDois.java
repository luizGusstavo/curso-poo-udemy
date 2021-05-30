package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutosVetorExercicioDois;

public class ExercicioVetorDois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProdutosVetorExercicioDois[] vect = new ProdutosVetorExercicioDois[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProdutosVetorExercicioDois(name, price);
		}
		
		double soma = 0.0;
		
		for(int i = 0; i < n; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / n;
		
		sc.close();
	}
}
