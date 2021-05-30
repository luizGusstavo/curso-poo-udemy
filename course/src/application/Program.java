package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		/* System.out.print("Quantity: "); */
		/* int quantity = sc.nextInt(); */

		/* Product product = new Product(name, price, quantity); */
		Product product = new Product(name, price); 

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter number of products to be added in stock: ");

		int quantity = sc.nextInt();
		product.AddProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter number of products to be removed from stock: ");

		quantity = sc.nextInt();
		product.RemoveProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();

	}

}
