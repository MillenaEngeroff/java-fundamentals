package exercício3;

import java.util.Scanner;

public class ProjetoPrincipal {
	public static void main(String[] args) {
		
		String[] nomes=new String [3];
		float []notas=new float [3];
		int aux=0;
		
		Scanner entrada=new Scanner (System.in);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe seu nome: ");
			nomes[i]=entrada.nextLine();
		
			System.out.println("Informe a nota do aluno: ");
			notas[i]=entrada.nextFloat();
		}
		
		for (int i=1; i<notas.length;i++) {
			
			if (notas[i]>notas[aux]) {
				aux=i;
			}
			}
			
		System.out.println("Maior nota: " +notas[aux]);
		System.out.println("Nome do aluno: " +nomes[aux]);
		
		entrada.close();
		}		
	}


