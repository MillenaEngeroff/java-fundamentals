package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		float soma=0;
		
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o número " + (i + 1) + ":");
			numeros.add(entrada.nextInt());
		}
		
		for (int i = 0; i <numeros.size(); i++) {
			soma+=numeros.get(i);
			
		}
		
		System.out.println("Soma dos números: " +soma);
		entrada.close();
		
	}

}
