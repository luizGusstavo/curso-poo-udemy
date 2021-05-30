package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExcecao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		method1();
	}
	
	public static void method1() {
		System.out.println("METHOD 1 START");
		method2();
		System.out.println("METHOD 1 END");
	}
	
	public static void method2() {
		System.out.println("METHOD 2 START");
		Scanner sc = new Scanner(System.in);
		String[] vect = sc.nextLine().split(" "); // ler todos os valores separados por espaço
		int position = 0;
		
		try {
			position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException excecao) {
			excecao.printStackTrace();
			 do {
				 System.out.println("O vector consta com " + (vect.length - 1) + " posicoes, por favor, escolha uma valida: ");
				 position = sc.nextInt();
			 }while(position > vect.length);
			 
			 System.out.println(vect[position]);
			 System.out.println();
			 System.out.println("End of program !");
		}
		catch (InputMismatchException excecao1) {
			excecao1.printStackTrace();// exibe toda a pilha de erro
				System.out.println("ERROR !");
				System.out.println("Voce nao inseriu um valor inteiro, por favor, tente novamente.");
		}
		System.out.println("METHOD 2 END");
		sc.close();
	}

}
