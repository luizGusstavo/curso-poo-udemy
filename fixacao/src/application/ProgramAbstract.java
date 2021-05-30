package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Calculating;
import entities.IndividualPerson;
import entities.LegalPerson;

public class ProgramAbstract {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Calculating> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char character = sc.next().charAt(0);
			
				if(Character.compare(character, 'i') == 0) {
					sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Anual income: ");
					Double annualIncome = sc.nextDouble();
					System.out.print("Health expenditures: ");
					Double healthCareSpending = sc.nextDouble();
					
					list.add(new IndividualPerson(name, annualIncome, healthCareSpending));
				}else if(Character.compare(character, 'c') == 0) {
					sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Anual income: ");
					Double annualIncome = sc.nextDouble();
					System.out.print("Number of employees: ");
					Integer numberOfEmplyoees = sc.nextInt();
					
					list.add(new LegalPerson(name, annualIncome, numberOfEmplyoees));
				}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
			for(Calculating tax : list) {
				System.out.println(tax.getName() + ":" + " $ " + String.format("%.2f", tax.calculation()));
			}
			
		System.out.println();
		double sum = 0.0;
			for(Calculating tax : list) {
				sum += tax.calculation();
			}
			System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
