package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramLista {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // List é uma interface, por isso é necessario a importação da classe ArrayList
		
		list.add("Gustavo"); // comando para adicionar elementos na lista
		list.add("Cadu");
		list.add("Amanda");
		list.add("Alex");
		
		list.add(2, "Paçoca"); // comando para adicionar elementos em uma determinada posição da lista
		
		System.out.println(list.size()); // retorna o tamanho da lista
		
		for(String x : list) { // for( Tipo de dado que vou ler - nome qualquer : nome da lista ( ou qlqr outra coisa ))
			System.out.println(x);
		}
		
		System.out.println("----------------");
		
		// list.remove(1); // remove o elemento na posicao 1
		
		list.removeIf(x -> x.charAt(0) == 'A'); // se o primeiro String for a letra A, remover da lista
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		
		System.out.println("Index of Gustavo: " + list.indexOf("Gustavo")); // retorna a posicao em que Gustavo se encontra na lista
		
		System.out.println("----------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // retorna uma lista apenas com os nomes que comecam com a letra A
	
		for(String x : result) {
			System.out.println(x);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // retorna o primeiro nome da lista que comeca com a letra A, caso n exista retorna Null
		System.out.println(name);
	}

}
