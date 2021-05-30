package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class ExercicioListaFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionarios> list = new ArrayList<>(); // inicio uma lista do tipo Funcionarios chamada list

		System.out.print("Quantos funcionarios serao cadastrados? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt(); // leio o valor e armazeno no id da classe Funcionarios
			
			while(hasId(list, id)) { // verifico se o id já existe na lista
				System.out.println("Id ja existe ! Por favor, tente novamente.");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Nome: "); 
			String name = sc.nextLine();// leio o valor e armazeno no name da classe Funcionarios
			System.out.print("Salario: ");
			Double salary = sc.nextDouble();// leio o valor e armazeno no salary da classe Funcionarios

			Funcionarios emp = new Funcionarios(id, name, salary); // inicio uma "variavel" cm os valores que eu li acima

			list.add(emp);	//adiciono a variavel "emp" na lista
		}
		
		System.out.println();
		System.out.print("Coloque o Id do funcionario que recebera incremento de salario: ");
		int idsalary = sc.nextInt();

		//verifico se existe algum funcionario com o id inserido
		Funcionarios emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("Nao existe funcionario com esse Id !");
		} else {
			System.out.print("Digite a porcentagem: ");
			double incremento = sc.nextDouble();
			emp.increaseSalary(incremento);// incremento o valor da porcentagem ao salario do funcionario
		}

		System.out.println();
		System.out.println("Lista de funcionarios: ");

		for (Funcionarios x : list) { // for( Tipo de dado que vou ler - nome qualquer : nome da lista ( ou qlqr outra								
			System.out.println(x);
		}
		sc.close();
	}

	public static Integer posicao(List<Funcionarios> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) // pego o id da posicao "i" e comparo com o id que foi fornecido
				return i;
		}
		return null;
	}
	
	public static boolean hasId(List<Funcionarios> list, int id) {
		//verificio se existe o Id que foi fornecido acima na lista
		Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
