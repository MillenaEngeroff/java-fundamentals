package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {

		ArrayList<String> filmes = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Informe o nome do filme: ");
			filmes.add(entrada.nextLine());
		}
		
		System.out.println("Informe o nome do filme que deseja encontrar: ");
		String busca = entrada.nextLine();
		
		if (filmes.contains(busca)) {
			
			System.out.println("Filme encontrado!");
		} else {
			System.out.println("Filme NÃO encontrado :(");
		}
		
		entrada.close();
	}

}
