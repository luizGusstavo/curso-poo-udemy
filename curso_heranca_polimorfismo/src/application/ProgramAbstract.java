package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class ProgramAbstract {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> shape = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char c = sc.next().charAt(0);

			if (Character.compare(c, 'r') == 0) {
				System.out.print("Color (BLACK/BLUE/RED) ? ");
				Color color = Color.valueOf(sc.next());
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();

				shape.add(new Rectangle(color, width, height));

			} else if (Character.compare(c, 'c') == 0) {
				System.out.print("Color (BLACK/BLUE/RED) ? ");
				Color color = Color.valueOf(sc.next());
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();

				shape.add(new Circle(color, radius));
			}
		}

		for(Shape x : shape) {
			System.out.println("SHAPE AREAS: ");
			System.out.println(String.format("%.2f", x.area()));
		}
		sc.close();
	}

}
