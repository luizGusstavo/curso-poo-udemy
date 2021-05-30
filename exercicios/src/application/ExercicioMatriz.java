 package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		int n = sc.nextInt();
		int [][] matriz = new int[n][n]; //instancia uma matriz
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt(); // ler a quantidade de numeros de uma linha na matriz
			}
		}
		
		System.out.println("Diag: ");
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " "); // exibe a diagonal principal da matriz
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				if(matriz[i][j] < 0) {
					count++; // conta quantos numeros negativos existem na matriz
				}
			}
		}
		System.out.println("Numeros negativos: " + count);
	}

}
