package exercicio2;

import java.util.Scanner;

public class ProgamaPrincipal {

	public static void main(String[] args) {
		int[] num = new int[8];
		int soma = 0;
		int duplicado = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o elemento " + (i + 1) + ":");
			num[i] = entrada.nextInt();
			soma += num[i];
		}

		for (int i = 1; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] == num[j]) {
					duplicado++;
					break;

				}
			}
		}

		System.out.println("Soma: " +soma);
		System.out.println("Duplicados: " +duplicado);
		entrada.close();

	}

}
