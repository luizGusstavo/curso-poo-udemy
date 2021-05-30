package application;

import entities.AccountHeranca;
import entities.BusinessAccountHeranca;
import entities.SavingsAccountHeranca;

public class ProgramHeranca {

	public static void main(String[] args) {
		//BusinessAccountHeranca bacc = new BusinessAccountHeranca(1002, "Cadu", 0.0, 500.0);
		
		//	UPCASTING
		// SUBCLASSE USANDO A SUPERCLASSE
		// E PERMITIDO POIS EU ESTOU DIZENDO QUE UMA SUBCLASSE VAI UTILIZAR A SUPERCLASSE	
		
		//AccountHeranca acc1 = bacc;
		//AccountHeranca acc2 = new BusinessAccountHeranca(1003, "Amanda", 0.0, 200.0); // DEFINI UMA SUPER CLASSE USANDO UMA SUBCLASSE
		AccountHeranca acc3 = new SavingsAccountHeranca(1004, "Alex", 1000.0, 0.01);
		
		
		// TESTE DE POLIMORFISMO
		// RESUMINDO, SAO VARIAVEIS DO MESMO TIPO, MAS COM COMPORTAMENTOS DIFERENTES
		// NESSE CASO, VARIAVEIS DO TIPO ACCOUNT, MAS O WITHDRAW É DIFERENTE PRA CADA
		acc3.withdraw(50.0);
		
		System.out.println(acc3.getBalance());
		
		// TESTANDO A CLASSE QUE ESTA COM @Override
		//acc3.withdraw(100.0);
		//System.out.println(acc3.getBalance());
		
		// DOWNCASTING
		// SUPERCLASSE USANDO A SUBCLASSE
		// NEM SEMPRE SERA PERMITIDO, ENT FAZEMOS A VERIFICACAO UTILIZANDO O INSTANCEOF
		
		if(acc3 instanceof BusinessAccountHeranca) {
			BusinessAccountHeranca acc5 = (BusinessAccountHeranca)acc3;
			acc5.loan(200.0);
		}
		
		/*
		 * if(acc3 instanceof SavingsAccountHeranca) { SavingsAccountHeranca acc5 =
		 * (SavingsAccountHeranca)acc3; }
		 */
	}

}
