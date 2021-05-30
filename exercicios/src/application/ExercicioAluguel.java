package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class ExercicioAluguel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10]; //iniciando um vetor de tamanho 10 chamado de aluguel
		
		System.out.println("Quantos quartos serão alugados ?");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name");
			sc.nextLine();
			String name = sc.nextLine(); // leio o nome que foi inserido
			System.out.print("Email");
			String email = sc.nextLine(); // leio o email que foi inserido
			int room = sc.nextInt(); // leio o quarto que o cliente deseja
			vect[room] = new Aluguel(name, email); // adiciona as informacoes do cliente no quarto desejado
		}
		
		System.out.println();
		System.out.println("Quartos alugados:");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) { // se a posicao[i] do vetor for nula
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
