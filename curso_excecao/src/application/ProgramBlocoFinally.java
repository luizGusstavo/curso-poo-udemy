package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramBlocoFinally {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Luiz Gustavo\\Desktop\\autoescola.txt");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file); // aponto para o arquivo que eu citei
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
		}
		catch(FileNotFoundException excecao) {
			System.out.println("Error opening file: " + excecao.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
