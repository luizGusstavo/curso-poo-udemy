package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetorUm {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble(); // lendo os valores
		}
		
		double soma = 0.0;
		
		for(int i = 0; i < n; i++) {
			soma += vect[i]; // faz a soma dos valores 
		}
		
		double media = soma / n; // calcula a media dos valores do vetor
		
		sc.close();
	}
}
