package application;

import java.util.Scanner;

public class ExercicioMatrizDois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt(); // ler a quantidade de numeros de uma linha na matriz
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(x == matriz[i][j]) {
					System.out.println("Posicao: " + i + " : " + j);
					if(j > 0)
						System.out.println("Left: " + matriz[i][j - 1]);
					if(j < matriz[i].length - 1)
						System.out.println("Right: " + matriz[i][j + 1]);
					if(i > 0)
						System.out.println("Up: " + matriz[i - 1][j]);
					if(i < matriz.length - 1)
					System.out.println("Down: " + matriz[i + 1][j]);
				}
			}
		}
	}

}
