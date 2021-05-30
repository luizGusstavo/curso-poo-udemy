package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the features of trinagle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaTrianguloX = x.area();

		double areaTrianguloY = y.area();

		System.out.printf("Trinagle X area: %.4f%n", areaTrianguloX);
		System.out.printf("Trinagle Y area: %.4f%n", areaTrianguloY);

		if (areaTrianguloX > areaTrianguloY)
			System.out.println("Larger area: X");
		else
			System.out.println("Larger area: Y");
		
		sc.close();
	}
}
