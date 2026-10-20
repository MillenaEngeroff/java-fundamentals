package exemplos;

import java.util.Scanner;

public class Carros {
	public static void main(String[] args) {

		Carro[] vetCarros = new Carro[2];

		String cor, placa;
		boolean vidro;
		int numP;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < vetCarros.length; i++) {

			System.out.println("Informe o número de portas: ");
			numP = entrada.nextInt();

			System.out.println("Informe a placa: ");
			placa = entrada.nextLine();

			System.out.println("Informe a cor: ");
			cor = entrada.nextLine();

			System.out.println("Informe se tem vidro: ");
			vidro = entrada.nextBoolean();

			System.out.println();

			
			vetCarros[i]=new Carro(numP, placa, cor, vidro);
		}
		entrada.close();
		
		System.out.println("Imprimindo placas de carro");
		
		for (int i = 0; i < vetCarros.length; i++) {
		System.out.println(vetCarros[i].getPlaca());
			
		}
	}
}
