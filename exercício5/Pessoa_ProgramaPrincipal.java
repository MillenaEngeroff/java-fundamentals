package exercício5;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Pessoa[] vetPessoas = new Pessoa[5];

		Scanner entrada = new Scanner(System.in);

		int aux = 0;

		for (int i = 0; i < vetPessoas.length; i++) {
		
			System.out.println("Informe o nome da pessoa: ");
			vetPessoas[i].setNome(entrada.nextLine());

			System.out.println("Informe o cpf da pessoa: ");
			vetPessoas[i].setCpf(entrada.nextLine());

			System.out.println("Informe a idade da pessoa: ");
			vetPessoas[i].setIdade(entrada.nextInt());
			entrada.nextLine();
			
		}

		for (int i = 0; i < vetPessoas.length; i++) {

			if (vetPessoas[i].getIdade() <= vetPessoas[aux].getIdade()) {
				aux = i;
			}

		}
		System.out.println("Nome da pessoa mais nova: " + vetPessoas[aux].getNome());
		System.out.println("Idade da pessoa mais nova: " + vetPessoas[aux].getIdade());

		entrada.close();
	}
}
