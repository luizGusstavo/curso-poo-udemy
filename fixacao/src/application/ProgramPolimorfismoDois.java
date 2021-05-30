package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;
import entities.Product;

public class ProgramPolimorfismoDois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		System.out.println();
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee # " + i + " data: ");
			System.out.print("Outsourced (y/n) ? ");
			
			char especification = sc.next().charAt(0);
			
			if(Character.compare(especification, 'y') == 0) {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hour = sc.nextInt();
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				
				employee.add(new OutSourcedEmployee(name, hour, valuePerHour, additionalCharge));
				
			}else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hour = sc.nextInt();
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				
				employee.add(new Employee(name, hour, valuePerHour));
			}
		}		
		System.out.println();
		for (Employee emp : employee) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
	}

}
