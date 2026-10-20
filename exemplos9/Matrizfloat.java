package exemplos;

import java.util.Scanner;

public class Matrizfloat {
	public static void main(String[] args) {

		float[][] matNotas = new float[5][3];
		
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 0; i < matNotas.length; i++) {
			
			System.out.println("--> Informe as notas do aluno " +(i+1)+ " <--");
			
			
			for (int j = 0; j < matNotas[i].length; j++) {
				System.out.print("Informe a nota aluno "+(j+1)+ ":" );
				matNotas[i][j]=entrada.nextFloat();
				
				
			}
			
			System.out.println();
			
		}

		entrada.close();
	}
}
