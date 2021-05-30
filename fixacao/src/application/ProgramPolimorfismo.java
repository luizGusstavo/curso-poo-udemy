package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramPolimorfismo {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		Integer n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char especification = sc.next().charAt(0);
				if(Character.compare(especification, 'i') == 0) {
					sc.nextLine();
					System.out.print("Name: ");
					String nameProduct = sc.nextLine();
					System.out.print("Price:  ");
					Double priceProduct = sc.nextDouble();
					System.out.print("Customs fee: ");
					Double priceAlfandegaProduct = sc.nextDouble();
					
					list.add(new ImportedProduct(nameProduct, priceProduct, priceAlfandegaProduct));				
				}else if(Character.compare(especification, 'c') == 0) {
					sc.nextLine();
					System.out.print("Name: ");
					String nameProduct = sc.nextLine();
					System.out.print("Price:  ");
					Double priceProduct = sc.nextDouble();
					
					list.add(new Product(nameProduct, priceProduct));

				}else {
					sc.nextLine();
					System.out.print("Name: ");
					String nameProduct = sc.nextLine();
					System.out.print("Price:  ");
					Double priceProduct = sc.nextDouble();
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					
					Date date = sdf.parse(sc.next());
					
					list.add(new UsedProduct(nameProduct, priceProduct, date));
				}
		}
		System.out.println();
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}

}
