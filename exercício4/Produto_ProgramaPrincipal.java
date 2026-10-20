package exercício4;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Produto[] vetProduto=new Produto [8];
		
		float soma = 0;
		int aux = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < vetProduto.length; i++) {
			vetProduto[i]=new Produto();
			
			System.out.println("Informe o nome do produto: ");
			vetProduto[i].setNome(entrada.nextLine());
			System.out.println("Informe o preço do produto: ");
			vetProduto[i].setPreco(entrada.nextFloat());
			entrada.nextLine();
		}

		for (int i = 1; i < vetProduto.length; i++) {
			soma += vetProduto[i].getPreco(8);
			if (vetProduto[i].getPreco(8)> vetProduto[i].getPreco(aux)) {
				aux = i;
			}

		}
		System.out.println("Total dos produtos: "+soma);
		System.out.println("Nome do maior produto: "+vetProduto[aux].getNome());
		
		entrada.close();
	}

}
