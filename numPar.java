package exercicio1;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		float[] num = { 7, 8, 9, 10, 11, 12, 13 };
		float soma = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			soma += num.length;
		}

		float media = soma / num.length;

		
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+media);
	}

}
